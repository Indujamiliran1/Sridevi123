package omr.org;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frame.org.BaseClass;

public class SearchProductPage extends BaseClass{
public	SearchProductPage() {
	PageFactory.initElements(driver, this);
}
	
//	@FindBy(xpath="(//li[@class='dropdown'])[1]")
	//private WebElement txtWelcome;
	
	
	@FindBy(id="search")
	private WebElement txtSearchButton;

	 
//public WebElement getTxtWelcome() {
//		return txtWelcome;
//	}
	@FindBy(xpath="//button[@class='btn font16 bgTheme colorWhite radius50']")
	private WebElement btnclk;
	
	@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement loginSuccessMsg;


	public WebElement getLoginSuccessMsg() {
		return loginSuccessMsg;
	}


	


	public WebElement getBtnclk() {
		return btnclk;
	}


	public WebElement getTxtSearchButton() {
		return txtSearchButton;
	}
	
public void search(String name) {
	elementSendkeys(txtSearchButton,name);
	elementClick(btnclk);
}

public String verifyLoginSuccessMsg() {
	String loginmsg = elementGetText(loginSuccessMsg);
	System.out.println(loginmsg);
	return loginmsg;
}

}




	


	


