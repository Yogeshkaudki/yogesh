package rentV;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class post {

    public static void main(String[] args) {
        // Define the base URL
        RestAssured.baseURI = "https://pr5i9i2nak.execute-api.us-east-1.amazonaws.com/beta";

        // Request payload in JSON format
        String requestBody = "{\\r\\n\"\r\n"
        		+ "        		+ \"    \\\"countryCode\\\": \\\"91\\\",\\r\\n\"\r\n"
        		+ "        		+ \"    \\\"mobileNo\\\":\\\"9421075643\\\",\\r\\n\"\r\n"
        		+ "        		+ \"    \\\"type\\\": \\\"phone\\\"\\r\\n\"\r\n"
        		+ "        		+ \"}";

        // Set headers
       // String token = "YOUR_AUTH_TOKEN";
        String contentType = "application/json";

        // Send the POST request with headers
        RestAssured.given()
                .header("Content-Type", contentType)
              //  .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/c/account/loginWithOtp")
                .then()
                .statusCode(201)
                .log().all();
    }
}

