package Tests;

import Pages.HomePage;
import Pages.Registration;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

public class TestRegistration  extends TestEnvironment{

    private Registration registration;
    private final String REG_USERNAME_VALUE = "Nviki123";
    private final String REG_PW_VALUE = "ILoveSelenium!";
    private final String REG_EMAIL_VALUE = "naszviki.mt@gmail.com";
    private final String REG_LANDING_URL = "https://en.wikipedia.org/w/index.php?title=Main_Page&gettingStartedReturn=true";


    @Test
    @DisplayName("Regisztráció")
    public void Test_RegistrationWithValidData(){
        homePage = new HomePage(driver);
        homePage.ClickRegLink();

        registration = new Registration(driver);
        registration.Registration(REG_USERNAME_VALUE, REG_PW_VALUE, REG_EMAIL_VALUE);

        String expected = REG_LANDING_URL;
        String actual = driver.getCurrentUrl();

        Assertions.assertEquals(expected, actual);
    }

}
