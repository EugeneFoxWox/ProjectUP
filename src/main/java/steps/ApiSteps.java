package steps;
import Model.RequestsModel.*;
import Model.ResponseModel.*;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ApiSteps {

    @Step("Получить пользователя по id")
    public UserResponse getUserById(Integer id){
        return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users/"+id)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(UserResponse.class);

    }
    @Step("Получить список пользователей по странице")
    public UsersOnPageResponse getUserList(Integer page){
        return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users?page="+page)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(UsersOnPageResponse.class);

    }
    @Step("Получить список пользователей по странице")
    public PagesResponse getResourcePage(){
        return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/unknow")
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PagesResponse.class);

    }
    @Step("Получить")
    public PageResponse getPage(Integer page){
        return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/unknow/"+ page)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PageResponse.class);

    }

    @Step("Создать пользователя")
    public ApiResponse createUser(RequestModel request){
        return given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/api/users/")
                .then()
                .assertThat()
                .statusCode(201).extract().response().body().as(ApiResponse.class);

    }
}
