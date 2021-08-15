package Tests;

import Pages.PrivacyPolicy;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPrivacyPolicy extends TestEnvironment {

    private PrivacyPolicy privacyPolicy;

    @Test
    public void Test_PrivacyPolicy() {
        privacyPolicy = new PrivacyPolicy(driver);
        privacyPolicy.PrivacyPolicy();

        Assertions.assertTrue(driver.getPageSource().contains("Privacy Policy"), "Content not found.");
    }
    //itt mit kell még tesztelni?
}
