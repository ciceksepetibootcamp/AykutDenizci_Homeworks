package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BasePage extends BaseTest {
    WebDriver driver;
    WebDriverWait webDriverWait ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void goUrl(String url){
        driver.get(url);
    }
    public WebElement findElement(By by){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }
    public void waitBySeconds(int second){
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void click(By by){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

   public List<WebElement> findElements(By by){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElements(by);
   }
   public void randomClick(By by){
        Random random = new Random();
        findElements(by).get(random.nextInt(findElements(by).size())).click();
   }

}
