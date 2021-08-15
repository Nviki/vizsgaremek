package Tests;

import General.Constant;
import General.Methods;
import Pages.HomePage;
import Pages.Language;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLanguage extends TestEnvironment {

    private Login login;
    private Language language;

    @Test
    public void Test_Language() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        login.Login(Constant.LOGIN_USERNAME_VALUE, Constant.LOGIN_PASSWORD_VALUE);

        language = new Language(driver);
        language.Language(Constant.LANG_VALUE);
    }
}

