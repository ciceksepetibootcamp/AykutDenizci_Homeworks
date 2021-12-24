package Steps;

import Base.BasePage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Constants.Constants.*;

public class Steps extends BasePage {

    @Step("Sana gelsin menüsü seçildi")
    public void clickSanaGelsin(){
        click(NO_THANKS);
        click(SANA_GELSIN);
    }
    @Step("Gel al menüsü seçildi")
    public void clickGelAl(){
        click(NO_THANKS);
        click(GEL_AL);
        click(NO_THANKS);
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(RESTAURANT,"Şu an bulunduğun konumun çevresindeki restoranlar")));

    }
    @Step("Listelenen Burger restoranlardan rasgele seçildi")
    public void randomBurgerSelect(){
        swipeRandom();
        randomClick(BURGER_REST);
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(MENU_ASSERT,"Popüler Ürünler")));

    }
    @Step("Restoranların listelendiği kontrol edildi")
    public void assertRestaurant(){
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(RESTAURANT,"Sipariş vermek için restoran seç")));
    }
    @Step("Rasgele restoran seçildi")
    public void randomRest(){
        swipeRandom();
        randomClick(RESTAURANT_LIST);
    }
    @Step("Rasgele menü seçildi")
    public void randomMenu(){
        swipeRandom();
        randomClick(MENU_LIST);
    }
    @Step("Fiyatlar kontrol edildi")
    public void checkPrice(){
        Assert.assertEquals(findElement(PRODUCT_PRICE).getText(),findElement(BASKET_PRICE).getText());
    }
    @Step("Ürün sepete eklendi ve sepete gidildi")
    public void goToBasket(){
        click(ADD_BASKET);
        waitSeconds(5);
        click(GO_TO_BASKET);
        waitSeconds(2);
    }
    @Step("Ödeme sayfasına gidilip sepete geri dönüldü")
    public void goToPayment(){
        click(PAYMENT_PAGE);
        click(CANCEL_MASTERPASS);
        click(BACK_TO_BASKET);
    }
    @Step("Sepet temizlendi")
    public void cleanBasket(){
        click(CLEAN_BASKET);
        click(CLEAN_ACCEPT);
    }
}
