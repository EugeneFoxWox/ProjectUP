package UiTests.NewUITests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static steps.Steps.UI_STEPS;

@Epic("UI Tests")
@Feature("JutSu UI Tests")
public class JutSuTest {
    @Test
    public void userCanSearchAnimeDB() {
        UI_STEPS.openJutSuPage();
        UI_STEPS.searchAnime("Dragon Ball");
    }
}
