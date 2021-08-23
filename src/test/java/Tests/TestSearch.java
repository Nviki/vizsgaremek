package Tests;

import General.Constants;
import Pages.Search;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class TestSearch extends TestEnvironment {
    private Search search;
    private String oneElement = "An automobile";

    @Test
    @DisplayName("Adatok listázása")
    public void Test_SearchForWord() {
        search = new Search(driver);
        search.SearchForWord(Constants.SEARCH_VALUE);
        List<String> result = search.SearchResults();
        for (String element : result) {
            System.out.println(element);
        }
        Assertions.assertTrue(result.contains(oneElement));
    }

    @Test
    @DisplayName("Keresési találatok lementése fájlba")
    public void Test_SaveResults() {
        search = new Search(driver);
        search.SearchForWord(Constants.SEARCH_VALUE);
        List<String> result = search.SearchResults();
        for (String element : result) {
            System.out.println(element);
        }

        File file = new File("searchresults.txt");

        try {
            FileWriter fw = new FileWriter(file);
            for (String resultElement: result) {
                fw.write(resultElement + System.lineSeparator());
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
