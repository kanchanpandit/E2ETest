package Academy.E2ETest;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.LandingPage;

public class ValidateNavigations extends base{
	
	public WebDriver driver; 
	
	public static Logger log = LogManager.getLogger(base.class.getClass());
	
	@BeforeTest
	public void initilize() throws IOException {
	
		driver = initializerDriver(); 
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void basePageNavigation() 
	{
		
		LandingPage landpg = new LandingPage(driver); 
		Assert.assertTrue(landpg.getNavigation().isDisplayed());
		log.info("Driver is initialized");
		System.out.println("Test Completed");

	}	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
