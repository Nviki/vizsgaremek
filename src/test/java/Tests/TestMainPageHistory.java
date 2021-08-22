package Tests;

import Pages.MainPageHistory;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;


public class TestMainPageHistory extends TestEnvironment {

    private MainPageHistory mainPageHistory;
    private String date = "15:28, 26 January 2002";

    @Test
    @DisplayName("Több oldalas lista bejárása.")
    public void Test_MainPageHistory() {
        mainPageHistory = new MainPageHistory(driver);
        mainPageHistory.MainPageHistory();
        Assertions.assertTrue(driver.getPageSource().contains(date), "Content not found.");
    }
}
