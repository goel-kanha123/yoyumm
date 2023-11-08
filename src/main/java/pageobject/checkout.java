package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
	
	WebDriver driver;

	public  checkout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"review-hide\"]/div[1]/div[2]/div[2]/label/span/input")
	WebElement pickup;
	
	@FindBy(xpath = "//*[@id=\"pickup-timing\"]/div[1]/div/label/input")
	WebElement instant;
	
	@FindBy(xpath = "//*[@id=\"payment-option\"]/div[3]/label/span/input")
	WebElement cod;
	
	@FindBy(className = "paynow")
	WebElement placebutton;

	public void submitorder() {
		pickup.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		instant.click();
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,800)");
		cod.click();
		placebutton.click();
	}
}
