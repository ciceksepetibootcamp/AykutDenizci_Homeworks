package Pages;

import Base.BasePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static Constants.Constants.*;

public class SanaGelsinPage extends BasePage {

    public SanaGelsinPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }


    public SanaGelsinPage clickSanaGelsin() {
        click(NO_THANKS);
        click(SANA_GELSIN);
        return this;
    }


    public SanaGelsinPage assertRestaurant() {
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(RESTAURANT, "Sipariş vermek için restoran seç")));
        return this;
    }

    public SanaGelsinPage randomRest() {
        swipeRandom();
        randomClick(RESTAURANT_LIST);
        return this;
    }

    public SanaGelsinPage randomMenu() {
        swipeRandom();
        randomClick(MENU_LIST);
        return this;
    }

    public SanaGelsinPage checkPrice() {
        Assert.assertEquals(findElement(PRODUCT_PRICE).getText(), findElement(BASKET_PRICE).getText());
        return this;
    }

    public SanaGelsinPage goToBasket() {
        click(ADD_BASKET);
        waitSeconds(5);
        click(GO_TO_BASKET);
        waitSeconds(2);
        return this;
    }

    public SanaGelsinPage goToPayment() {
        click(PAYMENT_PAGE);
        click(CANCEL_MASTERPASS);
        click(BACK_TO_BASKET);
        return this;
    }

    public SanaGelsinPage cleanBasket() {
        click(CLEAN_BASKET);
        click(CLEAN_ACCEPT);
        return this;
    }
}
