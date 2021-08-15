package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class Registration {

    private WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void Registration (String username, String password, String email){
        if (Methods.waitingForLoad(Constant.REG_CREATE_ACC_BUTTON, driver)) {
            driver.findElement(Constant.REG_NAME).sendKeys(username);
            driver.findElement(Constant.REG_PW1).sendKeys(password);
            driver.findElement(Constant.REG_PW2).sendKeys(password);
            driver.findElement(Constant.REG_EMAIL).sendKeys(email);
            driver.findElement(Constant.REG_CREATE_ACC_BUTTON).click();
            //Nem fog működni a CAPTCHA miatt.
        } else {
            System.out.println("Cannot find Create Account button.");
        }
    }
}
