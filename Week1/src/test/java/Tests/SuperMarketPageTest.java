package Tests;

import Base.BaseTest;
import Pages.SuperMarketPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Constants.SuperMarketConstants.SEPETIM;

public class SuperMarketPageTest extends BaseTest {
    SuperMarketPage superMarketPage;

    @Before
    public void beforeTest() {
        superMarketPage = new SuperMarketPage(getDriver());
        superMarketPage.goUrl();
    }

    @Test
    public void filterByPrice() {
        superMarketPage.clickKapat().changePriceFilter();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("10-100"));
    }

    @Test
    public void addToBasket() {
        superMarketPage.clickKapat().clickPil().clickUrun().clickSepeteEkle();
        Assert.assertEquals("Sepetim", driver.findElement(SEPETIM).getText());
    }


}
