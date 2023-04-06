package crudOperations;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

	public static void main(String[] args) {
		
		//Create the data/request body
		
		HashMap map = new HashMap();
		map.put("name", "Rohit Rajpoot");
		map.put("job", "Tester");
		
		//send a request
		RequestSpecification res =RestAssured.given();
		res.body(map);
		res.contentType(ContentType.JSON);
		
		Response resp=res.post("https://reqres.in/api/users");
		
		//validation
		
		resp.then().log().all();
		
		
	}
}
