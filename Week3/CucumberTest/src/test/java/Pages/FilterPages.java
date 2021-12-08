package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Constants.FilterConstants.*;

public class FilterPages extends BasePage {
    public FilterPages goUrl() {
        goUrl(URL);
        return this;
    }

    public void searchProduct(String product) {
        sendKeys(SEARCH_BAR, product);
        click(SEARCH_BUTTON);

    }

    public void acceptCookies() {
        click(ACCEPT_COOKIES);
    }

    public void filterPrice(String min, String max) {
        sendKeys(LOW_PRICE, min);
        sendKeys(HIGH_PRICE, max);
        click(FILTER_BUTTON);

    }

    public void assertFilter(int min, int max) {
        boolean flag;
        List<WebElement> elements = findElements(PRODUCT_PRICE_LIST);
        int size = elements.size();
        int i = 0;
        String[] texts = new String[size];
        Integer[] actual = new Integer[size];
        for (WebElement elem : elements) {
            texts[i] = elem.getText().replace(".", "");
            actual[i] = Integer.parseInt(texts[i]);
            i++;
        }

        for (int j = 0; j < size; j++) {
            if (actual[j] <= max && actual[j] >= min) {
                flag = true;
            } else {
                flag = false;
                System.out.println(actual[j] + " degeri " + min + " ve " + max + " degerleri arasinda degildir");
            }
            Assert.assertTrue(flag);
        }
    }

}
