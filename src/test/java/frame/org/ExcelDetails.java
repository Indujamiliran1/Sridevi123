package frame.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDetails {
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\newdetails.xlsx");
		
		
		FileInputStream stream=new FileInputStream(file);
		
		
		XSSFWorkbook w=new XSSFWorkbook(stream);
		
		
		XSSFSheet sheet = w.getSheet("Sheet1");
		
		
		XSSFRow row = sheet.getRow(2);
		
		XSSFCell cell = row.getCell(2);
		System.out.println(cell);
	}

	
}


