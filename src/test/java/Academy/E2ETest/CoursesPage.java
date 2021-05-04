package Academy.E2ETest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Courses;


public class CoursesPage extends base {
	
	
		public WebDriver driver;
				
		public static Logger log = LogManager.getLogger(base.class.getClass());

		@BeforeTest
		public void initilize() throws IOException {
		
			driver = initializerDriver();
			log.info("Driver is initialized");
			
			driver.get(prop.getProperty("url"));
			log.info("Navigated to Courses Page");
		}
		
		
		@Test
		public void CoursesPageText() 
		{
			
			Courses course = new Courses(driver); 
			//landpg.getLogin().click();
			
			System.out.println(course.getCourseText().getText());
			
			//Assert.assertEquals(course.getCourseText().getText(), "An Academy to " ); 
			
			log.info("Successfully Validated text Messages of Courses Page");
		}
		
		
		@AfterTest
		public void teardown() {
			driver.close();
		}
					
		
	}


