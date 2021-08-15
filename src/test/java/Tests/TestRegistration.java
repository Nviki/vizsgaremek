package Tests;

import General.Constant;
import Pages.HomePage;
import Pages.Login;
import Pages.Registration;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestRegistration  extends TestEnvironment{

    private Registration registration;

    @Test
    public void Test_RegistrationWithValidData(){
        homePage = new HomePage(driver);
        homePage.ClickRegLink();

        registration = new Registration(driver);
        registration.Registration(Constant.REG_USERNAME_VALUE, Constant.REG_PW_VALUE, Constant.REG_EMAIL_VALUE);

        String expected = Constant.REG_LANDING_URL;
        String actual = driver.getCurrentUrl();

        Assertions.assertEquals(expected, actual);
    }

}
