package Tests;

import General.Constants;
import Pages.HomePage;
import Pages.Registration;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

public class TestRegistration  extends TestEnvironment{

    private Registration registration;

    @Test
    @DisplayName("Regisztráció")
    public void Test_RegistrationWithValidData(){
        homePage = new HomePage(driver);
        homePage.ClickRegLink();

        registration = new Registration(driver);
        registration.Registration(Constants.REG_USERNAME_VALUE, Constants.REG_PW_VALUE, Constants.REG_EMAIL_VALUE);

        String expected = Constants.REG_LANDING_URL;
        String actual = driver.getCurrentUrl();

        Assertions.assertEquals(expected, actual);
    }

}
