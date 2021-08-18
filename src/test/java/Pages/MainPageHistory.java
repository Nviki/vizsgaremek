package Pages;

import General.Constants;
import General.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageHistory {

    private WebDriver driver;
    private final By MPH_lINK = By.id("ca-history");
    private final By MPH_OLDER_50 = By.xpath("//*[@id=\"mw-content-text\"]/a[2]");

    public MainPageHistory(WebDriver driver) {
        this.driver = driver;
    }

    public void MainPageHistory () {
        if (Methods.waitingForLoad(MPH_lINK, driver)){
            driver.findElement(MPH_lINK).click();
        } else {
            System.out.println("Cannot find Main Page View History link.");
        }

    }
}
