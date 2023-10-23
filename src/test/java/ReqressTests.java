import Model.RequestsModel.RequestModel;
import Model.ResponseModel.*;
import org.testng.Assert;
import org.testng.annotations.*;
import steps.Steps;

public class ReqressTests implements Steps {
    private Integer id;

    @BeforeTest
    public void Start(){
        System.out.print("\nНачинаем тестирование ");
    }



    @AfterTest
    public void End(){
        System.out.print("Тестирование завершено");
    }


    @Test(description = "")
    public void getUserList(){
        UsersOnPageResponse users = API_STEPS.getUserList(2);
        System.out.println(users);

    }

    @Test
    public void getUserById() {
        UserResponse user = API_STEPS.getUserById(2);
        //System.out.print(user);
        UserResponse user1 = new UserResponse(
                new DataResponse(2, "janet.weaver@reqres.in", "Janet",
                        "Weaver","https://reqres.in/img/faces/2-image.jpg"),
                new SupportResponse("https://reqres.in/#support-heading",
                        "To keep ReqRes free, contributions towards server costs are appreciated!")
        );

        Assert.assertEquals(user, user1);

    }
    @Test(description = "")
    public void getResourcePage(){
        PagesResponse page = API_STEPS.getResourcePage();
        System.out.println(page);

    }
    @Test(description = "")
    public void getPage(){
        PageResponse page = API_STEPS.getPage(2);
        System.out.println(page);

    }


    @Test
    public void createUser() {
        ApiResponse apiResponse = API_STEPS.createUser(new RequestModel("morpheus", "leader"));
        id = Integer.valueOf(apiResponse.id);
        System.out.println(apiResponse);

    }



}
