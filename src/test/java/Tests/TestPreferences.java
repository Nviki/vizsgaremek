package Tests;

import General.Constants;
import Pages.*;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestPreferences extends TestEnvironment {

    private Login login;
    private Preferences preferences;
    private TestLogin testLogin;
    private WebDriverWait wait;
    private final By CURRENT_SIGNATURE = By.xpath("//*[@id=\"mw-htmlform-signature\"]/div[1]/div/div/label");
    private final By OPTIONS = By.xpath("/html/body/div[6]/div[6]");
    private final By ALERT = By. xpath("//*[@id=\"mw-notification-area\"]/div/div");
    private String alert = "Your preferences have been saved.";

    @Test
    @DisplayName("Új aláírás létrehozása")
    public void Test_Signature() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        testLogin = new TestLogin();
        login.Login(testLogin.LOGIN_USERNAME_VALUE, testLogin.LOGIN_PASSWORD_VALUE);

        preferences = new Preferences(driver);
        preferences.Signature(Constants.SIGN_VALUE);

        String expected = "New signature Nviki1 (talk)";
        String actual = driver.findElement(CURRENT_SIGNATURE).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Nyelv megváltoztatása angolról magyarra.")
    public void Test_Language() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        testLogin = new TestLogin();
        login.Login(testLogin.LOGIN_USERNAME_VALUE, testLogin.LOGIN_PASSWORD_VALUE);

        preferences = new Preferences(driver);
        preferences.Language(Constants.LANG_VALUE);
    }

    @Test
    @DisplayName("Elnémított lapok beállítása fájlból")
    public void Test_Notification() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        testLogin = new TestLogin();
        login.Login(testLogin.LOGIN_USERNAME_VALUE, testLogin.LOGIN_PASSWORD_VALUE);

        preferences = new Preferences(driver);
        preferences.NotificationStart();

        File file = new File("pages.txt");
        List<String> pages = new ArrayList<>();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line = reader.readLine()) != null) {
                pages.add(line);
            }
            reader.close();
        }
        catch(Exception e) { e.printStackTrace(); }

        for (int i = 0; i <= pages.size()-1; i++) {
            driver.findElement(Preferences.NOTIFICATION_MUTED_PAGES).sendKeys(pages.get(i));
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(OPTIONS));
            driver.findElement(Preferences.NOTIFICATION_MUTED_PAGES).sendKeys(Keys.ENTER);
        }
        preferences.NotificationSubmit();

        /*String expected = alert;
        String actual = driver.findElement(ALERT).getText();
        Assertions.assertEquals(expected, actual);*/
    }

    @Test
    @DisplayName("Elnémított lapok törlése")
    public void Test_DeleteNotification() {
        homePage = new HomePage(driver);
        homePage.clickLoginLink();

        login = new Login(driver);
        testLogin = new TestLogin();
        login.Login(testLogin.LOGIN_USERNAME_VALUE, testLogin.LOGIN_PASSWORD_VALUE);

        preferences = new Preferences(driver);
        preferences.DeleteNotification();
    }
}