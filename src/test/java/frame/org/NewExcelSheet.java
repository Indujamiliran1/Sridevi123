package frame.org;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelSheet {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\newexcelsheet.xlsx");
		
		XSSFWorkbook w=new XSSFWorkbook();
		
		XSSFSheet s=w.createSheet("Hello");
		
		
		XSSFRow row = s.createRow(0);
		
		XSSFCell cell = row.createCell(0);
		
		
		cell.setCellValue("Name");
		
		FileOutputStream out=new FileOutputStream(f);
		
		w.write(out);
		System.out.println("done..");
		
		
		
	}

}
