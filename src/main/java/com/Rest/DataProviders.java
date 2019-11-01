package com.Rest;

import java.util.HashMap;

public class DataProviders {

	public HashMap<String, String> headers() {
		HashMap<String,String> HeaderMap = new HashMap<String, String>();
		HeaderMap.put("Content-Type", "application/json");
		HeaderMap.put("X-Access-Token", "b68c055a286e4dd156748a68b6729241425c7cc8d72717d4ab76446f3fcf");
		HeaderMap.put("X-Client-ID", "d892d630ca5887b81c59");
		return HeaderMap;
	}
	
	public HashMap<String ,Object> PostBody_lists1(){
		HashMap<String,Object> BodyMap = new HashMap<String, Object>();
		BodyMap.put("title", "Hello world");
		return BodyMap;
	}
	
	public HashMap<String ,Object> PostBody_lists2(){
		HashMap<String,Object> BodyMap = new HashMap<String, Object>();
		BodyMap.put("title", "1234567");
		return BodyMap;
	}
	public HashMap<String ,Object> PatchBody_lists1(){
		HashMap<String,Object> BodyMap = new HashMap<String, Object>();
		BodyMap.put("title", "Hi all");
		BodyMap.put("revision", 1);
		return BodyMap;
	}
	public HashMap<String ,Object> PatchBody_lists2(){
		HashMap<String,Object> BodyMap = new HashMap<String, Object>();
		BodyMap.put("title", "Heyyy");
		BodyMap.put("revision", 2);
		return BodyMap;
	}
	public HashMap<String ,Object> PutBody_lists1(){
		HashMap<String,Object> BodyMap = new HashMap<String, Object>();
		BodyMap.put("title","QWERTY" );
		BodyMap.put("revision", 3);
		return BodyMap;
	}
	public HashMap<String ,Object> PutBody_lists2(){
		HashMap<String,Object> BodyMap = new HashMap<String, Object>();
		BodyMap.put("title","qwerty" );
		BodyMap.put("revision", 4);
		return BodyMap;
	}
	public String id() {
		return "409118530";
	}
	
	public String del_id1() {
		return "409118565";
	}
	public String del_id2() {
		return "409120156";
	}
}

