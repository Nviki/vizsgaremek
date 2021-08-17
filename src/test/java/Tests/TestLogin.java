package Tests;

import General.Constants;
import Pages.HomePage;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

public class TestLogin extends TestEnvironment {

    private Login login;

    @Test
    @DisplayName("Bejelentkezés")
    public void Test_Login(){
        homePage = new HomePage(driver);
        homePage.clickLoginLink();
        Assertions.assertEquals(Constants.HOME_LOGIN_URL,driver.getCurrentUrl(),"Wrong URL.");

        login = new Login(driver);
        login.Login(Constants.LOGIN_USERNAME_VALUE, Constants.LOGIN_PASSWORD_VALUE);

        String expected = Constants.LOGIN_USERNAME_VALUE;
        String actual = driver.findElement(Constants.LOGIN_USERNAME_COMPARE).getText();
        Assertions.assertEquals(expected,actual);

        Assertions.assertTrue(driver.getPageSource().contains("Nviki1"), "Username not found.");
    }
}