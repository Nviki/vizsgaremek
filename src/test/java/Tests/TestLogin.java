package Tests;

import General.Constant;
import Pages.HomePage;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestLogin extends TestEnvironment {

    private Login login;

    @Test
    public void Test_Login(){
        homePage = new HomePage(driver);
        homePage.clickLoginLink();
        Assertions.assertEquals(Constant.HOME_LOGIN_URL,driver.getCurrentUrl(),"Error_1");

        login = new Login(driver);
        login.Login();

        String expected = Constant.LOGIN_USERNAME_VALUE;
        String actual = driver.findElement(Constant.LOGIN_USERNAME_COMPARE).getText();
        Assertions.assertEquals(expected,actual);

        Assertions.assertTrue(driver.getPageSource().contains("Nviki1"), "Username not found.");
    }
}