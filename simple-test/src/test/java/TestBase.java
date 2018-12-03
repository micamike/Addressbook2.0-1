import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void setUP(){
        wd = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        wd.quit();
    }

    public void proceedToSearchClickEnter() {
        wd.findElement(By.cssSelector(".icon-search")).sendKeys(Keys.ENTER);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void proceedToSearch() {
        click(By.cssSelector(".icon-search"));
    }
}
