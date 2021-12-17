using NUnit.Framework;

namespace CSWebAutomation
{
    [TestFixture]
    public class HomePageTest : BaseTest
    {
        HomePage homePage;
        [OneTimeSetUp]
        public void Setup()
        {
            //ChromeDriver kullanacağımı belirtip bir homepage objesi oluşturuyorum.
            Initialize("Chrome");
            homePage = new HomePage(driver);
            
        }

        [Test]
        public void AirPodsTest()
        {
            homePage.ClickStore().ClickAirPods().AddToBasket().AssertPrices();
        }
        [Test]
        public void ArcadeTest(){
            homePage.ClickOnlyApple().ClickArcade().ClickTryFree().AssertPopUpAndClose();

        }
        [OneTimeTearDown]
        public void TearDown(){
            CloseSession();
        }
    }
}