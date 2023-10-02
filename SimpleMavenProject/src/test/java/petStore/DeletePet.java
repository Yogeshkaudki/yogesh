package petStore;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class DeletePet {

	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		given().header("Content-Type","application/json")
		.when().delete("/pet/9223372036854286439")
		.then().log().all().statusCode(200);

	}

}
//content type,set cookies, add auth,add parm,set headers info etc..
//get,post.put,delete
//validate status code,extract response,extract headers cookies and response body
//9223372036854286439
//9223372036854245123