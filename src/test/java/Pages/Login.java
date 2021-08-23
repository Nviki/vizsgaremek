package Pages;

import General.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    //properties
    private WebDriver driver;
    private final By LOGIN_USERNAME = By.id("wpName1");
    private final By LOGIN_PASSWORD = By.id("wpPassword1");
    private final By LOGIN_BUTTON= By.id("wpLoginAttempt");

    //constructor
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void Login(String username, String password) {
        if (Methods.waitingForLoad(LOGIN_BUTTON, driver)){
             driver.findElement(LOGIN_USERNAME).sendKeys(username);
             driver.findElement(LOGIN_PASSWORD).sendKeys(password);
             driver.findElement(LOGIN_BUTTON).click();
        } else {
            System.out.println("Cannot find login button.");
        }
    }
}
