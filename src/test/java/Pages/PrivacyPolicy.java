package Pages;

import General.Constant;
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constant.PP_LINK));
        driver.findElement(Constant.PP_LINK).click();
    }
}
