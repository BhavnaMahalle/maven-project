package mavendemoproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_LoginPage {
	WebDriver driver;
	  
	//1
	   @FindBy(id ="ap_email")
	   WebElement username;
	   
	   @FindBy(id ="continue")
	   WebElement continue_botton;
	  
	   @FindBy(id ="ap_password")
	   WebElement passward;
	   
	   @FindBy(id ="signInSubmit")
	   WebElement signin;
	   
	   //2
	   public void username_method() {
		   
		   username.sendKeys("7387035692");
	   }
	   
	   public void continue_button() {
		
		   continue_botton.click();
	   }
	   
	   public void passward_method() {
		   
		   passward.sendKeys("Test@12345");
	   }
	   public void signin_method() {
		   
		   signin.click();
	   }
	   
	   //3
	   public Amz_LoginPage( WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }
}


