package Pages;

import General.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {

    private WebDriver driver;
    private final By REG_NAME = By.id("wpName2");
    private final By REG_PW1 = By.id("wpPassword2");
    private final By REG_PW2 = By.id("wpRetype");
    private final By REG_EMAIL = By.id("wpEmail");
    private final By REG_CREATE_ACC_BUTTON = By.xpath("//*[@id=\"wpCreateaccount\"]");

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void Registration (String username, String password, String email){
        if (Methods.waitingForLoad(REG_CREATE_ACC_BUTTON, driver)) {
            driver.findElement(REG_NAME).sendKeys(username);
            driver.findElement(REG_PW1).sendKeys(password);
            driver.findElement(REG_PW2).sendKeys(password);
            driver.findElement(REG_EMAIL).sendKeys(email);
            driver.findElement(REG_CREATE_ACC_BUTTON).click();
            //Nem fog működni a CAPTCHA miatt.
        } else {
            System.out.println("Cannot find Create Account button.");
        }
    }
}
