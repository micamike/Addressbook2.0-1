package com.telran.repeat.manager;

import com.telran.repeat.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void confirmContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(Contact contact) {
    type(By.name("firstname"), contact.getfName());
    type(By.name("lastname"), contact.getlName());
    type(By.name("address"), contact.getAddress());
    type(By.name("email"), contact.getEmail());
    type(By.name("home"), contact.getPhoneHome());
  }

  public void initContactCreation() {
    click(By.xpath("//a[@href='edit.php']"));
  }

  public void confirmAlert() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact() {
    click(By.cssSelector("[onclick='DeleteSel()']"));
  }
  //*[@onclick='DeleteSel()']

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.cssSelector("[title=EDIT]"));
  }

  public void confirmContactModification() {
    click(By.name("update"));  }

  public boolean isContactPresent() {
    return isElementPresent(By.name("selected[]"));
  }

  public void createContact() {
    initContactCreation();
    fillContactForm(new Contact().setlName("Haim").setfName("Moshe").setAddress("Israel").setEmail("HM@hotmail.com").setPhoneHome("050555555"));
    confirmContactCreation();
  }

  public void selectContactByIndex(int i) {
    wd.findElements(By.name("selected[]")).get(i).click();
  }

  public boolean isOnTheHomePage(){return isElementPresent(By.id("maintable"));}

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
