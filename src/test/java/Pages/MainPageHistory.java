package Pages;

import General.Constants;
import General.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;

public class MainPageHistory {

    private WebDriver driver;
    private final By MPH_lINK = By.id("ca-history");
    private final By MPH_OLDER_50 = By.linkText("older 50");

    public MainPageHistory(WebDriver driver) {
        this.driver = driver;
    }

    public void MainPageHistory () {
        if (Methods.waitingForLoad(MPH_lINK, driver)){
            driver.findElement(MPH_lINK).click();
        } else {
            System.out.println("Cannot find Main Page View History link.");
        }

        while(true) {
            try {
                driver.findElement(MPH_OLDER_50).click();
            } catch (Exception e) {
                break;
            }
            }
        }
}
