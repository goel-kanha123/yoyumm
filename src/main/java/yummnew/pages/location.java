package yummnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class location{

	WebDriver driver;

	public location(WebDriver driver) {
		
		this.driver =  driver;
    	PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[1]/div[3]/a/span[2]")
	WebElement dropdown;
	
	@FindBy(className = "locate_me_button")
	WebElement locateme;
	
	public void getlocation() throws InterruptedException  {
		
		Thread.sleep(2000);
		dropdown.click();
		 locateme.click();
		
		
	}
	
	
	
	

}

