package rentV;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;



import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.*;

public class APITest {
    private static RequestSpecification request;

    @BeforeMethod
    public  void setup() {
        RestAssured.baseURI = "https://pr5i9i2nak.execute-api.us-east-1.amazonaws.com/beta";
       // RestAssured.port = 443;

        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }

    @Test
    public void testLogin() {
        // Define the request body
        String requestBody = "{\r\n"
        		+ "    \"countryCode\": \"91\",\r\n"
        		+ "    \"mobileNo\":\"9421075643\",\r\n"
        		+ "    \"type\": \"phone\"\r\n"
        		+ "}";

        // Send POST request to perform login
        Response response = request.body(requestBody).post("/c/account/loginWithOtp");

        // Assert the response status code
        response.then().statusCode(200);

        // Perform additional assertions on the response body, headers, etc.
        // ...
    }
}
