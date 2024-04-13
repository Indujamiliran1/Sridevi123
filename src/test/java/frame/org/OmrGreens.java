package frame.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OmrGreens {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\StudentsDetails.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		XSSFWorkbook w=new XSSFWorkbook(stream);
		
		XSSFSheet s = w.getSheet("Sheet1");
		
		
		for (int i = 0; i <s.getPhysicalNumberOfRows();i++) {
			XSSFRow r = s.getRow(i);
			
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				XSSFCell c = r.getCell(j);
				CellType type = c.getCellType();
				switch (type) {
				case STRING://text
					String value = c.getStringCellValue();
					System.out.println(value);
					
					break;
				case NUMERIC://date 
					if (DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
						String format = dateFormat.format(date);
								System.out.println(format);
						
					} else {//num
						double d = c.getNumericCellValue();
						long l=(long)d;
						String ogg = String.valueOf(l);
						System.out.println(ogg);
						
//						long round = Math.round(d);
//						if (round==d) {
//							String valueOf = String.valueOf(round);
//							System.out.println(valueOf );
//							
//						} else {
//String of = String.valueOf(d);
//System.out.println(of);
						}
					
		
				break;	
				default:
					break;
				}
					
			}
		}
	}
}
		



			
		
		
			
		
		
		
	


