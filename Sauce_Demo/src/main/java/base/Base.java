package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.JavascriptExecutor;

public class Base {
	
	public WebDriver  driver;
	
	public  WebDriver openUrl() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.get("https://www.saucedemo.com/");
		
		return driver;
		
	}
	
	public void highlightElement(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	

}
