package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Courses {

	
	public WebDriver driver ; 

	By Coursetext = By.xpath("//span[contains(text(), 'An Academy to ')]"); 
			
			
	public Courses(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver ;
	}

	
	public WebElement getCourseText()
	{
		return driver.findElement(Coursetext);
	}
}
