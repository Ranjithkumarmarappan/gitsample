package org.apirest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicRequest {
	
	@Test
	private void tc() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		RequestSpecification queryParam = requestSpecification.queryParam("page", "2");
		Response request = requestSpecification.request(Method.GET,"/api/users");
		String asString = request.getBody().asPrettyString();
		System.out.println(asString);
		
		
		
	
		
	}

}
