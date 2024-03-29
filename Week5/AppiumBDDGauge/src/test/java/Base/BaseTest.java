package Base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static AppiumDriver<MobileElement> appiumDriver;
    protected static WebDriverWait appiumWait;

    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities
                .setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities
                .setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                        "com.ataexpress.tiklagelsin");
        desiredCapabilities
                .setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                        "com.ataexpress.tiklagelsin.MainActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities
                .setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities
                .setCapability(MobileCapabilityType.FULL_RESET, false);

        desiredCapabilities.setCapability("autoDismissAlerts", true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AndroidDriver(url, desiredCapabilities);
        appiumWait = new WebDriverWait(appiumDriver,20);
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterScenario
    public void afterScenario() {
        if(appiumDriver != null)
            appiumDriver.quit();
    }
}
