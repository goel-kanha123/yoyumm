package pageobject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yorent.genericutills.location;

public class restaurantlisting extends location {
	
WebDriver driver;
	
	public  restaurantlisting(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(className = "search-icon")
	WebElement searchicon;
	
	@FindBy(id = "search_auto_complete")
	WebElement searchvalue;
	
	@FindBy(id = "ajax_city")
	WebElement locationdata1;
	
	@FindBy(xpath = "//*[@id=\"listing\"]/div/div/div/div[1]/div/a/img")
	WebElement restaurantclick;
	
	
	//function for fetching location automatically.
	public void searchdata(String data) throws InterruptedException {
		
		location fetch = new location(driver);
		fetch.getlocation();
		Thread.sleep(2000);
		searchicon.click();
		searchvalue.sendKeys(data);
		searchvalue.sendKeys(Keys.ENTER);
		restaurantclick.click();
		
	}
	
	//function for fetching location manually.

//	public void searchdata(String locationdata, String data) throws InterruptedException {
//		
//		location fetch = new location(driver);
//		fetch.getlocationmanually();
//		locationdata1.sendKeys(locationdata);
//		Thread.sleep(2000);
//		locationdata1.sendKeys(Keys.ARROW_DOWN);
//		locationdata1.sendKeys(Keys.ENTER);
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		Thread.sleep(1000);
//        searchicon.click();
//		searchvalue.sendKeys(data);
//		Thread.sleep(1000);
//		searchvalue.sendKeys(Keys.ENTER);
//		restaurantclick.click();
//		
//	}						
}
