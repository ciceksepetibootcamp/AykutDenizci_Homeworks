package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public abstract class BasePage{

    private WebDriver driver = BaseTest.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public void goUrl(String url){
        driver.get(url);
    }
    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(by));
        return driver.findElement(by);
    }
    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void sendKeys(By by, String text){
        click(by);
        findElement(by).sendKeys(text);
    }
    public void hover(By by){
        Actions action = new Actions(driver);
        action.moveToElement(findElement(by)).build().perform();
    }
    public List<WebElement> findElements(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }
    public void randomPick(By by){
        Random random = new Random();
        findElements(by).get(random.nextInt(findElements(by).size())).click();
    }
}

