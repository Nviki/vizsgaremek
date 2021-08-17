package Pages;

import General.Constants;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class MainPageHistory {

    private WebDriver driver;

    public MainPageHistory(WebDriver driver) {
        this.driver = driver;
    }

    public void MainPageHistory () {
        if (Methods.waitingForLoad(Constants.MPH_lINK, driver)){
            driver.findElement(Constants.MPH_lINK).click();
        } else {
            System.out.println("Cannot find Main Page View History link.");
        }

    }
}
