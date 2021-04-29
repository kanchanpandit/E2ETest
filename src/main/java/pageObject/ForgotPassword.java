package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	public WebDriver driver ; 

	By forgotemail = By.xpath("//input[@id='user_email']"); 
	By SendMeInstruction = By.xpath("//*[@type='submit']"); 
	

	public ForgotPassword(WebDriver driver) {
		this.driver = driver ; 
	}
	
	public WebElement getEmail() 
	{
	return driver.findElement(forgotemail);
	}
	
	
	public WebElement SendMeInstruction()
	{
	return driver.findElement(SendMeInstruction);
	}

}
