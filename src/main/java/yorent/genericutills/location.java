package yorent.genericutills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class location {

WebDriver driver;
	
	public location(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/span/span")
	WebElement locationtext;
	
	@FindBy(className = "near-by")
	WebElement locateme;
	
	@FindBy(id = "ajax_city")
	WebElement locationtextfield;
	
	public  void getlocation() throws InterruptedException {
		
		Thread.sleep(2000);
		locationtext.click();
		locateme.click();
		
	}
	
	public void getlocationmanually() throws InterruptedException {
		Thread.sleep(2000);
		locationtext.click();
		locationtextfield.click();
		locationtextfield.clear();
		locationtextfield.click();

	}
}
