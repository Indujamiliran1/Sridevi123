package json.org;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Patch {
	public static void main(String[] args) {
		RequestSpecification req;
		
		req = RestAssured.given();
		
		req = req.header("content type","json");
		
		req.body("{\r\n"
				+ "    \"Destinations\": 70\r\n"
				+ "}");
		
		Response response = req.patch("https://omrbranch.com/api/flight/24160");
		
		int statusCode = response.getStatusCode();
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}
	

}
