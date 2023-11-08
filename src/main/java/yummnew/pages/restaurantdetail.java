package yummnew.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class restaurantdetail {
	
	WebDriver driver;
	
	public restaurantdetail(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "search_auto_complete" )
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"autoCompleteContainer\"]/div[2]/div[2]/a/span[2]/div/div[2]/div[1]")
	WebElement suggesstion;
	

	
	public void restaurantsearch() throws InterruptedException {				
		
		Thread.sleep(2000);
		search.click();
		search.sendKeys("vimal");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
		suggesstion.click();
		
	}
	
}
