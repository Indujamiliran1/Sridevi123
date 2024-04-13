package omr.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensOmr {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("indujatest98@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Indujamani@123");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
	}
}
