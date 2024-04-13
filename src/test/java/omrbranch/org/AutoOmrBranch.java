package omrbranch.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoOmrBranch {
	
	//private static final Object[] Argument = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.id("email"));
		gmail.sendKeys("indujatest98@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Indujamani@123");
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Login']"));
		click.click();
		
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
		String t = text.getText();
		System.out.println(t);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		Thread.sleep(2000);
		
	
		WebElement search1 = driver.findElement(By.id("search"));
		search1.sendKeys("nuts");
		
		//WebElement pselect = driver.findElement(By.xpath("//p[text()='Happilo 100% Natural Premium California Almonds | Premium Badam Giri in Fruit & Nuts']"));
		//pselect.click();
		WebElement sea = driver.findElement(By.xpath("//button[@class='btn font16 bgTheme colorWhite radius50']"));
		sea.click();
		
		WebElement fon = driver.findElement(By.xpath("//h5[@class='sectionTitle font35 font-weight-bold color11']"));
		String ge = fon.getText();
		System.out.println(ge);
		
		WebElement add1 = driver.findElement(By.xpath("//a[text()='Add']"));
		add1.click();
		
		WebElement add2 = driver.findElement(By.xpath("(//button[text()='Add'])[2]"));
		add2.click();
		Thread.sleep(1000);
		
		WebElement gotocart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		gotocart.click();
		
		WebElement pro = driver.findElement(By.xpath("//h5[text()='My Cart']"));
		String pri = pro.getText();
		System.out.println(pri);
		
		WebElement close = driver.findElement(By.xpath("(//a[@class='allinone close'])[2]"));
		close.click();
		
		Thread.sleep(1000);
		
		WebElement search2 = driver.findElement(By.id("search"));
		search2.sendKeys("nuts");
		
		WebElement peselect = driver.findElement(By.xpath("//p[text()='Happilo 100% Natural Premium California Almonds | Premium Badam Giri in Fruit & Nuts']"));
		peselect.click();
		
		WebElement add11 = driver.findElement(By.xpath("//a[text()='Add']"));
		add11.click();
		
		WebElement add22 = driver.findElement(By.xpath("(//button[text()='Add'])[2]"));
		add22.click();
		Thread.sleep(1000);
		
		WebElement gotocart2 = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		gotocart2.click();
		
		WebElement textaddress = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
		String addr = textaddress.getText();
		System.out.println(addr);
		
		
		
		WebElement addclk = driver.findElement(By.xpath("//img[@src='https://www.omrbranch.com/front/images/plus.png']"));
		addclk.click();
		
		
		WebElement sel = driver.findElement(By.id("address_type"));
		sel.click();
		Select s=new Select(sel);
		s.selectByVisibleText("Home");
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First name*']"));
		fname.sendKeys("induja");
		
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last name*']"));
		lname.sendKeys("mani");
		
		WebElement contact = driver.findElement(By.xpath("//input[@placeholder='Contact No*']"));
		contact.sendKeys("8987654567");
				
		
		WebElement house = driver.findElement(By.xpath("//input[@placeholder='House No*']"));
		house.sendKeys("no:345");
		
		WebElement address = driver.findElement(By.xpath("//input[@placeholder='Address*']"));
		address.sendKeys("no:345 anna nagar chennai");
		
		WebElement countr = driver.findElement(By.name("country"));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	WebElement st = driver.findElement(By.name("state"));
	Select se=new Select(st);
	se.selectByVisibleText("Tamil Nadu");
	
	WebElement city = driver.findElement(By.name("city"));
	Select c=new Select(city);
	c.selectByVisibleText("Tirunelveli");
	
	
	
	WebElement save = driver.findElement(By.xpath("(//button[text()='Save'])[3]"));
	save.click();
	Thread.sleep(2000);
	
	WebElement pay = driver.findElement(By.xpath("//div[text()='  Payment Method ']"));
	String tex = pay.getText();
	System.out.println(tex);
	
	Thread.sleep(1000);
	
	WebElement paym = driver.findElement(By.id("payment_type"));
	Select sl=new Select(paym);
	sl.selectByVisibleText("Debit Card");
	
	
	Thread.sleep(1000);
	WebElement visa = driver.findElement(By.xpath("//label[text()=' Visa ']"));
	visa.click();
	
	
	WebElement cardd = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
	cardd.sendKeys("5555555555552222");
	
	WebElement mon = driver.findElement(By.name("month"));
	Select sele=new Select(mon);
	sele.selectByVisibleText("August");
	
	WebElement y = driver.findElement(By.id("year"));
	Select ll=new Select(y);
	ll.selectByVisibleText("2034");
	
	WebElement cv = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
	cv.sendKeys("675");
	
	
	WebElement pd = driver.findElement(By.xpath("//div[text()='Price Details']"));
	String te = pd.getText();
	System.out.println(te);
	
	
	WebElement ta = driver.findElement(By.xpath("//span[text()='Total Amount']"));
	String am = ta.getText();
	System.out.println(am);
	
	
	WebElement amo = driver.findElement(By.xpath("(//span[text()='580.00'])[1]"));
	String x = amo.getText();
	System.out.println(x);
	
	WebElement gt = driver.findElement(By.xpath("//span[text()='Grand Total']"));
	String g = gt.getText();
	System.out.println(g);
	
	WebElement amount = driver.findElement(By.xpath("(//span[text()='580.00'])[2]"));
	String gra = amount.getText();
	System.out.println(gra);
	
	
	WebElement po = driver.findElement(By.id("placeOrder"));
	po.click();
	
	Thread.sleep(1000);
	
//	WebElement tt = driver.findElement(By.xpath("(//p[@class='font18 color36 mb-0'])[4]"));
//	String col = tt.getText();
//	System.out.println(col);
	WebElement gmail2 = driver.findElement(By.id("email"));
	gmail2.sendKeys("indujatest98@gmail.com");
	
	WebElement pass2 = driver.findElement(By.id("pass"));
	pass2.sendKeys("Indujamani@123");
	
	WebElement click2 = driver.findElement(By.xpath("//button[text()='Login']"));
	click2.click();
	
	WebElement drop = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
	drop.click();
	
	WebElement my = driver.findElement(By.xpath("//a[text()='My Account']"));
	my.click();
	
	WebElement ord = driver.findElement(By.xpath("//a[text()='orders']"));
	ord.click();
	Thread.sleep(3000);
	
	WebElement no = driver.findElement(By.xpath("(//p[text()='Order No :'])[1]"));
	String er = no.getText();
	System.out.println(er);
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
