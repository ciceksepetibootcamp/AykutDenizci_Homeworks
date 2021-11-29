package Constants;

import org.openqa.selenium.By;

public class SuperMarketConstants {
    public static final String SUPERMARKET_URL = "https://www.ciceksepeti.com/supermarket";
    public static final By FIYAT_BUTTON = By.xpath("//a[contains(text(),'Fiyat')]");
    public static final By MIN_PRICE = By.xpath("//input[@data-filterId='min-price']");
    public static final By MAX_PRICE = By.xpath("//input[@data-filterId='max-price']");
    public static final By FILTRE_ONAY = By.xpath("//span[@class='icon-right-arrow']");
    public static final By PIL = By.xpath("//span[@alt='Pil']");
    public static final By URUN = By.xpath("//img[@class='products__item-img lazyloaded']");
    public static final By SEPETE_EKLE = By.xpath("//span[text()='Sepete Ekle']");
    public static final By SEPETIM = By.xpath("//h2[@class='cart__title']");

}
