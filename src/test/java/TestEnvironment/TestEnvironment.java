package TestEnvironment;

import General.Constants;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestEnvironment {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications");
        options.addArguments("start-maximized"); // teljes képernyőőben való használat
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        //options.addArguments("--headless");  //a gitHub használatához visszatenni
        driver = new ChromeDriver(options); // új böngésző nyitása az opciókkal

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.clickMainLink();
    }

    @AfterEach
    void quitDriver() {
        driver.quit();
    }
}
