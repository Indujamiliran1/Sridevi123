package ApiBaseC;


import org.testng.Assert;
import org.testng.annotations.Test;

import frame.org.BaseClass2;
import io.restassured.response.Response;


public class Sample extends BaseClass2 {
	
	@Test
	public void getSingleUser() {
		SetHeader("content-Type", "Application/json");
		
		Response response = addRequestType("GET", "https://omrbranch.com/api/flights?page=1");
		
		int responseCode = getResponseCode(response);
		System.out.println(responseCode);
		
		Assert.assertEquals(responseCode, 200,"verify the http status code");
		
		String body = getResponseBodyAsString(response);
		System.out.println(body);
	}

}
