package Model.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public SelenideElement getResult(int index) {
        return $("#r1-" + index);
    }

    public SelenideElement getAnimeName() {
        return $("#dle-content > div > div.sector_border.center > h1");
    }
}
