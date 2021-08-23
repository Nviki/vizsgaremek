package Tests;

import Pages.HomePage;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

public class TestLogout extends TestEnvironment {
    private Login login;
    private final By NOT_LOGGED_IN = By.id("pt-anonuserpage");

    @Test
    @DisplayName("Kijelentkezés")
    public void Test_Logout() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        TestLogin testlogin = new TestLogin();
        login.Login(testlogin.LOGIN_USERNAME_VALUE, testlogin.LOGIN_PASSWORD_VALUE);

        homePage.clickLogoutLink();

        String expected = "Not logged in";
        String actual = driver.findElement(NOT_LOGGED_IN).getText();
        Assertions.assertEquals(expected, actual);
    }
}
