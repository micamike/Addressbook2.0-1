package com.telran.repeat.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class HelperBase {
  WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  public void type(By locator, String text) {
    if(text != null) {
      wd.findElement(locator).click();
      wd.findElement(locator).clear();
      wd.findElement(locator).sendKeys(text);
    }
  }

  public void attach(By locator, File file) {
    if(file != null) {
      wd.findElement(locator).sendKeys(file.getAbsolutePath());
    }
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
