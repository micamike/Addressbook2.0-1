package com.telran.repeat.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends AbstractWebDriverEventListener {
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Search : " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println(by + " found");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println(throwable);
        logger.error("");
        logger.error(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        logger.error("Error:   "+ throwable);
        logger.error(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        logger.error("");
    }
}
