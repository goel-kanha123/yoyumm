package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import yorent.genericutills.ExtentReport;

public class launchwebsite  {
	
	WebDriver driver;
	
	public launchwebsite(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(linkText = "Login")
     WebElement login;
     
     @FindBy(partialLinkText = "Email")
	WebElement loginwithemail;
     
     @FindBy(xpath = "//input[@placeholder = 'Email Address']") 
     WebElement loginemailaddress;
     
     @FindBy(name="password")
     WebElement loginpassword;
     
     @FindBy(xpath = "//input[@name = 'btn_submit']")
     WebElement loginbutton;
     
     public void sendlogindata(String email, String password) {
    	 loginemailaddress.sendKeys(email);
    	 loginpassword.sendKeys(password);
    	 loginbutton.click();
    	 
     }
	@Test
	public void launch() {
		
		
		driver.get("https://test.yoyumm.4livedemo.com/");
		login.click();
		loginwithemail.click();
	}
	
}
