package Pages;

import General.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    //properties
    private WebDriver driver;
    private final String MAIN_URL = "https://en.wikipedia.org/";
    private final By HOME_LOGIN_LINK = By.id("pt-login");
    private final By CREATE_ACC_LINK = By.id("pt-createaccount");
    private final By HOME_LOGOUT_LINK = By.id("pt-logout");

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void clickLoginLink(){
        if (Methods.waitingForLoad(ExpectedConditions.elementToBeClickable(HOME_LOGIN_LINK), driver)){
            driver.findElement(HOME_LOGIN_LINK).click();
        }else{
            System.out.println("Cannot find login link.");
        }
    }

    public void ClickRegLink() {
        if (Methods.waitingForLoad(CREATE_ACC_LINK, driver)){
            driver.findElement(CREATE_ACC_LINK).click();
        }else{
            System.out.println("Cannot find registration link.");
        }
    }
    public void clickMainLink() {
        driver.navigate().to(MAIN_URL);
    }

    public void clickLogoutLink() {
        if (Methods.waitingForLoad(HOME_LOGOUT_LINK, driver)){
            driver.findElement(HOME_LOGOUT_LINK).click();
        }else{
            System.out.println("Cannot find logout link.");
        }
    }


}
