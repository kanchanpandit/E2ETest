package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver ; 

	By email = By.xpath("//*[@id='user_email']"); 
	By password = By.xpath("//*[@id='user_password']"); 
	By logIn = By.xpath("//*[@value='Log In']") ; 
	By forgotpassword = By.cssSelector("[href*='password/new']"); 
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver ;
	}

	public WebElement getEmail() 
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword() 
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin() 
	{
		return driver.findElement(logIn);
	}
	
	public ForgotPassword forgotPassword() 
	{
		 driver.findElement(forgotpassword).click();
		 return new ForgotPassword (driver); 
		 
	}

}

