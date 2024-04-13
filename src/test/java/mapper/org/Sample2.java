package mapper.org;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ext.Java7Support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sample2 {
	private int page;
	 private int per_page;
	 private int total;
	 private int total_pages;
	 private List<Sample> data;
	 private Support support;	
	
	

}
