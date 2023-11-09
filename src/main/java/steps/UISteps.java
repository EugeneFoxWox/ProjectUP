package steps;

import Model.Pages.*;
import Model.ResponseModel.UserResponse;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static java.util.concurrent.TimeUnit.SECONDS;

public class UISteps {
    @Step("Сделать запрос в Поисковик")
    public void userCanSearch(String request) {
        open("https://duckduckgo.com");
        new GooglePage().searchFor(request);
        SearchResultsPage results = new SearchResultsPage();
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }

    @Step("Открыть страницу jut.su")
    public void openJutSuPage() {
        Configuration.pageLoadTimeout = 30000000;
        open("https://jut.su/");
    }

    @Step("Найти аниме по названию")
    public void searchAnime(String animeName) {
        new JutSuPage().searchAnimeByName(animeName);
        SearchResultsPage resultsPage = new SearchResultsPage();
       resultsPage.getAnimeName().shouldHave(text("все серии и сезоны"));
    }
}
