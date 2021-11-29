package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Constants.OyuncakConstants.*;


public class OyuncakPage extends BasePage {
    public OyuncakPage(WebDriver driver) {
        super(driver);
    }

    public void goOyuncakUrl() {
        goUrl(OYUNCAK_URL);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("oyuncak"));
    }
    public OyuncakPage clickEgiticiOyuncak() {
        click(EGITICI_OYUNCAK);
        waitBySeconds(6);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("egitici-oyuncaklar"));
        return this;
    }
    public OyuncakPage clickKapat() {
        waitBySeconds(6);
        click(KAPAT);
        return this;
    }
    public OyuncakPage clickUcretsizKargo() {
        waitBySeconds(6);
        click(UCRETSIZ_KARGO);
        return this;
    }
    public OyuncakPage clickUcretsizKargoButton() {
        click(UCRETSIZ_KARGO_BUTTON);
        waitBySeconds(6);
        return this;
    }
    public OyuncakPage clickKaydetButonu() {
        click(SAVE_BUTTON);
        waitBySeconds(6);
        return this;
    }
    public OyuncakPage clickOyunHamurlari() {
        click(OYUN_HAMURLARI);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("oyun-hamurlari"));
        return this;
    }
    public OyuncakPage clickFavori() {
        randomClick(FAVORI_BUTONU);
        return this;
    }


}
