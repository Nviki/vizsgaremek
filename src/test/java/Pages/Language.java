package Pages;

import General.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Language {
    private WebDriver driver;
    private WebDriverWait wait;

    public Language(WebDriver driver) {
        this.driver = driver;
    }
    public void Language(String selectedLanguage) {

        wait = new WebDriverWait(driver, 10);

        driver.findElement(Constants.LANG_PREF_lINK).click();
        Select dropdown = new Select(driver.findElement(Constants.LANG_DROPDOWN));

        /*List<WebElement> dd = dropdown.getOptions();
        System.out.println(dd.size());

        System.out.println(dd.get(2).getText());
        for (int j = 0; j < dd.size(); j++) {
            System.out.println(dd.get(j).getText());
        }*/

        dropdown.selectByValue(selectedLanguage);
        driver.findElement(Constants.LANG_SUBMIT_BUTTON).click();
    }
}
