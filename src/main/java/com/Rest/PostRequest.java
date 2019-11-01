package com.Rest;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	DataProviders data =new DataProviders();
	
	public void post(String endPoint, HashMap<String ,Object> Body){
		RequestSpecification request = RestAssured.given()
				.headers(data.headers());
		
		ValidatableResponse res=request
    			.log()
    			.all()
    			.body(Body)
    			.when()
    			.post(endPoint)
    			.then()
    			.assertThat()
    			.statusCode(201)
    			.log().ifError();
    	
    	System.out.println(res.toString());
    	
	}
}
