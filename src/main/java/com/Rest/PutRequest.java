package com.Rest;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
DataProviders data =new DataProviders();
	
	public void put(String endPoint, HashMap<String ,Object> Body){
		RequestSpecification request = RestAssured.given()
				.headers(data.headers());
		
		ValidatableResponse res=request
    			.log()
    			.all()
    			.body(Body)
    			.when()
    			.put(endPoint)
    			.then()
    			.assertThat()
    			.statusCode(200)
    			.log()
    			.ifError();
    	
    	System.out.println(res.toString());
	}

}
