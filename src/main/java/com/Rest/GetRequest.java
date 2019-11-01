package com.Rest;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	DataProviders data =new DataProviders();
	
	public void get(String endPoint){
		RequestSpecification request = RestAssured.given()
				.headers(data.headers());
		
		ValidatableResponse res=request
    			.log()
    			.all()
    			.when()
    			.get(endPoint)
    			.then()
    			.assertThat()
    			.statusCode(200)
    			.log()
    			.ifError();
    	
    	System.out.println(res.toString());
	}

}
