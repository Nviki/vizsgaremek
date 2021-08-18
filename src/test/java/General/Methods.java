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
        return driver.findElement(value).isDisplayed();
    }

    /*public static boolean waitingForLoad(ExpectedConditions condition, WebDriver driver){
        boolean result = true;
        try {
            wait = new WebDriverWait(driver,10);
            wait.until(condition);
        }
        catch (Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    }*/

}
