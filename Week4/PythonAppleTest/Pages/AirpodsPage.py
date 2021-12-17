from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from Config.config import TestData

class AirpodsPage(BasePage):

    STORE_BUTTON = (By.XPATH,"//a[@href='/tr/shop/goto/store']")
    AIRPODS_PAGE = (By.XPATH,"//h3[contains(text(),'AIRPODS')]")
    ADD_BASKET = (By.ID,"add-to-cart")
    PRODUCT_PRICE = (By.XPATH,"//div[@class='rs-iteminfo-price']/p")
    BASKET_PRICE = (By.XPATH,"//h1[@data-autom='bag-header']")

    def __init__(self,driver):
        super().__init__(driver)
        self.driver.get(TestData.BASE_URL)

    def click_store(self):
        self.do_click(self.STORE_BUTTON)

    def click_airpods(self):
        self.do_click(self.AIRPODS_PAGE)

    def click_add_to_basket(self):
        self.do_click(self.ADD_BASKET)

    def assert_prices(self):
        self.assert_price(self.PRODUCT_PRICE,self.BASKET_PRICE)
