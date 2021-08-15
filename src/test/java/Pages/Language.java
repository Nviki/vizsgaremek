package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Language {
    private WebDriver driver;
    private WebDriverWait wait;

    public Language(WebDriver driver) {
        this.driver = driver;
    }
    public void Language(String selectedLanguage) {

        wait = new WebDriverWait(driver, 10);

        driver.findElement(Constant.LANG_PREF_lINK).click();
        Select dropdown = new Select(driver.findElement(Constant.LANG_DROPDOWN));
        /*List<WebElement> dd = dropdown.getOptions();
        System.out.println(dd.size());
        //wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(Constant.LANG_DROPDOWN, By.tagName("option")));

        System.out.println(dd.get(2).getText());
        for (int j = 0; j < dd.size(); j++) {
            System.out.println(dd.get(j).getText());
        }*/

        //wait.until(ExpectedConditions.visibilityOfElementLocated(Constant.LANG_HU));
        dropdown.selectByValue(selectedLanguage);
        driver.findElement(Constant.LANG_SUBMIT_BUTTON).click();
    }
}
