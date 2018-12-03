import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;


public class FirstSimpleTest extends TestBase {

    @Test
    public void ListOfInteraction() throws InterruptedException {

        openSite("https://jqueryui.com");

        List<WebElement> interaction = wd.findElements(By.xpath("//div[@id='sidebar']//aside[1]"));

       for (int i = 0; i <= interaction.size()- 1; i++) {




        }
    }



    @Test
    public void searchTestWithEnter(){
        openSite("https://jqueryui.com");
        type(By.name("s"), "button" + Keys.ENTER);
        //proceedToSearchClickEnter();

        String actualText = wd.findElement(By.cssSelector("h1 span")).getText().toLowerCase();
        System.out.println(actualText);

        Assert.assertEquals(actualText,"button");
    }

    @Test
    public void SearchTestWithLoupe(){
        openSite("https://jqueryui.com");
        type(By.name("s"), "button");
        proceedToSearch();

        String actualText = wd.findElement(By.cssSelector("h1 span")).getText().toLowerCase();
        System.out.println(actualText);

        Assert.assertEquals(actualText,"button");
    }

}
