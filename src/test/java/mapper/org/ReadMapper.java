package mapper.org;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadMapper {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\src\\test\\resources\\Employee.json")	;
	
	ObjectMapper mapper=new ObjectMapper();
	
	Sample2 s=mapper.readValue(file,Sample2.class);
	
	System.out.println(s.getPage());
	System.out.println(s.getPer_page());
	System.out.println(s.getTotal());
	System.out.println(s.getTotal_pages());
	
	List<Sample> data=s.getData();
	
	for (int i = 0; i <data.size(); i++) {
		Sample sample = data.get(i);
		
		System.out.println(sample.getId());
		System.out.println(sample.getURL());
		System.out.println(sample.getCountry());
		System.out.println(sample.getFlightName());
		System.out.println(sample.getDestinations());
		
		Support support=s.getSupport();
		
		System.out.println(support.getText());
		System.out.println(support.getUrl());
		
	}
	
	
		
		
	}

}
