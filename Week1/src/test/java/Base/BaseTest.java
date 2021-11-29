package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("95");
        options.setPlatformName("Windows");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-fullscreen");
        WebDriverManager.chromedriver().setup();
        setDriver(new ChromeDriver(options));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
        driver.manage().window().fullscreen();

    }
    @After
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BaseTest.driver = driver;
    }
}
