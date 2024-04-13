package omr.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import frame.org.BaseClass;

public class AnnotationJunit {
	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass() {
		driver= new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void AfterClass() {
		driver.quit();
	}
	
	@Before
	public  void beforeMethod() throws IOException {	
		long time = System.currentTimeMillis();
		System.out.println(time);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		 File file = new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\name.png");
		 FileUtils.copyFile(screenshotAs, file);	
		

	}
	
	@After
	public  void afterMethod() throws IOException {
		long time = System.currentTimeMillis();
		System.out.println(time);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		 File file = new File("C:\\Users\\user\\eclipse-workspace\\FrameworkProject2024\\indu.png");
		 FileUtils.copyFile(screenshotAs, file);
			
	}
		
	@Test
	public void login() {
		WebElement gmail = driver.findElement(By.id("email"));
		gmail.sendKeys("indujatest98@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Indujamani@123");
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Login']"));
		click.click();

	}
	

}
