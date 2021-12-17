from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from Config.config import TestData

class ArcadePage(BasePage):

    ONLY_APPLE = (By.XPATH,"//a[@data-analytics-title='only on apple']")
    ARCADE = (By.XPATH,"//a[@data-analytics-title='apple arcade']")
    TRY_FREE = (By.XPATH,"(//a[@data-analytics-title='try it free'])[2]")
    POP_UP = (By.ID,"section-tryitfree")
    CLOSE_POP_UP = (By.XPATH,"//button[@class='modal-close']")

    def __init__(self,driver):
        super().__init__(driver)
        self.driver.get(TestData.BASE_URL)

    def click_only_apple(self):
        self.do_click(self.ONLY_APPLE)

    def click_arcade(self):
        self.do_click(self.ARCADE)

    def click_try_free(self):
        self.do_click(self.TRY_FREE)

    def is_pop_up_enabled(self):
        self.is_enabled(self.POP_UP)
        
    def click_close_pop_up(self):
        self.do_click(self.CLOSE_POP_UP)
    