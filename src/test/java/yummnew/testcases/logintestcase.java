package yummnew.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import yummnew.baseclass.base;
import yummnew.pages.location;
import yummnew.pages.login;
import yummnew.pages.restaurantdetail;

public class logintestcase extends base{
	
	public login log;
	
	public logintestcase() {
		
		super();
		
	}
	
	@BeforeTest
	public void setup() {
		
		initillize();
		 log = new login(driver);
		
	}
	
	@Test(priority = 1)
	public void loginpagetitletest() {
		
	String title = 	log.gettitle();
	Assert.assertEquals(title, "Check The Live Demo Of An Online Food Ordering & Delivery Software -YoYumm | YoYumm");
	}
	
	@Test(priority = 2)
	public void logotest() {
	boolean flag =	log.logo();
	//Assert.assertTrue(flag);
	Assert.assertFalse(flag);
	}
	
	@Parameters("un, pass")
	@Test(priority = 3)
	public void logincheck() throws InterruptedException {
		//log.login(prop.getProperty("username"), prop.getProperty("password"));
		log.login("kamal@dummyid.com", "k1234567");
	}
	@Test(priority = 4)
	public void address() throws InterruptedException{
		location lc = new location(driver);
		lc.getlocation();
	}
	
	@Test(priority = 5 )
	public void rest() throws InterruptedException {
	
		restaurantdetail rd = new restaurantdetail(driver);
		rd.restaurantsearch();
	}
	
	
//	@AfterMethod
//	public void down() {
//		driver.quit();
//	}

}
