package Pages;

import General.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrivacyPolicy {
    private WebDriver driver;
    private WebDriverWait wait;

    public PrivacyPolicy(WebDriver driver) {
        this.driver = driver;
    }

    public void PrivacyPolicy () {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.PP_LINK));
        driver.findElement(Constants.PP_LINK).click();
    }
}
