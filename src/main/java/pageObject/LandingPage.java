package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver ; 

	By signIn = By.xpath("//a[contains(@href, 'sign_in')]"); 
	By title = By.cssSelector(".text-center>h2"); 
	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a"); 
			
			
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver ;
	}

	public LoginPage getLogin() 
	{
		 driver.findElement(signIn).click();
		 LoginPage lognpg = new LoginPage(driver);
		 return lognpg; 
	}
	
	public WebElement getTitle() 
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigation() 
	{
		return driver.findElement(NavBar);
	}
	
	

}
