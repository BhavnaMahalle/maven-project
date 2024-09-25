package mavendemoproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Amz_RegistrationPage {
//1
	
	WebDriver driver;
	
	@FindBy(name = "customerName")
	WebElement name;
	
//	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
//	WebElement mobilearea_code;
	
	@FindBy(id = "ap_phone_number")
	WebElement mobile_number ;
	
	@FindBy(id = "ap_password")
	WebElement pass ;
	
	@FindBy(id = "continue")
	WebElement check_number ;
	
	//2
	
	public void customer_name () 
	{
		name.sendKeys("Amy");
		//name.sendKeys("Amy"+ Math.random());	
	}
	
//	public void mobile_code() 
//	{
//	Select s1 = new Select(mobilearea_code)	;
//	s1.selectByVisibleText("IN +91");
//	}
	
	public void phone_number() 
	{
		mobile_number.sendKeys("9887035692");	
			
	}
	
	public void password() 
	{
		pass.sendKeys("amy@123");
		
	}
	
	public void varify_number() 
	{
		
		check_number.click();
	}
	
	 public Amz_RegistrationPage ( WebDriver driver) 
	   { 
		   PageFactory.initElements(driver, this);
	   }
}

//public static void main(String[] args) {
//String randomString = UUID.randomUUID().toString();
//String name = randomString.substring(0, 10);
//System.out.println("name: "+name);
//
//}
