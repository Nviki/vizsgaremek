package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Preferences {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By PREF_lINK = By.id("pt-preferences");
    private final By LANG_DROPDOWN = By.xpath("//*[@id=\"ooui-php-29\"]");
    private final By SIGN_INPUT = By.xpath("//*[@id=\"ooui-php-39\"]");
    private final By NOTIFICATION_TAB = By.xpath("//*[@id=\"ooui-php-417\"]");
    public static final By NOTIFICATION_MUTED_PAGES = By.xpath("//*[@id=\"ooui-47\"]");
    private final By SUBMIT_BUTTON = By.xpath("//*[@id=\"prefcontrol\"]/button");

    public Preferences(WebDriver driver) {
        this.driver = driver;
    }
    public void Language(String selectedLanguage) {

        wait = new WebDriverWait(driver, 10);

        driver.findElement(PREF_lINK).click();
        Select dropdown = new Select(driver.findElement(LANG_DROPDOWN));

        /*List<WebElement> dd = dropdown.getOptions();
        System.out.println(dd.size());

        System.out.println(dd.get(2).getText());
        for (int j = 0; j < dd.size(); j++) {
            System.out.println(dd.get(j).getText());
        }*/

        dropdown.selectByValue(selectedLanguage);
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public void Signature (String mySignature) {
        driver.findElement(PREF_lINK).click();
        driver.findElement(SIGN_INPUT).clear();
        driver.findElement(SIGN_INPUT).sendKeys(mySignature);
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public void NotificationStart () {
        driver.findElement(PREF_lINK).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(NOTIFICATION_TAB));
        driver.findElement(NOTIFICATION_TAB).click();
        driver.findElement(NOTIFICATION_MUTED_PAGES).clear();
    }

    public void NotificationSubmit () {
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public void DeleteNotification () {
        driver.findElement(PREF_lINK).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(NOTIFICATION_TAB));
        driver.findElement(NOTIFICATION_TAB).click();
        String inputText = driver.findElement(NOTIFICATION_MUTED_PAGES).getAttribute("value");
        while(inputText != null) {
                driver.findElement(NOTIFICATION_MUTED_PAGES).sendKeys(Keys.BACK_SPACE);
                break;
        }
        driver.findElement(SUBMIT_BUTTON).click();
    }
}
