package mavendemoproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_HomePage {
	WebDriver driver;
	   
	  
	   @FindBy(id ="nav-link-accountList")
	   WebElement accountsandlist;
	   
	   @FindBy(linkText ="Start here.")
	   WebElement new_customer;
	   
	   @FindBy(xpath ="//span[.='Sign in']")
	   WebElement signin_botton;
	  
	   
	   public void hoverover( WebDriver driver) {
		   Actions a1 = new Actions(driver);
		   a1.moveToElement(accountsandlist).perform();;	   
	   }
	   
	   public void new_registration() {
		   
		   new_customer .click(); 
	   }
	   
	   public void signin_click() {
		   
		   signin_botton.click(); 
	   }
	    
	   public Amz_HomePage ( WebDriver driver) 
	   {
		   
		   PageFactory.initElements(driver, this);
	   }
		
}
