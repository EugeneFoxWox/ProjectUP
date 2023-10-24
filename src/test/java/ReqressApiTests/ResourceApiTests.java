package ReqressApiTests;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;

import static steps.Steps.API_STEPS;

@Epic("Resource controller")
public class ResourceApiTests {
    @Test(description = "")
    public void getResourcePage(){
        API_STEPS.getResourcePage();
    }

    @Test(description = "")
    public void getPage(){
        API_STEPS.getPage(2);

    }

    @Test
    public void notFoundPage(){
        API_STEPS.notFoundPage(23);
    }

}
