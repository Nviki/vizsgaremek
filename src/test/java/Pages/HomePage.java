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
            System.out.println("Cannot find login link.");
        }
    }

    public void ClickRegLink() {
        if (Methods.waitingForLoad(Constant.REG_CREATE_ACC_LINK, driver)){
            driver.findElement(Constant.REG_CREATE_ACC_LINK).click();
        }else{
            System.out.println("Cannot find registration link.");
        }
    }
}
