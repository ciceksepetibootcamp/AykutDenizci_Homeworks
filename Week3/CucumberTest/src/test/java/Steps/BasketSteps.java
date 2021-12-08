package Steps;


import Pages.BasketPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;



public class BasketSteps extends BasketPages {

    @Given("Amazon adresine gidildi")
    public void goToAmazon(){
        goUrl().acceptCookies();
    }

    @Given("{string} bölümüne gidildi")
    public void goToProductPage(String string){
        clickBurgerMenu().clickBestSeller(string);
    }

    @When("Rastgele bir ürüne tıklandı")
    public void pickRandomProduct(){
       pickRandom();
    }

    @Then("Giriş sayfasında olduğumuz kontrol edildi")
    public void checkSignInPage(){
        Assert.assertTrue(findElement(By.xpath("//h1[@class='a-spacing-small']")).getText().contains("Giriş yap"));

    }

    @And("Alışveriş tamamlandı")
    public void addToBasket() {
        addBasket().finishShopping();
    }

    @And("Sepete gidildi")
    public void sepetei() {
        addBasket().goToBasket();
    }

    @And("Ürün silindi")
    public void urun() {
        deleteProduct();
    }

    @Then("Sepetin boş olduğu kontrol edildi")
    public void sepet() {
        Assert.assertTrue(findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText().contains("Amazon sepetiniz boş."));
    }
}
