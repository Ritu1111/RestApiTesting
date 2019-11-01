package com.Rest;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Base 
{
	GetRequest get_obj = new GetRequest();
	PostRequest post_obj =new PostRequest();
	Patch patch_obj =new Patch();
	DeleteRequest delete_obj = new DeleteRequest();
	PutRequest put_obj = new PutRequest();
	DataProviders data =new DataProviders();

	@BeforeSuite
	public void startSuite() {
    	RestAssured.baseURI="http://a.wunderlist.com/api/v1/";
    	 Logger logger = Logger.getLogger("wunderListAPIlog4jfile");
    	 PropertyConfigurator.configure("C:\\Users\\ritu01\\Desktop\\Appium\\Rest\\src\\main\\java\\com\\Rest\\log4j.properties");
    	 logger.setLevel(Level.DEBUG);
    	 logger.info("log4j's statement");
    }
	
	@Test
	public void getTest1() {
		get_obj.get("lists");
		
	}
	@Test
	public void getTest2() {
		get_obj.get("folders");
		
	}
	
	@Test
	public void PostTest1() {
		post_obj.post("lists", data.PostBody_lists1());
	
	}
	@Test
	public void PostTest2() {
		post_obj.post("lists", data.PostBody_lists2());
	
	}
	@Test
	public void PatchTest1() {
		patch_obj.patchReq("lists/"+data.id(), data.PatchBody_lists1());
	}
	@Test
	public void PatchTest2() {
		patch_obj.patchReq("lists/"+data.id(), data.PatchBody_lists2());
	}
	@Test
	public void PutTest1() {
		put_obj.put("list/"+data.id(),data.PutBody_lists1());
	}
	@Test
	public void PutTest2() {
		put_obj.put("list/"+data.id(),data.PutBody_lists2());
	}
	@Test
	public void DeleteTest1() {
		delete_obj.delete("lists/"+data.del_id1());
	}
	@Test
	public void DeleteTest2() {
		delete_obj.delete("lists/"+data.del_id2());
	}
}
