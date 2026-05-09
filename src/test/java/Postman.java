import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Postman {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testGetRequest() {
        given()
                .when()
                .get("/get")
                .then()
                .statusCode(200);

    }

    @Test
    public void testPostRawText() {
        String requestBody = "Hello World";
        given()
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }

    @Test
    public void testPostFormData() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("strange", "boom")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.strange", equalTo("boom"));
    }

    @Test
    public void testPutRequest() {
        String body = "Update";
        given()
                .body(body)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(body));
    }

    @Test
    public void testDeleteRequest() {
        given()
                .when()
                .delete("/delete")
                .then()
                .statusCode(200);
    }
}