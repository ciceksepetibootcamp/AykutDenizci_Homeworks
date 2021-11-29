package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Constants.OyuncakConstants.KAPAT;
import static Constants.SuperMarketConstants.*;


public class SuperMarketPage extends BasePage {
    public SuperMarketPage(WebDriver driver) {
        super(driver);
    }

    public void goUrl() {
        goUrl(SUPERMARKET_URL);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("supermarket"));
    }
    public void changePriceFilter() {
        click(FIYAT_BUTTON);
        sendKeys(MIN_PRICE, "10");
        sendKeys(MAX_PRICE, "100");
        click(FILTRE_ONAY);
        waitBySeconds(5);
    }
    public SuperMarketPage clickKapat() {
        waitBySeconds(5);
        click(KAPAT);
        waitBySeconds(5);
        return this;
    }
    public SuperMarketPage clickPil() {
        click(PIL);
        return this;
    }
    public SuperMarketPage clickUrun() {
        randomClick(URUN);
        waitBySeconds(5);
        return this;
    }
    public void clickSepeteEkle() {
        click(SEPETE_EKLE);
        waitBySeconds(5);
    }


}
