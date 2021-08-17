package Tests;

import Pages.MainPageHistory;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;


public class TestMainPageHistory extends TestEnvironment {

    private MainPageHistory mainPageHistory;

    @Test
    @DisplayName("Több oldalas lista bejárása.")
    public void Test_MainPageHistory() {
        mainPageHistory = new MainPageHistory(driver);
        mainPageHistory.MainPageHistory();
    }
}
