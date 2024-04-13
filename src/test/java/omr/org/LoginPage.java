package omr.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frame.org.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txtEmail;
	
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement txtPass;
	
	
	@FindBy(xpath="//button[@value='login']")
	private WebElement btnlogin;
	
	

	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	public void login(String username,String password) throws InterruptedException {
		implictWait();
		elementSendkeys(txtEmail,username);
		elementSendkeys(txtPass,password);
		elementClick(btnlogin);
		
		
	}
	

}
