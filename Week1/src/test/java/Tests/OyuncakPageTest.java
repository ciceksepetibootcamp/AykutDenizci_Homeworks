package Tests;

import Base.BaseTest;
import Pages.OyuncakPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Constants.OyuncakConstants.GIRIS;

public class OyuncakPageTest extends BaseTest {
    OyuncakPage oyuncakPage;

    @Before
    public void beforeTest() {
        oyuncakPage = new OyuncakPage(getDriver());
        oyuncakPage.goOyuncakUrl();
    }

    @Test
    public void clickFavouriteWithoutSignIn() {
        oyuncakPage.clickKapat().clickEgiticiOyuncak().clickOyunHamurlari().clickFavori();
        Assert.assertEquals("Giriş", driver.findElement(GIRIS).getText());
    }

    @Test
    public void filterByFreeCargo() {
        oyuncakPage.clickKapat().clickUcretsizKargo().clickUcretsizKargoButton().clickKaydetButonu();
        Assert.assertTrue(driver.getCurrentUrl().contains("freecargo"));
    }


}
