using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.IE;
using OpenQA.Selenium.Support.UI;
using WebDriverManager;
using WebDriverManager.DriverConfigs.Impl;

namespace CSWebAutomation
{
    public enum BrowserType 
    {
        Chrome,
        Firefox,
        IE
    }
    public class BaseTest{
        public static IWebDriver driver;
        public static WebDriverWait wait;
        public BrowserType browserType;
        
        public void Initialize(String BrowserName){
            /*Metodun içine gelen String ifadeyi BrowserTypeye çeviriyorum ve aşağıdaki 
            ChooseDriver metodunu ona göre çağırıyorum */
            browserType = (BrowserType)Enum.Parse(typeof(BrowserType),BrowserName);
            ChooseDriver(browserType);
            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(10);
            driver.Navigate().GoToUrl("https://apple.com/tr");

        }
        public void CloseSession(){
            //Driveri kapatıyorum
            driver.Close();
        }

        public void ChooseDriver(BrowserType browserType){
            //Hangi driverda çalışmak istiyorsam WebDriverManageri ona göre setliyorum.
            if(browserType == BrowserType.Chrome){
            new DriverManager().SetUpDriver(new ChromeConfig());
            var chromeOptions = new ChromeOptions();
            chromeOptions.AddUserProfilePreference("disable-popup-blocking", "true");
            chromeOptions.AddArgument("start-maximized");
            driver = new ChromeDriver(chromeOptions);}
            

            else if(browserType == BrowserType.Firefox){
            new DriverManager().SetUpDriver(new FirefoxConfig());
            var firefoxOptions = new FirefoxOptions();
            firefoxOptions.AddArguments("--test-type", "--ignore-certificate-errors");
            firefoxOptions.AddArgument("start-maximized");
            driver = new FirefoxDriver(firefoxOptions);

            }
            else if(browserType == BrowserType.IE){
            new DriverManager().SetUpDriver(new InternetExplorerConfig());
            var ieOption = new InternetExplorerOptions();
            ieOption.AddAdditionalOption("disable-popup-blocking", "true");
            driver = new InternetExplorerDriver(ieOption);
            }
        }

    }
    }