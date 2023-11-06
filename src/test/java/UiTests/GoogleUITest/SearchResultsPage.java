package UiTests.GoogleUITest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public SelenideElement getResult(int index) {
        return $("#r1-" + index);
    }
}
