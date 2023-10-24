package ReqressApiTests;

import Model.RequestsModel.AuthSuccessfulRequestModel;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static steps.Steps.API_STEPS;

@Epic("Accounts controller")
public class AccountsApiTests {
    @Feature("Registration")
    @Test
    public void registerSuccessful() {
        API_STEPS.authUser(new AuthSuccessfulRequestModel("eve.holt@reqres.in", "pistol"));
    }

    @Feature("Registration")
    @Test
    public void registerUnsuccessful() {
        API_STEPS.authUserUnsuccessful(new AuthSuccessfulRequestModel("sydney@fife"));
    }

    @Feature("Authorization")
    @Test
    public void loginSuccessful() {
        API_STEPS.authUser(new AuthSuccessfulRequestModel("eve.holt@reqres.in", "cityslicka"));
    }

    @Feature("Authorization")
    @Test
    public void loginUnsuccessful() {
        API_STEPS.authUserUnsuccessful(new AuthSuccessfulRequestModel("peter@klaven"));
    }
}
