using System;
using System.Threading;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using SeleniumExtras.PageObjects;
using static CSWebAutomation.Constants;

namespace CSWebAutomation{
    public class HomePage : BaseSteps{
        WebDriverWait webDriverWait;
        public HomePage(IWebDriver driver){
            HomePage.driver = driver;
            this.webDriverWait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
            PageFactory.InitElements(driver,this);
        }
        
        public HomePage ClickStore(){
            click(StoreButton);
            return this;
        }
        public HomePage ClickOnlyApple(){
            click(OnlyApple);
            return this;
        }
        public HomePage ClickArcade(){
            click(Arcade);
            return this;
        }
        public HomePage ClickTryFree(){
            click(TryFree);
            Thread.Sleep(2000);
            return this;
        }
        public void AssertPopUpAndClose(){
            Assert.IsTrue(findElement(PopUp).Displayed);
            click(ClosePopUp);
        }
        public HomePage ClickAirPods(){
            ScrollDown(AirPods);
            click(AirPods);
            return this;
        }
        public HomePage AddToBasket(){
            click(AddBasket);
            Thread.Sleep(2000);
            return this;
        }
        public void AssertPrices(){
            webDriverWait.Until(e => e.FindElement(ProductPrice));
            webDriverWait.Until(e => e.FindElement(BasketPrice));
            Assert.AreEqual(findElement(ProductPrice).Text,findElement(BasketPrice).Text.Substring(18,11)); 
        }

        
    }
    
}