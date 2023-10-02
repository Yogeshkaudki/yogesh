package petStore;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class GetPet {

	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		given().header("Content-Type","application/json")
		.when().get("pet/9223372036854286439")
		.then().log().all().statusCode(200);
		

	}

}
