package Constants;

import org.openqa.selenium.By;

public class BasketConstants {
    public static final String URL = "https://amazon.com.tr";
    public static final By BURGER_MENU = By.id("nav-hamburger-menu");
    public static final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    public static final By PRODUCT_LIST = By.cssSelector(".a-section.a-spacing-mini");
    public static final By ADD_BASKET = By.id("add-to-cart-button");
    public static final By FINISH_SHOPPING =By.id("hlb-ptc-btn-native");
    public static final By GO_BASKET = By.id("hlb-view-cart-announce");
    public static final By DELETE_PRODUCT=By.xpath("//input[@value='Sil']");
}
