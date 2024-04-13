package frame.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Types {
	public static void main(String[] args) throws IOException {
		
	
	
	File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\types.xlsx");

	FileInputStream stream=new FileInputStream(file);
	
	
	XSSFWorkbook w=new XSSFWorkbook(stream);
	
	XSSFSheet s=w.getSheet("Sheet1");
	
	
	for (int i = 0;i< s.getPhysicalNumberOfRows(); i++) {
		XSSFRow r = s.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			XSSFCell c = r.getCell(j);
			
			CellType type = c.getCellType();
			System.out.println(type);
			
			
			
			
		}
		
		
	}
	
	
	
	
	
	}	
	
}
