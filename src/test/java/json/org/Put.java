package json.org;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	public static void main(String[] args) {
		RequestSpecification reqs ;
		
		 reqs = RestAssured.given();
		 
		reqs= reqs.header("content type","json");
		
		reqs= reqs.body("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": 17,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");
		
		Response response = reqs.put("https://omrbranch.com/api/flight/24158");
		
		int statusCode = response.getStatusCode();
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}

}
