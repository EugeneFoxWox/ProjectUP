package UiTests.GoogleUITest;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage{
    public void searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
    }
}