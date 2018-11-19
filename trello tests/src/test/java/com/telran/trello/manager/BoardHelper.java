package com.telran.trello.manager;


import com.telran.trello.model.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase{

  public BoardHelper(WebDriver wd) {
    super(wd);
  }

  public void confirmBoardCreation() {
    click(By.cssSelector("button[type=submit]"));
  }

  public void fillBoardForm(Board board) {
    type(By.cssSelector("input.subtle-input"),board.getTitle());
  }

  public void initBoardCreation() throws InterruptedException {
    Thread.sleep(3000);
    click(By.cssSelector("a.js-open-add-menu"));
    click(By.cssSelector("a.js-new-board"));
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

  public void createBoard() throws InterruptedException {
    initBoardCreation();
    fillBoardForm(new Board().setTitle("BoardTest55"));
    confirmBoardCreation();
  }

  public void selectContactByIndex(int i) {
    wd.findElements(By.name("selected[]")).get(i).click();
  }

  public boolean isOnTheHomePage(){return isElementPresent(By.id("maintable"));}

  public int getBoardCount() {
    return wd.findElements(By.cssSelector("boards-page-board-section-list")).size();
  }
}
