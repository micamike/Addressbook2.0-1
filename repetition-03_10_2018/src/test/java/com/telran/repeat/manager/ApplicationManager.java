package com.telran.repeat.manager;

import com.telran.repeat.tests.MyListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  EventFiringWebDriver wd;
  private SessionHelper sessionHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private NavigationHelper navigationHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void start() {

    if(browser.equals(BrowserType.CHROME)){wd = new EventFiringWebDriver(new ChromeDriver());}
    else if(browser.equals(BrowserType.FIREFOX)){wd = new EventFiringWebDriver (new FirefoxDriver());}
    else if(browser.equals(BrowserType.EDGE)){wd = new EventFiringWebDriver(new EdgeDriver());}

    wd.register(new MyListener());

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    navigationHelper = new NavigationHelper(wd);
    navigationHelper.openSite("http://localhost/addressbook/");

    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");

    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);

  }



  public void stop() {
    wd.quit();
  }

  //__________________________________________________________________


  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}
