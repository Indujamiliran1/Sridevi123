package ApiBaseC;

import org.testng.annotations.Test;

import frame.org.BaseClass2;

import io.restassured.response.Response;

public class JsonPath extends BaseClass2 {
	
	@Test
	public void singleUser() {
		SetHeader("Content-Type", "application/json");
		
		Response response = addRequestType("GET","https://omrbranch.com/api/flights?page=1");
		
		response.jsonPath();
		
	
		
		

	}

}
