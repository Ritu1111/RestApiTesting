package com.Rest;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

DataProviders data =new DataProviders();
	
	public void delete(String endPoint){
		RequestSpecification request = RestAssured.given().queryParam("revision", 1)
				.headers(data.headers());
		
		ValidatableResponse res=request
    			.log()
    			.all()
    			.when()
    			.delete(endPoint)
    			.then()
    			.assertThat()
    			.statusCode(204)
    			.log()
    			.ifError();
    	
    	System.out.println(res.toString());
    	
	}
}
