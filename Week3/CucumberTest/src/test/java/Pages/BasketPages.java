package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

import static Constants.BasketConstants.*;


public class BasketPages extends BasePage {
    public BasketPages goUrl() {
        goUrl(URL);
        return this;
    }

    public BasketPages clickBurgerMenu() {
        click(BURGER_MENU);
        return this;
    }

    public void clickBestSeller(String message) {
        click(By.xpath("(//a[text()='" + message + "'])[2]"));
    }

    public void acceptCookies() {
        click(ACCEPT_COOKIES);
    }

    public void pickRandom() {
        randomPick(PRODUCT_LIST);
    }

    public BasketPages addBasket() {
        click(ADD_BASKET);
        return this;
    }

    public void finishShopping() {
        click(FINISH_SHOPPING);
    }

    public void goToBasket() {
        click(GO_BASKET);
    }

    public void deleteProduct() {
        click(DELETE_PRODUCT);
    }

}
