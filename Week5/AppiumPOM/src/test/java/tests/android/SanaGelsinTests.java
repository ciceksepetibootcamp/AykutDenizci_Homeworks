package tests.android;

import org.testng.annotations.Test;
import Pages.SanaGelsinPage;
import Base.BaseTest;

public class SanaGelsinTests extends BaseTest {

    @Test
    public void sanaGelsinTest()  {
        SanaGelsinPage sanaGelsinPage = new SanaGelsinPage(appiumDriver);
        sanaGelsinPage.clickSanaGelsin().assertRestaurant().randomRest().randomMenu()
                      .checkPrice().goToBasket().goToPayment().cleanBasket();
    }

}
