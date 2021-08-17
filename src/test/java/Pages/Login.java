package Pages;

import General.Constants;
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
    public void Login(String username, String password) {
        if (Methods.waitingForLoad(Constants.LOGIN_BUTTON, driver)){
             driver.findElement(Constants.LOGIN_USERNAME).sendKeys(username);
             driver.findElement(Constants.LOGIN_PASSWORD).sendKeys(password);
             driver.findElement(Constants.LOGIN_BUTTON).click();
        } else {
            System.out.println("Error number 2");
        }
    }
}
