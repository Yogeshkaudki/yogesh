package petStore;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class UpdatePet {

	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		given().header("Content-Type","application/json").body("{\r\n"
				+ "  \"id\": 9223372036854286439,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"bauri5\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"saka1\",\r\n"
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
		.when().put("/pet")
		.then().assertThat().log().all().statusCode(200);

	}

}
