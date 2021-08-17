package Pages;

import General.Constants;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class Registration {

    private WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void Registration (String username, String password, String email){
        if (Methods.waitingForLoad(Constants.REG_CREATE_ACC_BUTTON, driver)) {
            driver.findElement(Constants.REG_NAME).sendKeys(username);
            driver.findElement(Constants.REG_PW1).sendKeys(password);
            driver.findElement(Constants.REG_PW2).sendKeys(password);
            driver.findElement(Constants.REG_EMAIL).sendKeys(email);
            driver.findElement(Constants.REG_CREATE_ACC_BUTTON).click();
            //Nem fog működni a CAPTCHA miatt.
        } else {
            System.out.println("Cannot find Create Account button.");
        }
    }
}
