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


public class ValidateTitle extends base {
	
	public WebDriver driver; 
	
public static Logger log = LogManager.getLogger(base.class.getClass());

	@BeforeTest
	public void initilize() throws IOException {
	
		driver = initializerDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
	}
	
	
	@Test
	public void validateAppTitle() 
	{
		
		LandingPage landpg = new LandingPage(driver); 
		//landpg.getLogin().click();
		
		Assert.assertEquals(landpg.getTitle().getText(), "FEATURED COURSES123");
		log.info("Successfully Validated text Message");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}