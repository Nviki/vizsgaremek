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

    @Test
    @DisplayName("Nyelv megváltoztatása angolról magyarra.")
    public void Test_Language() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        login.Login(Constants.LOGIN_USERNAME_VALUE, Constants.LOGIN_PASSWORD_VALUE);

        language = new Language(driver);
        language.Language(Constants.LANG_VALUE);
    }
}

