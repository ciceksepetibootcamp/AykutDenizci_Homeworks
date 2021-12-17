import pytest
from Pages.ArcadePage import ArcadePage
from Tests.test_base import BaseTest

class Test_Arcade(BaseTest):

    def test_go_airpods(self):
        self.arcadePage = ArcadePage(self.driver)
        self.arcadePage.click_only_apple()
        self.arcadePage.click_arcade()
        self.arcadePage.click_try_free()
        flag = self.arcadePage.is_pop_up_enabled()
        #assert flag
        self.arcadePage.click_close_pop_up()
        