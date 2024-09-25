package mavendemoproject.MavenProject;

import java.time.Duration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestCase3_IncorrectPassword extends Amz_LaunchQuit{

	
	@Test
	public void login()
	 {
		 AssertJUnit.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		 Amz_HomePage homepage = new Amz_HomePage (driver);
		 homepage.hoverover(driver);
		 homepage.signin_click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 Amz_LoginPage login = new Amz_LoginPage(driver);
		 login.username_method();
		 login.continue_button();
		 login.passward_method();
		 login.signin_method();
		
		
		
	}
}
