package json.org;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
public static void main(String[] args) {
	RequestSpecification req ;
	
	req = RestAssured.given();
	
	req= req.header("content type","json");
	
	Response response = req.delete("https://omrbranch.com/api/flight/24162");
	
	int statusCode = response.getStatusCode();
	
	String asString = response.asString();
	System.out.println(asString);
	
	String asPrettyString = response.asPrettyString();
	System.out.println(asPrettyString);
}
}
