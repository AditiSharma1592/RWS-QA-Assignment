package helpers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;






public class BaseClass {
	static String baseURI = "https://reqres.in/api/"; //end point
	 public static String path = "/users";
	
	// common data to be used across all step definition classes
  
	public static RequestSpecification request;	
	public static Response response;
	
	public static RequestSpecification createRequestSpecification()
	{
		
		        return new RequestSpecBuilder().setBaseUri(baseURI)
		                .setBasePath("/users")
		                .setContentType(ContentType.JSON)
		                .build();
		   
	}
	
	 public static Response GETall() {
	        return RestAssured.given().spec(createRequestSpecification())
	                .get().then().log().all().extract().response();
	    }

    
	 public static Response GETwithId(String id) {
	        return RestAssured.given().spec(createRequestSpecification())
	                .get(id).then().log().all().extract().response();
	    }
	 
	 public static Response POST(Map<String, Object> newUserPayload) {
	        return RestAssured.given().spec(createRequestSpecification())
	                .body(newUserPayload)
	                .post().then().log().all().extract().response();
	    }

	 public static Response PUT(Map<String, Object> updateUserPayload,String id) {
	        return RestAssured.given().spec(createRequestSpecification())
	                .body(updateUserPayload)
	                .put(id).then().log().all().extract().response();
	    }
	 
	    public static Response DELETE(String id) {
	        return RestAssured.given().spec(createRequestSpecification())
	                .delete(id).then().log().all().extract().response();
	    }


    }
