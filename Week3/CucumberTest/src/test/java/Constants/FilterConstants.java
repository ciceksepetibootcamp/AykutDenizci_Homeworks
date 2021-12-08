package Constants;

import org.openqa.selenium.By;

public class FilterConstants {
    public static final String URL = "https://amazon.com.tr";
    public static final By SEARCH_BAR = By.id("twotabsearchtextbox");
    public static final By SEARCH_BUTTON = By.id("nav-search-submit-button");
    public static final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    public static final By LOW_PRICE = By.id("low-price");
    public static final By HIGH_PRICE = By.id("high-price");
    public static final By FILTER_BUTTON = By.xpath("(//span[@class='a-button-inner'])[2]");
    public static final By PRODUCT_PRICE_LIST = By.xpath("//span[@class='a-price-whole']");

}
