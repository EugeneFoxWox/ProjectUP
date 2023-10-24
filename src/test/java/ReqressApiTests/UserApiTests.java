package ReqressApiTests;

import Model.RequestsModel.RequestModel;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static steps.Steps.API_STEPS;

@Epic("User controller")
public class UserApiTests {
    @Feature("Get users")
    @Test(description = "")
    public void getUserList(){
        API_STEPS.getUserList(2);

    }
    @Feature("Get users")
    @Test
    public void getUserById() {
        API_STEPS.getUserById(2);
    }
    @Feature("Get users")
    @Test
    public void userNotFound(){
        API_STEPS.userNotFound(23);
    }


    @Feature("Manage users")
    @Test
    public void createUser() {
        API_STEPS.createUser(new RequestModel("morpheus", "leader"));
    }

    @Feature("Manage users")
    @Test
    public void updateUser() {
        API_STEPS.updateUser(new RequestModel("morphsus", "leader"), 2);
    }
    @Feature("Manage users")
    @Test
    public void updateUserPatch() {
        API_STEPS.updateUserPatch(new RequestModel("morphsus", "leader"), 2);
    }

    @Feature("Manage users")
    @Test
    public void deleteUser() {
        API_STEPS.deleteUser(2);

    }
}
