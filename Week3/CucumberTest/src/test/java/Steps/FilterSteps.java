package Steps;

import Pages.FilterPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FilterSteps extends FilterPages {

    @Given("Arama alanına {string} yazıldı")
    public void productSearch(String string) {
        searchProduct(string);
    }

    @When("{string} ve {string} degerlere gore filtreleme yapildi")
    public void priceFilter(String min, String max) {
        filterPrice(min, max);
    }

    @Then("Listelenen urunlerin {string} ve {string} araliginde oldugu kontrol edildi")
    public void assertPrices(String min, String max) {
        assertFilter(Integer.parseInt(min), Integer.parseInt(max));
    }
}
