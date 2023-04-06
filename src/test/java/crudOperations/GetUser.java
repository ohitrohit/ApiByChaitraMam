package crudOperations;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class GetUser {

	
	public static void main(String[] args) {
		
		RequestSender res=RestAssured.when();
		Response resp=res.get("https://reqres.in/api/users?page=2");
		resp.then().log().all();
	}
}
