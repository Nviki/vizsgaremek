package Tests;

import Pages.PrivacyPolicy;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

public class TestPrivacyPolicy extends TestEnvironment {

    private PrivacyPolicy privacyPolicy;
    private String PP_LANDING_LINK = "https://foundation.wikimedia.org/wiki/Privacy_policy";

    @Test
    @DisplayName("Adatkezelési nyilatkozat használata")
    public void Test_PrivacyPolicy() {
        privacyPolicy = new PrivacyPolicy(driver);
        privacyPolicy.PrivacyPolicy();

        Assertions.assertTrue(driver.getPageSource().contains("Privacy Policy"), "Content not found.");
    }
    //itt mit kell még tesztelni?
}
