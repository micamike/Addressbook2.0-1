package com.telran.trello.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper  extends  HelperBase{
  public SessionHelper(WebDriver wd) {
    super(wd);
  }
  public void login(String user, String password) {
    click(By.cssSelector("[href='/login?returnUrl=%2F']"));
    type(By.id("user"), user);
    type(By.id("password"), password);
    click(By.id("login"));
  }
}
