package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //properties
    private WebDriver driver;

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void clickLoginLink(){
        if (Methods.waitingForLoad(Constant.HOME_LOGIN_LINK, driver)){
            driver.findElement(Constant.HOME_LOGIN_LINK).click();
        }else{
            System.out.println("Error number 1");
        }
    }
}
