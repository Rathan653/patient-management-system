import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AuthIntegrationTest {

    @BeforeAll
    static void setUp(){
        RestAssured.baseURI = "http://localhost:4004";
    }

    @Test
    public void ShouldReturnOKWithValidToken(){
        // Arrange , Act and Assert

        String loginPayload = """
                {
                    "email": "testuser@test.com",
                    "password": "password123"
                }
                """;

        Response response = given()
                .contentType("application/json")
                .body(loginPayload)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .body("login", notNullValue())
                .extract()
                .response();

        System.out.println("Generated token: " + response.jsonPath().getString("login"));

    }


    @Test
    public void ShouldReturnUnauthorizedOnInvalidLogin(){
        // Arrange , Act and Assert

        String loginPayload = """
                {
                    "email": "invalid_user@test.com",
                    "password": "wrong_password"
                }
                """;

        given()
                .contentType("application/json")
                .body(loginPayload)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(401);

        System.out.println("Unauthorized");
    }
}