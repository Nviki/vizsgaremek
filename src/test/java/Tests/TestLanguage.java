package Tests;

import General.Constants;
import Pages.HomePage;
import Pages.Language;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

public class TestLanguage extends TestEnvironment {

    private Login login;
    private Language language;
    private TestLogin testLogin;

    @Test
    @DisplayName("Nyelv megváltoztatása angolról magyarra.")
    public void Test_Language() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        testLogin = new TestLogin();
        login.Login(testLogin.LOGIN_USERNAME_VALUE, testLogin.LOGIN_PASSWORD_VALUE);

        language = new Language(driver);
        language.Language(Constants.LANG_VALUE);
    }
}

