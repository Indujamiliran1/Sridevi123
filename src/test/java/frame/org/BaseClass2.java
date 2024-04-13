package frame.org;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass2 {
	RequestSpecification requestSpecification;
	Response response;
	
	public void SetHeader(String headerName,String headerValue) {
		requestSpecification = RestAssured.given().headers(headerName,headerValue);	
	}
	
	
	public void addHeaders(Headers headers) {
		requestSpecification=RestAssured.given().headers(headers);
			
	}
	
	
		
	public Response addRequestType(String reqType,String endPoint) {
		
	switch (reqType) {
	case "GET":
		requestSpecification.when().get(endPoint);
		
		break;
	case "POST":
		requestSpecification.when().post(endPoint);
break;
	case "PUT":
		requestSpecification.when().put(endPoint);
		break;
	case "DELETE":
		requestSpecification.when().delete(endPoint);
		break;
	default:
		break;
	}
	return response;
	
	}
	
	
	public String getResponseBodyAsString(Response response) {
		String body = response.getBody().asString();
		return body;

	}
	public void addBody(String body) {
		requestSpecification.body(body);		
	}
	
	public int getResponseCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}
	
	


}
