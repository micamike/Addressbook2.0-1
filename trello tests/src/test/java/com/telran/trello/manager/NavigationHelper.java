package com.telran.trello.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void openSite(String url) {
    wd.navigate().to(url);
  }

  public void openHomePage() {
    click(By.cssSelector("span.header-btn-icon icon-lg icon-house light"));
  }

  public void openGroupsPage() {
    click(By.cssSelector("[href='group.php']"));
  }
}
