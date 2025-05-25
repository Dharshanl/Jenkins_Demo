
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class Testjava {

    @Test
    public static void test() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }

    @Test
    public void postUsingRawJsonString() {
        String jsonPayload = "{ \"name\": \"John\", \"job\": \"Developer\" }";

        given()
                .headers("Content-Type", "application/json", "billDetails", "abcd")
                .body(jsonPayload)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(401)
                .log().all();
    }

    @Test
    public void getJsonData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Users users = mapper.readValue(new File("src/test/data/user.json"), Users.class);
        System.out.println(users.toString());
        System.out.println(users.getName());
        System.out.println(users.getJob());
    }

    @Test
    public void sampletest() {
        String token = given().baseUri("https://restful-booker.herokuapp.com")
                .body(new File("src/test/data/data.json"))
                .contentType("application/json")
                .when()
                .post("/auth")
                .then()
                .extract().path("token");

        System.out.println("token:" + token);
    }

    @Test
    public void createbooking() {

        File file = new File("src/test/data/createBooking.json");
        System.out.println(file);

        given().baseUri("https://restful-booker.herokuapp.com")
                .body(file)
                .contentType("application/json")
                .when().post("/booking")
                .then()
                .statusCode(200)
                .log().body();

    }

    @Test
    public void deletebooking() {

        given().baseUri("https://restful-booker.herokuapp.com/booking")
                .contentType("application/json")
                .when().delete("/3530")
                .then()
                .statusCode(200)
                .log().all();

    }

    @Test
    public void getBooking() {
        given().baseUri("https://restful-booker.herokuapp.com")
                .contentType("application/json")
                .when()
                .get("/booking")
                .then()
                .statusCode(200)
                .extract().body().path("bookingid");
    }

}
