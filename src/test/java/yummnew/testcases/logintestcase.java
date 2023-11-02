package yummnew.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import yummnew.baseclass.base;
import yummnew.pages.login;

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
	Assert.assertTrue(flag);
	}
	
	@Parameters("un, pass")
	@Test(priority = 3)
	public void logincheck() throws InterruptedException {
		//log.login(prop.getProperty("username"), prop.getProperty("password"));
		log.login("kamal@dummyid.com", "k1234567");
	}
	
	
//	@AfterMethod
//	public void down() {
//		driver.quit();
//	}

}
