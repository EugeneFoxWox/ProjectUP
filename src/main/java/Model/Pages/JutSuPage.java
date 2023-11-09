package Model.Pages;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

import static com.codeborne.selenide.Selenide.$;

@Epic("UI Tests")
@Feature("Jut.su UI Test")
public class JutSuPage {
    public void searchAnimeByName(String name) {
        $("#search_b > form > input[type=text]:nth-child(2)").val(name).pressEnter();
    }
}
