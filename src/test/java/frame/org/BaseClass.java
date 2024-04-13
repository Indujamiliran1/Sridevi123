package frame.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
public	static WebDriver driver;
private static XSSFCell createCell;
	//1.enter url
	 public static void enterUrl(String string) {
		 driver.get(string);
	}
	 
	 //2.maximize window
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	//3.insert value in textbox
public void elementSendkeys(WebElement element,String data) {
		
		//visiblityOf(element);

		//if (isEnabled(element) && isDisplayed(element)) {
			element.sendKeys(data);
		}
	

//4.click button
public static void elementClick(WebElement element) {
	element.click();
}
	
//5.click ok in alert
public void acceptAlert() {
	Alert alert = driver.switchTo().alert();	
	alert.accept();
	}

//6.click cancel in alertbox
public void cancelAlertBox(WebElement element) {
	Alert alert = driver.switchTo().alert();
alert.dismiss();
}

//7.get text from webpage
public static String elementGetText(WebElement element) {
	String text = element.getText();
	return text;	
	}

//8.get inserted value from textbox
public void insertValue(WebElement element,String data) {
	element.sendKeys(data);	
	}

//9.close all window
public void closeAllBrowser() {
	driver.quit();
}

//10.close current window
public static void closeBrowser() {
	driver.close();
}

//11.get title
public String getPageTitle() {
	String title = driver.getTitle();
	return title;
}

//12.get current url
public void getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
}

//13.select dropdown option by text
public void selectOptionByText(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
}

//14.select dropdown option by index
public void selectOptionByIndex(WebElement element, int index) {
	Select select = new Select(element);
	select.selectByIndex(index);
}

//15.select dropdown option by attribute
public void selectOptionByAttributeValue(WebElement element, String value) {
	Select select = new Select(element);
	select.selectByValue(value);
}

//16.insert values in textbox by js
public void elementSendkeysJS(WebElement element1, String name) {
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("argument[0].setAttribute.value = '" + name + "'", element1);
}

//17.click button by js
public void clickButtonJS(WebElement element) {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()",element);
}



//18.launch browsers
public static void browserLaunch(String browserType) {
	switch (browserType) {
	case "CHROME":
		driver = new ChromeDriver();
		break;
	case "IE":
		driver = new InternetExplorerDriver();
		break;
	case "EDGE":
		driver = new EdgeDriver();
		break;
	case "FIREFOX":
		driver = new FirefoxDriver();
		break;

	default:
		break;
	}

}

//19.switch to child window
public void switchToChildWindow() {
	String pWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();
	for (String eachWindow : allWindows) {
		if (!pWindow.equals(eachWindow)) {
			driver.switchTo().window(eachWindow);
		}

	}
}

//20.switch to frame by index
public void switchToFrameByIndex(int index) {
	driver.switchTo().frame(index);
}

//21.switch to frame by frameid
public void switchToFrameByIdName(String idName) {
	driver.switchTo().frame(idName);
}

//22.find locator by id
public WebElement findLocatorById(String attributeValue) {
	WebElement element = driver.findElement(By.id(attributeValue));
	return element;
}

//23.find locator by name
public WebElement findLocatorByName(String attributeValue) {
	WebElement element = driver.findElement(By.name(attributeValue));
	return element;
}

//24.find locator by class name
public WebElement findLocatorByClassName(String attributeValue) {
	WebElement element = driver.findElement(By.className(attributeValue));
	return element;
}

//25.find locator by xpath
public WebElement findLocatorByXpath(String xpathExp) {
	WebElement element = driver.findElement(By.xpath(xpathExp));
	return element;
}

//26.get all options from dropdown as text
public List<String> getAllOptionsTextDD(WebElement element) {
	List<String> allOptionsText = new ArrayList<>();
	Select select = new Select(element);
	List<WebElement> options = select.getOptions();
	for (WebElement webElement : options) {
		String text = webElement.getText();
		allOptionsText.add(text);

	}
	return allOptionsText;
}

//27.get all options from dropdown as attribute






//28.get 1st selected option by dd
public String getFirstSelectedOption(WebElement element) {
	Select select=new Select(element);
	WebElement firstSelectedOption= select.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	System.out.println(text);
	return text;

}

//29.verify multi select option by dd
public  boolean isMultiple(WebElement element) {
	Select select=new Select(element);
	boolean multiple=select.isMultiple();
	System.out.println(multiple);
	return multiple;

}

//30.implicit wait
public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

//31.explicit wait
public void implictWait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}



//32.fluent wait




//33.isDisplayed
public boolean isDisplayed(WebElement element) {
	visibilityOf(element);
	boolean displayed = element.isDisplayed();
return displayed;
}


//34.isEnabled
public boolean isEnabled(WebElement element) {
	visibilityOf(element);
	boolean displayed = element.isEnabled();
	return displayed;
}

//35.isSelected
public boolean isSelected(WebElement element) {
	visibilityOf(element);
	boolean selected = element.isSelected();
	return selected;
}



//36.deselect by index
public void DeselectByIndex(WebElement element) {
	Select select=new Select(element);
	select.deselectByIndex(0);
}





//37. deselect by Attribute
public void DeselectByAttribute(WebElement element) {
	Select select=new Select(element);
	select.deselectByValue("");
}


//38. Deselect by Text
public void DeselectByText(WebElement element) {
	Select select=new Select(element);	
	select.deselectByVisibleText("");
}


//39. DeselectAll
public void DeselectAll(WebElement element) {
	Select select=new Select(element);
	select.deselectAll();
}


//40. Get the parent window
public void parentWindow() {
	String windowHandle = driver.getWindowHandle();	
}


//41. Get all window
public void allWindow() {
	 Set<String> windowHandles = driver.getWindowHandles();
}



//42. get clear textbox
public void clearTextbox(WebElement element) {
	element.clear();
}



//43.screenshot
public void screenshot(String name) throws IOException {
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("/saving path/screenshot.png"));
}


//44.take ss for element
public void whitebox(String name) throws IOException {
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File whitebox = screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(whitebox, new File("/saving path/screenshot.png"));
}

//45.mouse over action for single option
public void moveToElement(WebElement element) {
	Actions acti=new Actions(driver);
	acti.moveToElement(element).perform();
}

//46.Drag& drop
public void dragAndDrop() {
	Actions a=new Actions(driver);
	a.dragAndDrop(null,null).perform();
	
}


// 47.Right click
public void rightClick(WebElement element) {
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}

//48. Double click
public void doubleClick() {
	Actions action=new Actions(driver);
	action.doubleClick();
}

//49. Insert value in text box and enter
public  void elementSendkeysEnter(WebElement element,String name) {
element.sendKeys(name,Keys.ENTER);	
}



//50. Refresh page
public void refreshPage() {
	driver.navigate().refresh();
}







	

	
	public String getAttributeValue(WebElement element,String attname) {
	String attribute = element.getAttribute(attname);	
return attribute;
	}
	

	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	

	
	

	
	
	public static String getCellData(String sheetName,int rowNum,int cellNum) throws InvalidFormatException, IOException {
		String res="";
		File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\omrBranch.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		XSSFWorkbook w=new XSSFWorkbook(stream);
		
		XSSFSheet sheet=w.getSheet(sheetName);
		
		XSSFRow row = sheet.getRow(rowNum);
		
		XSSFCell cell = row.getCell(cellNum);
		
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateformat= new SimpleDateFormat("dd-MMM-yyy");
				 res= dateformat.format(date);
				
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (numericCellValue==round) {
					res=String.valueOf(round);
					
				} else {
					res=String.valueOf(numericCellValue);

				}

			}
			 break;

		default:
			break;
		}
		
		
		
		
		
		
		return res;
		

	}
	//
	public static void updateCellData(String sheetName,int rowNum,int cellNum,String oldData,String newData) throws IOException {
		
		File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\omrBranch.xlsx");
		
		 FileInputStream fileInputStream=new FileInputStream(file);
		 
		 XSSFWorkbook w=new XSSFWorkbook(fileInputStream);
			
			XSSFSheet sheet=w.getSheet(sheetName);
			
			XSSFRow row = sheet.getRow(rowNum);
			
			XSSFCell cell = row.getCell(cellNum);
			
			String value = cell.getStringCellValue();
			if (value.equals(oldData)) {
				cell.setCellValue(newData);
				
			} 
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			w.write(fileOutputStream);

			}
	
	//
	public static void createCellAndCellData(String sheetName,int rowNum,int cellNum,String text ) throws IOException {
		File file=new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\excel\\omrBranch.xlsx");
		
		 FileInputStream fileInputStream=new FileInputStream(file);
		 
		 XSSFWorkbook w=new XSSFWorkbook(fileInputStream);
			
			XSSFSheet sheet=w.getSheet(sheetName);
			
			XSSFRow row = sheet.getRow(rowNum);
			
			XSSFCell cell = row.createCell(cellNum);
			
	cell.setCellValue(text);
			
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			w.write(fileOutputStream);
	}
	

	//visibilityOf
	public void visibilityOf(WebElement element) {
		WebDriverWait driverWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}
			
			
			
			
			
			

			
			
		

	
	
	
	
		

	}

	
	
	
	
	
	
	
	
	
	


