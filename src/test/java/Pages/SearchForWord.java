package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchForWord {
    private WebDriver driver;
    private final By searchResults = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[2]/li");
    private final By searchInput = By.id("searchInput");
    private final By searchButton = By.id("searchButton");


    public SearchForWord(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> SearchResults() {


        List<WebElement> search = driver.findElements(searchResults);
        List<String> result = new ArrayList<>();

        for (WebElement row : search) {
            result.add(row.getText());
        }
        return result;
    }

    public void SearchForWord(String search) {
        driver.findElement(searchInput).sendKeys(search);
        driver.findElement(searchButton).click();

    }
}
