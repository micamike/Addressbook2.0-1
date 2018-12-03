import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Droppable extends TestBase{

    @Test
    public void testDroppable(){
        wd.navigate().to("http://localhost/tests/drop.html");

        WebElement box = wd.findElement(By.id("draggable"));
        WebElement target = wd.findElement(By.id("droppable"));

        new Actions(wd).dragAndDrop(box,target).release().perform();
    }
}
