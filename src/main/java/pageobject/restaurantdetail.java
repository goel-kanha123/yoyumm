package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class restaurantdetail {
	
	WebDriver driver;

	public  restaurantdetail(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "qty_480")
	WebElement Additem;
	
	@FindBy(xpath = "//input[@name = 'submit']")
	WebElement submititem;
	
	@FindBy(className = "btn--primary")
	WebElement addtocart;
	
	public void detail() {
		
		Additem.click();
		submititem.click();

		try {
			addtocart.click();
		} catch (StaleElementReferenceException E) {
			WebElement placeorder = driver.findElement(By.className("btn--primary"));
			placeorder.click();

		}
	}
	
}


