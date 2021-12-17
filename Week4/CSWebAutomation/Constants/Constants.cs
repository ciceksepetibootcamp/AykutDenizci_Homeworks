using OpenQA.Selenium;

namespace CSWebAutomation{
    public class Constants{
        public static By StoreButton = By.XPath("//a[@href='/tr/shop/goto/store']");
        public static By AirPods = By.XPath("//h3[contains(text(),'AIRPODS')]");
        public static By AddBasket = By.Id("add-to-cart");
        public static By ProductPrice = By.XPath("//div[@class='rs-iteminfo-price']/p");
        public static By BasketPrice = By.XPath("//h1[@data-autom='bag-header']");
        public static By OnlyApple = By.XPath("//a[@data-analytics-title='only on apple']");
        public static By Arcade = By.XPath("//a[@data-analytics-title='apple arcade']");
        public static By TryFree = By.XPath("(//a[@data-analytics-title='try it free'])[2]");
        public static By PopUp = By.Id("section-tryitfree");
        public static By ClosePopUp = By.XPath("//button[@class='modal-close']");



    }

    }