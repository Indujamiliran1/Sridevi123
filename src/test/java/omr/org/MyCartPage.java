package omr.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frame.org.BaseClass;

public  class MyCartPage extends BaseClass {
public	MyCartPage() {
	PageFactory.initElements(driver,this);
}
	
	
//	@FindBy(xpath="//h5[text()='My Cart']")
//	private WebElement mycart;
	
	
	@FindBy(xpath="//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']")
	private WebElement addrclick;
	
	
	@FindBy(xpath="//select[@placeholder='Select']")
	private WebElement addresstype ;
	
	
	@FindBy(xpath="//input[@placeholder='First name*']")
	private WebElement fname;
	
	
	@FindBy(xpath="//input[@placeholder='Last name*']")
	private WebElement lname;
	
	
	@FindBy(xpath="//input[@placeholder='Contact No*']")
	private WebElement contactnum;
	
	
	@FindBy(xpath="//input[@placeholder='House No*']")
	private WebElement housenum;
	
	
	@FindBy(xpath="//input[@placeholder='Address*']")
	private WebElement address ;
	
	
	@FindBy(name="country")
	private WebElement country;
	
	
	@FindBy(name="state")
	private WebElement state ;
	
	
	@FindBy(xpath="//select[@class='form-control height50 city']")
	private WebElement city;
	
	
	@FindBy(xpath="//input[@placeholder='Zip Code*']")
	private WebElement zip;
	
	
	@FindBy(xpath="(//button[text()='Save'])[3]")
	private WebElement save;
	
	@FindBy(xpath="//button[@class='font22 colorWhite fontSemiBold radius50 bgTheme px-5 py-2 borderNone hover1 text-center']")
	private WebElement placeorder;
	
	@FindBy(xpath="//h5[@class='font35 font-weight-bold color11 text-center pageTitle']")
	private WebElement mycart;
	
	@FindBy(xpath="//div[@class='font18 fontSemiBold color20 mb-4']")
private WebElement paddress;
	
	@FindBy(xpath="(//div[@class='font20 fontSemiBold color20 mb-4'])[1]")
private WebElement paymethod;
	
	
	
	public WebElement getMycart() {
		return mycart;
	}


	


	public WebElement getPlaceorder() {
		return placeorder;
	}


	


	private String name;


	private String name1;


	private String number;


	private String hosNo;


	private String addr;


	public WebElement getAddrclick() {
		return addrclick;
	}


	public WebElement getAddresstype() {
		return addresstype;
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getContactnum() {
		return contactnum;
	}


	public WebElement getHousenum() {
		return housenum;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getZip() {
		return zip;
	}


	public WebElement getSave() {
		return save;
	}
	
	public void myCart(String type,String name,String name1,String number,String hosNo,String addr,String countr,String stat,String cit,String zipcode,String c,String mo,String ye,String cv) throws InterruptedException {
	Thread.sleep(1000);
		elementClick(addrclick);
		
		elementSendkeys(addresstype,type);
		
		elementSendkeys(fname,name );
		elementSendkeys( lname,name1);
		elementSendkeys(contactnum,number );
		elementSendkeys(housenum,hosNo );
		elementSendkeys( address,addr);
		elementSendkeys(country,countr);
		elementSendkeys(state,stat);
		Thread.sleep(1000);
		elementSendkeys(city,cit);
		elementSendkeys(zip,zipcode);
		Thread.sleep(1000);
		elementClick(save);
		Thread.sleep(1000);
		elementSendkeys(cod,c);
		elementClick(visa);
		//elementSendkeys(cardnum,card);
		WebElement cardd = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		cardd.sendKeys("5555555555552222");
		elementSendkeys(mon,mo);
		Thread.sleep(1000);
		implicitWait();
		elementSendkeys(year,ye);
		Thread.sleep(1000);
		elementSendkeys(cvv,cv);
		elementClick(placeorder);
		
		
		
		
	}
	
	public String mycartp() {
		String elementGetText = elementGetText(mycart);
		System.out.println(elementGetText);
		return elementGetText;
	}
	
	public String addrp() {
		String elementGetText = elementGetText(paddress);
		System.out.println(elementGetText);
		return elementGetText;
	}
	
	public String ppaymethod() {
		String elementGetText = elementGetText(paymethod);
		System.out.println(elementGetText);
		return elementGetText;
	}
	
	
	
	
	@FindBy(id="payment_type")
	private WebElement cod;


	public WebElement getCod() {
		return cod;
	}
	
////	
	@FindBy(xpath="//label[text()=' Visa ']")
	private WebElement visa ;
////	
////	
//	@FindBy(xpath="//input[@placeholder='Card Number']")
//	private WebElement cardnum ;
////	
////	
	@FindBy(id="month")
	private WebElement mon ;
////	
////	
	@FindBy(xpath="(//select[@class='form-control'])[2]")
	private WebElement year ;
////	
////	
	@FindBy(xpath="//input[@placeholder='CVV']")
	private WebElement cvv ;
//	


	public WebElement getVisa() {
		return visa;
	}


	


//	public WebElement getCardnum() {
//		return cardnum;
//	}


	


	public WebElement getMon() {
		return mon;
	}


	


	public WebElement getYear() {
		return year;
	}


	


	public WebElement getCvv() {
		return cvv;
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
