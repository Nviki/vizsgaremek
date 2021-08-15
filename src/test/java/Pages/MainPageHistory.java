package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageHistory {

    private WebDriver driver;

    public MainPageHistory(WebDriver driver) {
        this.driver = driver;
    }

    public void MainPageHistory () {
        if (Methods.waitingForLoad(Constant.MPH_lINK, driver)){
            driver.findElement(Constant.MPH_lINK).click();
        } else {
            System.out.println("Cannot find Main Page View History link.");
        }
    }
}
