package yummnew.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yummnew.baseclass.base;

public class login extends base {

	public WebDriver driver;
	public String HomePage;

	public login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title = 'Login']")
	WebElement title;

	@FindBy(xpath = "//*[@id=\"body\"]/div/div/div[1]/div[1]/a[4]/span[2]")
	WebElement emailbutton;

	@FindBy(xpath = "//input[@name = 'username']")
	WebElement username;

	@FindBy(xpath = "//*[@id=\"frm_fat_id_frmLogin\"]/div[2]/div/div/div/div/input")
	WebElement password;

	@FindBy(xpath = "//input[@name = 'btn_submit']")
	WebElement submit;

	@FindBy(xpath = "//*[@id=\"header\"]/div/figure/a/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/nav[3]/ul/li[1]/a[1]")
	WebElement login;
	

	public String gettitle() {

		return driver.getTitle();
	}

	public boolean logo() {
		return logo.isDisplayed();
	}
	
	
	
	public void login(String un, String pass) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		login.click();
		emailbutton.click();
		//username.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		submit.click();
		}
		

	
	}


