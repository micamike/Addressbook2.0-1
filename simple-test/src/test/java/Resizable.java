import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable extends TestBase {

    @Test
    public void testResizable(){
        wd.navigate().to("http://localhost/tests/resize.html");

        WebElement ResizeBtn = wd.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        new Actions(wd).clickAndHold(ResizeBtn).moveByOffset(150,321).perform();
    }
}
