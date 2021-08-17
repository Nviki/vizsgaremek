import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WikipediaTest {

    private static WebDriver driver;
    private final String URL = "https://en.wikipedia.org/";

    @BeforeAll
    static void setDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nász Viktória\\Documents\\CodeCool/chromedriver.exe");
    }

    @BeforeEach
    void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        //options.addArguments("--disable-notifications");
        options.addArguments("start-maximized"); // teljes képernyőben való használat
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options); // új böngésző nyitása az opciókkal
        driver.get(URL);
    }

    @Test
    public void WebTest() {
        String url = driver.getCurrentUrl();
        assertEquals("https://en.wikipedia.org/wiki/Main_Page", url);
    }


    @Test
    public void loginWikipedia() {
        String username = "Nviki1";
        String password = "Viki1234";
        driver.findElement(By.id("pt-login")).click();
        driver.findElement(By.id("wpName1")).sendKeys(username);
        driver.findElement(By.id("wpPassword1")).sendKeys(password);
        driver.findElement(By.id("wpLoginAttempt")).click();
        Assertions.assertEquals(username, driver.findElement((By.xpath("//*[@id=\"pt-userpage\"]/a"))).getText());
    }

    @Test
    public void searchSelenium(){
        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)");
        driver.findElement(By.id("searchButton")).click();
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Selenium_(software)", driver.getCurrentUrl());
        driver.findElement(By.id("p-logo")).click();
    }

    @Test
    public void searchFramework(){
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.id("searchInput")).sendKeys("Framework");
        driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[1]/li[1]/a")));
        driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[1]/li[1]/a")).click();

        Assertions.assertEquals("https://en.wikipedia.org/wiki/Ajax_(programming)", driver.getCurrentUrl());
    }

    @AfterEach
    void quitDriver(){
        driver.quit();
    }

}
