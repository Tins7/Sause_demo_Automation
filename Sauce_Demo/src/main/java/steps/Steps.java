package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class Steps extends Base {
	
 	public WebDriver driver;
	WebElement ele;
	Login objlogin;
	
	
	
	@Given("user launch the url")
	public void user_launch_the_url() throws InterruptedException {
		
		driver = openUrl();
    
	}

	@When("the user enter valid credentials")
	public void the_user_enter_valid_credentials() throws InterruptedException {
		objlogin = new Login(driver);
		
		String uname = "problem_user";
		String pwd = "secret_sauce";
		
		
	//	highlightElement(uname);
		objlogin.enterUsername(uname);
		Thread.sleep(1500);
		objlogin.enterPassword(pwd);
		Thread.sleep(1500);
		
	    
	}

	@And("click the login button")
	public void click_the_login_button() throws InterruptedException {
		objlogin.ClickLogin();
		Thread.sleep(1500);
	    
	}
	
	@Then("user Logout the page")
	public void user_logout_the_page() throws InterruptedException {

		ele = driver.findElement(By.xpath("//span[text()='Products']")); 
		   String msg = ele.getText();
		   System.out.println(msg);
		   Thread.sleep(1500);
		objlogin.menu(); 
		Thread.sleep(1500);
		objlogin.logout();
		Thread.sleep(1500);
		
		   
		   
		   
	
	}



}
