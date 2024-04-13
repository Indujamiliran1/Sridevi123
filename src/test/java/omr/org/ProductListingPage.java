package omr.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frame.org.BaseClass;

public class ProductListingPage extends BaseClass {
public	ProductListingPage() {
	PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath="//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-18']")
	private WebElement add1;
	
	
	@FindBy(xpath="(//button[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 variant_btn'])[3]")
private WebElement add2;
	
	
	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement addToCart;
	
	@FindBy(xpath="//h5[@class='sectionTitle font35 font-weight-bold color11']")
	private WebElement searchpNuts;


	public WebElement getSearchpNuts() {
		return searchpNuts;
	}


	public WebElement getAdd1() {
		return add1;
	}


	public WebElement getAdd2() {
		return add2;
	}


	public WebElement getAddToCart() {
		return addToCart;
	}
	
	
	public void click() throws InterruptedException {
		elementClick(add1);
		elementClick(add2);
		Thread.sleep(1000);
		elementClick(addToCart);
	}
	public String searchNuts() {
		String elementGetText = elementGetText(searchpNuts);
		System.out.println(elementGetText);
		return elementGetText;
		
	}
}
