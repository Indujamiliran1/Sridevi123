package omr.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frame.org.BaseClass;

public class MyAcct extends BaseClass {
	
	public MyAcct() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
private WebElement welcome;


@FindBy(xpath="//a[text()='My Account']")
private WebElement acct;


@FindBy(xpath="(//a[@class='nav-link font16 fontSemiBold text-capitalize'])[1]")
private WebElement ord;

@FindBy(xpath="(//p[@class='mb-0'])[1]")
private WebElement ordernumber;

@FindBy(xpath="//h5[@class='font35 font-weight-bold color11 text-center pageTitle']")
private WebElement ordDetails;

public String orderNumber() throws IOException, InterruptedException {
	//System.out.println("induja");
	elementClick(welcome);
	elementClick(acct);
	elementClick(ord);
	Thread.sleep(5000);
	String elementGetText = elementGetText(ordernumber);
	System.out.println(elementGetText);
	return elementGetText;
	
	
	
	
	
	
}
public String orderdetails() throws InterruptedException {
	Thread.sleep(1000);
	String elementGetText = elementGetText(ordDetails);
	System.out.println(elementGetText);
	return elementGetText;
}





}
