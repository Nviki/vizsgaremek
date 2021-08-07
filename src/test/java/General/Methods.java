package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

    private static WebDriverWait wait;

    public static boolean waitingForLoad(By value, WebDriver driver){
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(value));
        wait.until(ExpectedConditions.elementToBeClickable(value));
        return driver.findElement(value).isDisplayed();
    }
}
