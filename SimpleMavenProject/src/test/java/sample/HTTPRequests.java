package sample;


import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class HTTPRequests {
	int id;
	@Test
	void getUser() {
		
	given()
		
		
	.when()
		.get("https://reqres.in/api/users?page=2")
		
	.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
	}
	
	@Test
	void createUser() {
		
		//HashMap data=new HashMap();
		
	id=given()
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		
	.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	
	//.then()
		//.statusCode(200)
	//	.log().all();
	}
	
	@Test
	void updateUser() {
		
		//HashMap data=new HashMap();
		
	given()
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		
	.when()
		.put("https://reqres.in/api/users/"+id)
		
	.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	void delteUser() {
		
		//HashMap data=new HashMap();
		
	given()
		.contentType("application/json")
		
		
	.when()
		.delete("https://reqres.in/api/users/"+id)
		
	.then()
		.statusCode(204)
		.log().all();
	}


}
