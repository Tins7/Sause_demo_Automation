package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Login extends Base{
	public WebDriver driver;
	
	@FindBy(id="user-name")
	public WebElement uname;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(id="login-button")
	public WebElement lbtn;
	
	
	@FindBy(id="react-burger-menu-btn")
	public WebElement menubtn;
	
	@FindBy(id="logout_sidebar_link")
	public WebElement logoutbtn;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) throws InterruptedException {
		
		
		Thread.sleep(1500);
		uname.sendKeys(username);
	}
	
	public void enterPassword(String password) throws InterruptedException {
		//highlightElement(uname);
		Thread.sleep(1500);
		pass.sendKeys(password); 
	}
	
	public void ClickLogin() throws InterruptedException {
		//highlightElement(uname);
		Thread.sleep(1500);
		lbtn.click();
	}
	
	public void menu() throws InterruptedException {
		//highlightElement(uname);
		Thread.sleep(1500);
		menubtn.click();
	}
	
	public void logout() throws InterruptedException {
	//	highlightElement(uname);
		Thread.sleep(1500);
		logoutbtn.click();
	}
	
	
	
	

}
