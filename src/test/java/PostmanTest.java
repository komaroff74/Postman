import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldReturnSendData(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
