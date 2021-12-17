using OpenQA.Selenium;

namespace CSWebAutomation{
    public class BaseSteps : BaseTest{
        public void ScrollDown(By by){
            var js = (IJavaScriptExecutor)driver;
            js.ExecuteScript("arguments[0].scrollIntoView(true);", findElement(by));
        }
        public IWebElement findElement(By by){
            
            return driver.FindElement(by);
        }
        public void click(By by){
            findElement(by).Click();
        }
    }
}