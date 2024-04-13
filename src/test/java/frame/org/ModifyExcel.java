package frame.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyExcel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\newdetails.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		
		XSSFWorkbook w=new XSSFWorkbook(stream);
		
		
		XSSFSheet s = w.getSheet("Sheet1");
		
		
		XSSFRow r = s.getRow(0);
		
		
		XSSFCell c = r.getCell(0);
		
		
		String value = c.getStringCellValue();
		
		if (value.equals("name")) {
			c.setCellValue("Username");
		}
		
		
		FileOutputStream out=new FileOutputStream(f);
		
		
		w.write(out);
		System.out.println("done...");
		
		
		
		
		
		
		
		
	}

}
