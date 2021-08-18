package Pages;

import General.Constants;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //properties
    private WebDriver driver;
    private final String MAIN_URL = "https://en.wikipedia.org/";

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void clickLoginLink(){
        if (Methods.waitingForLoad(Constants.HOME_LOGIN_LINK, driver)){
            driver.findElement(Constants.HOME_LOGIN_LINK).click();
        }else{
            System.out.println("Cannot find login link.");
        }
    }

    public void ClickRegLink() {
        if (Methods.waitingForLoad(Constants.REG_CREATE_ACC_LINK, driver)){
            driver.findElement(Constants.REG_CREATE_ACC_LINK).click();
        }else{
            System.out.println("Cannot find registration link.");
        }
    }
    public void clickMainLink() {
        driver.navigate().to(MAIN_URL);
    }


}
