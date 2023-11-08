package yummnew.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	
	WebDriver driver;
	
	public addtocart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath = "//*[@id=\"MENU-255\"]/div/div[1]/div[2]/a")
	WebElement additem ;

	
	public void item() {
		js.sc
	}
}
