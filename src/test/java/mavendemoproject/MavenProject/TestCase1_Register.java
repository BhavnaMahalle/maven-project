package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;



public class TestCase1_Register extends Amz_LaunchQuit {

	@Test
	public void Registration() 
	{
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.hoverover(driver);
		homepage.new_registration();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Amz_RegistrationPage register = new Amz_RegistrationPage(driver);
		register.customer_name();
		//register.mobile_code();
		register.phone_number();
		register.password();
		//register.varify_number();
		
		
	}
}
