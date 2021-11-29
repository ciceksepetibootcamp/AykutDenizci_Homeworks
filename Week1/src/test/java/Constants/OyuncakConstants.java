package Constants;

import org.openqa.selenium.By;

public class OyuncakConstants {
    public static final String OYUNCAK_URL = "https://www.ciceksepeti.com/hediye-oyun-oyuncak";
    public static final By EGITICI_OYUNCAK = By.xpath("//a[@href='egitici-oyuncaklar']");
    public static final By OYUN_HAMURLARI = By.xpath("//a[@href='oyun-hamurlari']");
    public static final By FAVORI_BUTONU = By.xpath("//span[@class='icon-favorite-border js-stop-productClick-event']");
    public static final By GIRIS = By.className("login__heading");
    public static final By KAPAT = By.xpath("//span[@class='icon-close']");
    public static final By UCRETSIZ_KARGO = By.xpath("//a[contains(text(),'Ücretsiz Kargo')]");
    public static final By UCRETSIZ_KARGO_BUTTON = By.xpath("//div[@data-filtertype='freecargo']");
    public static final By SAVE_BUTTON = By.xpath("(//button[text()='Kaydet'])[2]");
}
