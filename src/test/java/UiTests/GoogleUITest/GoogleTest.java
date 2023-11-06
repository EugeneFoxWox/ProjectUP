package UiTests.GoogleUITest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import org.testng.annotations.Test;
@Epic("UI Tests")
@Feature("Google UI Tests")

public class GoogleTest {
    @Test
    public void userCanSearch() {
        open("https://duckduckgo.com");
        new GooglePage().searchFor("selenide java");

        SearchResultsPage results = new SearchResultsPage();
        //results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
