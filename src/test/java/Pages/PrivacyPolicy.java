package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrivacyPolicy {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By PP_LINK = By.id("footer-places-privacy");

    public PrivacyPolicy(WebDriver driver) {
        this.driver = driver;
    }

    public void PrivacyPolicy () {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PP_LINK));
        driver.findElement(PP_LINK).click();
    }
}
