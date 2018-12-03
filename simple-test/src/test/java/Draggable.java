import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable extends TestBase {

    @Test
    public void testDraggable(){
        wd.get("http://localhost/tests/drag.html");
        WebElement Box = wd.findElement(By.id("draggable"));
        new Actions(wd).moveToElement(Box).clickAndHold().moveByOffset(100,100).release().perform();

    }

}
