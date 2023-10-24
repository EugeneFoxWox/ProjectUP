package ReqressApiTests;

import io.qameta.allure.Epic;
import org.testng.annotations.*;
import steps.Steps;

public class OtherApiTests implements Steps {
    private Integer id;

    @BeforeTest
    public void Start(){
        System.out.print("\nНачинаем тестирование ");
    }

    @Epic("Other")
    @Test
    public void delayedResponse(){
        API_STEPS.delayedResponse();
    }
    @AfterTest
    public void End(){
        System.out.print("\nТестирование завершено");
    }

}