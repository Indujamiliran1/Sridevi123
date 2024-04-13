package mapper.org;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class WriteMapper {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	
		File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\src\\test\\resources\\Employee.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		List<Sample> data=new ArrayList<Sample>();
		
		Sample s1=new Sample(3,"AirIndia","India","58","https://en.wikipedia.org//wiki//Air_India");
		Sample s2=new Sample(18,"AirIndia","kailasa","55","https://en.wikipedia.org//wiki//Air_India");
		Sample s3=new Sample(22,"AirSara","Oman","608","https://en.wikipedia.org//wiki//Air_India");
		Sample s4=new Sample(33,"AirIndia","India","20","https://en.wikipedia.org//wiki//Air_India");
		Sample s5=new Sample(36,"Srilankan AriLines","SriLanka","56","https://en.wikipedia.org//wiki//Sri_Lanka");
		Sample s6=new Sample(42,"AirIndia", "India","98","https://en.wikipedia.org/wiki/Air_India");
		
		data.add(s1);
		data.add(s2);
		data.add(s3);
		data.add(s4);
		data.add(s5);
		data.add(s6);
		
		Support support=new Support("https://omrbranch.com","For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		
		Sample2 samp=new Sample2(1,6,5846,975,data,support);
		
		mapper.writeValue(file, samp);
		
				
		
		
		
		
	}

}
