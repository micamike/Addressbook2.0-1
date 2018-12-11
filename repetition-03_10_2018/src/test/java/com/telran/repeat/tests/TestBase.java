package com.telran.repeat.tests;

import com.telran.repeat.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

  protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser",BrowserType.CHROME));

  Logger logger = LoggerFactory.getLogger(TestBase.class);

  @BeforeSuite
  public void setUp(){
    app.start();
  }
  @AfterSuite
  public  void tearDown(){
    app.stop();
  }

  @BeforeMethod(alwaysRun = true)
  public void startLog(Method m){
    logger.info("Start test method" + m.getName());
  }

  @AfterMethod(alwaysRun = true)
  public void stopLog(Method m){
    logger.info("Stop test method" + m.getName());
  }

}
