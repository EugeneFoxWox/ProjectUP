package UiTests.NewUITests;


import Model.Pages.SearchResultsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

@Epic("UI Tests")
@Feature("Avito UI Test")
public class NewTest {
    @Test
    public void userCanLogin() {
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //System.setProperty("selenide.browser", "Chrome");
        open("https://www.avito.ru/kostroma/noutbuki");
        SearchResultsPage resultsPage = new SearchResultsPage();
        List<String> items = Creator.createStrings();
        List<AvitoItemObject> objects = Creator.createObjects();
        for (int i = 0; i < items.size(); i++) {
            Assert.assertEquals(resultsPage.getItem(items.get(i)).getText(), objects.get(i).getName());
            Assert.assertEquals(resultsPage.getPrice(items.get(i)).getText(), objects.get(i).getPrice());
        }
    }
}
