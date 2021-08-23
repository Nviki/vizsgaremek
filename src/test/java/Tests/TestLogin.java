package Tests;

import General.Constants;
import Pages.HomePage;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

public class TestLogin extends TestEnvironment {

    private Login login;
    private final String HOME_LOGIN_URL = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";
    protected final String LOGIN_USERNAME_VALUE = "Nviki1";
    protected final String LOGIN_PASSWORD_VALUE = "Viki1234";
    private final By LOGIN_USERNAME_COMPARE = By.xpath("//*[@id=\"pt-userpage\"]/a");

    @Test
    @DisplayName("Bejelentkezés")
    public void Test_Login(){
        homePage = new HomePage(driver);
        homePage.clickLoginLink();
        Assertions.assertEquals(HOME_LOGIN_URL,driver.getCurrentUrl(),"Wrong URL.");

        login = new Login(driver);
        login.Login(LOGIN_USERNAME_VALUE, LOGIN_PASSWORD_VALUE);

        String expected = LOGIN_USERNAME_VALUE;
        String actual = driver.findElement(LOGIN_USERNAME_COMPARE).getText();
        Assertions.assertEquals(expected,actual);

        Assertions.assertTrue(driver.getPageSource().contains(LOGIN_USERNAME_VALUE), "Username not found.");
    }
}