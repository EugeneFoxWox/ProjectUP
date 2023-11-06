package UiTests.GoogleUITest;
import Model.Pages.GooglePage;
import Model.Pages.SearchResultsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import org.testng.annotations.Test;
import static steps.Steps.UI_STEPS;
@Epic("UI Tests")
@Feature("Google UI Tests")

public class GoogleTest {
    @Test
    public void userCanSearch() {
        UI_STEPS.userCanSearch("selenide java");
    }
}
