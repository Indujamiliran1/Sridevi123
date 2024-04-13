package json.org;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get2 {
	public static void main(String[] args) {
		RequestSpecification reqspec;
		
		 reqspec = RestAssured.given();
		 
		 RequestSpecification header = reqspec.header("contemt-type","json");
		 
		 Response response = reqspec.get("https://omrbranch.com/api/flight/24120");
		 
		 int statusCode = response.getStatusCode();
		 
		 String asString = response.asString();
		 System.out.println(asString);
		 
		 String asPrettyString = response.asPrettyString();
		 System.out.println(asPrettyString);
	}

}
