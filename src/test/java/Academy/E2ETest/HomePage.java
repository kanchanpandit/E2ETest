package Academy.E2ETest;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class HomePage extends base{
	
	public WebDriver driver; 
	
	public static Logger log = LogManager.getLogger(base.class.getClass());
	
	@BeforeTest
	public void initilize() throws IOException {
	
		driver = initializerDriver(); 				
	}
		
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username , String Password, String text ) throws IOException 
	{
		driver.get(prop.getProperty("url"));
		LandingPage landpg = new LandingPage(driver); 
		LoginPage lognpg=  landpg.getLogin(); 

		 
		 lognpg.getEmail().sendKeys(Username);
		 lognpg.getPassword().sendKeys(Password); 
		 log.info(text);
		 lognpg.getLogin().click();
		 ForgotPassword fp = lognpg.forgotPassword(); 
		 fp.getEmail().sendKeys("dfakdkfjd");
		 fp.SendMeInstruction().click();
		 

	}
		
	  @DataProvider   
	  public Object[][] getData() { 
		  //Rows stands for how man  different data types test should run 
		  //columns stand for how many values per  each test
	  
	  Object[][] data = new Object[2][3] ;
	  
	  //0th row
	  
	  data[0][0] = "nonrestricteduser1@gmail.com"; 
	  data[0][1] = "Hellow123" ;
	  data[0][2] = "restricteduser1@gmail.com" ;
	  
	  // 1st row
	  
	  data[1][0] = "nonrestrictedusr2@gmail.com"; 
	  data[1][1] = "Hello123" ;
	  data[1][2] = "restricteduser2@gmail.com" ;
	  
	  return data; 
	  }
	  	  
	  @AfterTest
		public void teardown() {
			driver.close();
		}

}
	


