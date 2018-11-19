package com.telran.trello.tests;


import com.telran.trello.model.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {

    @Test
    public void CreationTestUsingPlusButton() throws InterruptedException {

        int before = app.getBoardHelper().getBoardCount();
        System.out.println(before);
        app.getBoardHelper().initBoardCreation();
        app.getBoardHelper().fillBoardForm(new Board().setTitle("TEST BOARD"));
        app.getBoardHelper().confirmBoardCreation();

        int after = app.getBoardHelper().getBoardCount();
        System.out.println(after);
        Assert.assertEquals(after,before+1);

    }
}
