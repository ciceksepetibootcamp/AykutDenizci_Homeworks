package Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMillis;

public class BasePage extends BaseTest{
    public AndroidDriver<MobileElement> appiumDriver;
    public WebDriverWait appiumWait;

    public BasePage (AndroidDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.appiumWait = new WebDriverWait(appiumDriver, 20);
    }
    public MobileElement findElement(By by){
        appiumWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return appiumDriver.findElement(by);
    }
    public void click(By by){
        findElement(by).click();
    }
    public List<MobileElement> findElements(By by){
        appiumWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return appiumDriver.findElements(by);
    }
    public void randomClick(By by){
        Random random = new Random();
        findElements(by).get(random.nextInt(findElements(by).size())).click();
    }
    public void swipeRandom(){
        Random rnd = new Random();
        for (int i = 0; i < rnd.nextInt(4); i++) {
            Dimension d = appiumDriver.manage().window().getSize();
            int height = d.height;
            int width = d.width;

            int swipeStartWidth = width / 2, swipeEndWidth = width / 2;
            int swipeStartHeight = (height * 70) / 100;
            int swipeEndHeight = (height * 30) / 100;
            //appiumDriver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);
            new TouchAction(appiumDriver)
                    .press(PointOption.point(swipeStartWidth, swipeEndHeight))
                    .waitAction(WaitOptions.waitOptions(ofMillis(2000)))
                    .moveTo(PointOption.point(swipeEndWidth, swipeStartHeight))
                    .release()
                    .perform();}
    }
    public void waitSeconds(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
