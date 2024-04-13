package mapper.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sample {
	
	
	private int id;
	private String flightName;
	    @JsonProperty("Country") 
	    private String country;
	    @JsonProperty("Destinations") 
	    private String destinations;
	    @JsonProperty("URL") 
	    private String uRL;	
		

}
