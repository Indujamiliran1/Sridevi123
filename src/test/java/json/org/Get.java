package json.org;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
	public static void main(String[] args) {
		RequestSpecification reqspec;
		
		 reqspec = RestAssured.given();
		 
		 reqspec = reqspec.header("content-type","application/json") ;
		 
		 Response response = reqspec.get("https://omrbranch.com/api/flights?page=1");
		 
		 int statusCode = response.getStatusCode();
		 
		 String aString = response.asString();
		 System.out.println(aString);
		 
		 String aPrettyString = response.asPrettyString();
		 System.out.println(aPrettyString);
		 
		
		
	}

}
