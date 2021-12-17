import pytest
from Pages.AirpodsPage import AirpodsPage
from Tests.test_base import BaseTest

class Test_Airpods(BaseTest):

    def test_go_airpods(self):
        self.airpodsPage = AirpodsPage(self.driver)
        self.airpodsPage.click_store()
        self.airpodsPage.click_airpods()
        self.airpodsPage.click_add_to_basket()
        #self.airpodsPage.assert_prices()
        
