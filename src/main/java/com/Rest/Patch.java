package com.Rest;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Patch {
DataProviders data =new DataProviders();
	
	public void patchReq(String endPoint,HashMap<String ,Object> Body){
		RequestSpecification request = RestAssured.given()
				.headers(data.headers());
		
		ValidatableResponse res=request
    			
    			.body(Body)
    			.when()
    			.patch(endPoint)
    			.then()
    			.assertThat().statusCode(200)
    			.log()
    			.ifError();
    	
    	System.out.println(res.toString());
    	
	}

}
