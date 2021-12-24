package Pages;

import Base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static Constants.Constants.*;

public class GelAlPages extends BasePage {

    public GelAlPages(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }

    public GelAlPages clickGelAl() {
        click(NO_THANKS);
        click(GEL_AL);
        click(NO_THANKS);
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(RESTAURANT, "Şu an bulunduğun konumun çevresindeki restoranlar")));
        return this;
    }

    public GelAlPages randomBurgerSelect() {
        swipeRandom();
        randomClick(BURGER_REST);
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(MENU_ASSERT, "Popüler Ürünler")));
        return this;
    }

    public GelAlPages assertRestaurant() {
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(RESTAURANT, "Sipariş vermek için restoran seç")));
        return this;
    }

    public GelAlPages randomRest() {
        swipeRandom();
        randomClick(RESTAURANT_LIST);
        return this;
    }

    public GelAlPages randomMenu() {
        swipeRandom();
        randomClick(MENU_LIST);
        return this;
    }

    public GelAlPages checkPrice() {
        Assert.assertEquals(findElement(PRODUCT_PRICE).getText(), findElement(BASKET_PRICE).getText());
        return this;
    }

    public GelAlPages goToBasket() {
        click(ADD_BASKET);
        waitSeconds(5);
        click(GO_TO_BASKET);
        waitSeconds(2);
        return this;
    }

    public GelAlPages goToPayment() {
        click(PAYMENT_PAGE);
        click(CANCEL_MASTERPASS);
        click(BACK_TO_BASKET);
        return this;
    }

    public GelAlPages cleanBasket() {
        click(CLEAN_BASKET);
        click(CLEAN_ACCEPT);
        return this;
    }
}
