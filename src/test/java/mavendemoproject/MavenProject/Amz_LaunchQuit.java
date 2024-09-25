package mavendemoproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Amz_LaunchQuit {
	
	ChromeDriver driver;        
	@BeforeMethod
	
	public void launch_browser() throws InterruptedException 
	{
		    driver = new ChromeDriver ();
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		 
	}
	
	@AfterMethod 
	public void quit() throws InterruptedException 
	{
		
//		Thread.sleep(3000);
//		driver.quit();
		
	}
	
}

//	WebDriver driver;
//	@BeforeMethod
//	@Parameters("browser")
//	
//	public void parallel_testing(String nameofbrowser) {
//		
//		if(nameofbrowser.equalsIgnoreCase("chrome"))        
//		{
//			driver= new ChromeDriver();	
//		}
//		
//		if(nameofbrowser.equalsIgnoreCase("firefox")) 
//		{
//			driver= new FirefoxDriver();	
//		}
//		
//		driver.get("https://www.amazon.in/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}	
//	
//	@AfterMethod 
//	public void quit() throws InterruptedException 
//	{
//		
//		Thread.sleep(5000);
//		driver.quit();
//		
//	}	
	

