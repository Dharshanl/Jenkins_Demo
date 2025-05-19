
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
    public void getJsonData() throws IOException{
        ObjectMapper  mapper = new ObjectMapper();
        Users users = mapper.readValue(new File("src/test/data/user.json"), Users.class);
        System.out.println(users.toString());
        System.out.println(users.getName());
        System.out.println(users.getJob());
    }
}
