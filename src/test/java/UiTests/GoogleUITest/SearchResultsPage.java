package UiTests.GoogleUITest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public SelenideElement getResult(int index) {
        return $("#r1-" + index);
    }
    public SelenideElement getItem(String id) {
        return $("#i"+id+" > div > div > div.iva-item-body-KLUuy > div.iva-item-titleStep-pdebR > div > a > h3");
    }
    public SelenideElement getPrice(String id) {
        return $("#i"+id+" > div > div > div.iva-item-body-KLUuy > div.iva-item-priceStep-uq2CQ > span > div > p > strong > span");
    }
    public void clickBtn(String id) {
        $("#i"+id+" > div > div > div.iva-item-body-KLUuy > div.iva-item-titleStep-pdebR > div > a > h3").click();
    }
}
