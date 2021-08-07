package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class Login {

    //properties
    private WebDriver driver;

    //constructor
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void Login() {
        if (Methods.waitingForLoad(Constant.LOGIN_BUTTON, driver)){
             driver.findElement(Constant.LOGIN_USERNAME).sendKeys(Constant.LOGIN_USERNAME_VALUE);
             driver.findElement(Constant.LOGIN_PASSWORD).sendKeys(Constant.LOGIN_PASSWORD_VALUE);
             driver.findElement(Constant.LOGIN_BUTTON).click();
        } else {
            System.out.println("Error number 2");
        }
    }
}
