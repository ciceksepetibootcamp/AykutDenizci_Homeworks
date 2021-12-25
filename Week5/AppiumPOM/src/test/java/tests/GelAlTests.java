package tests.android;

import Base.BaseTest;
import Pages.GelAlPages;
import org.testng.annotations.Test;

public class GelAlTests extends BaseTest {
    @Test
    public void gelAlTest()  {
        GelAlPages gelAlPages = new GelAlPages(appiumDriver);
        gelAlPages.clickGelAl().randomBurgerSelect().assertRestaurant().randomRest()
                .randomMenu().checkPrice().goToBasket().goToPayment().cleanBasket();
    }

}
