package petStore;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class CreatePet {

	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/v2";
         given().header("Content-Type","application/json").body("{\r\n"
         		+ "  \"id\": 0,\r\n"
         		+ "  \"category\": {\r\n"
         		+ "    \"id\": 0,\r\n"
         		+ "    \"name\": \"brunp1\"\r\n"
         		+ "  },\r\n"
         		+ "  \"name\": \"sakti\",\r\n"
         		+ "  \"photoUrls\": [\r\n"
         		+ "    \"string\"\r\n"
         		+ "  ],\r\n"
         		+ "  \"tags\": [\r\n"
         		+ "    {\r\n"
         		+ "      \"id\": 0,\r\n"
         		+ "      \"name\": \"string\"\r\n"
         		+ "    }\r\n"
         		+ "  ],\r\n"
         		+ "  \"status\": \"available\"\r\n"
         		+ "}")
         .when().post("/pet")
         .then().assertThat().log().all().statusCode(200);
	}

}
