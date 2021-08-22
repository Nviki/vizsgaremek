package Tests;

import General.Constants;
import Pages.SearchForWord;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

import java.sql.SQLOutput;
import java.util.List;


public class TestSearchForWord extends TestEnvironment {
    private SearchForWord searchForWord;
    private String oneElement = "An automobile";

    @Test
    @DisplayName("Adatok listázása")
    public void Test_SearchForWord() {
        searchForWord = new SearchForWord(driver);
        searchForWord.SearchForWord(Constants.SEARCH_VALUE);
        List<String> result = searchForWord.SearchResults();
        for (String element : result) {
            System.out.println(element);
        }
        Assertions.assertTrue(result.contains(oneElement));
    }
}
