package steps;

import Model.Pages.*;
import Model.ResponseModel.UserResponse;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class UISteps {
    @Step("Сделать запрос в Поисковик")
    public void userCanSearch(String request) {
        open("https://duckduckgo.com");
        new GooglePage().searchFor(request);
        SearchResultsPage results = new SearchResultsPage();
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
