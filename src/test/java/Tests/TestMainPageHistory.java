package Tests;

import Pages.MainPageHistory;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Test;


public class TestMainPageHistory extends TestEnvironment {

    private MainPageHistory mainPageHistory;

    @Test
    public void Test_MainPageHistory() {
        mainPageHistory = new MainPageHistory(driver);
        mainPageHistory.MainPageHistory();

    }
}
