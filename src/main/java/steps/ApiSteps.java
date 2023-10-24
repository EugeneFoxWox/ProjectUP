package steps;
import Model.RequestsModel.*;
import Model.ResponseModel.*;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

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
    @Step("Получить пользователя по id")
    public Response userNotFound(Integer id){
         return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users/"+id)
                .then()
                .assertThat()
                .statusCode(404).extract().response();

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
                .get("/api/unknown")
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PagesResponse.class);

    }
    @Step("Получить")
    public PageResponse getPage(Integer page){
        return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/unknown/"+ page)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PageResponse.class);

    }
    @Step("Получить....")
    public Response notFoundPage(Integer page){
        return given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/unknown/"+ page)
                .then()
                .assertThat()
                .statusCode(404).extract().response();

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
    @Step("Обновить пользователя")
    public ApiResponse updateUser(RequestModel request, Integer id){
        return given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .put("/api/users/"+ id)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(ApiResponse.class);

    }
    @Step("Обновить пользователя")
    public ApiResponse updateUserPatch(RequestModel request, Integer id){
        return given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .patch("/api/users/" + id)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(ApiResponse.class);

    }
    //Не рабочее
    @Step("Удалить пользователя")
    public void deleteUser(Integer id){
        given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .when()
                .delete("/api/users/"+ id)
                .then()
                .assertThat()
                .statusCode(204).extract().response();

    }
}
