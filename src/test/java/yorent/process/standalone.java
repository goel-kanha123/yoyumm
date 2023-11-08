package yorent.process;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.checkout;
import pageobject.launchwebsite;
import pageobject.restaurantdetail;
import pageobject.restaurantlisting;
import yorent.genericutills.baseclass;

public class standalone extends baseclass {

@Test
 public void functional() throws IOException, InterruptedException{
	 
	 baseclass bc = new baseclass();
	 bc.launchwebsite1();
	 
	 launchwebsite lwstandalone = new launchwebsite(driver);
	 lwstandalone.sendlogindata("kl@dummyid.com", "k1234567");
	 
	 restaurantlisting rl = new restaurantlisting(driver);
	 rl.searchdata("vimal");
	 
	 restaurantdetail rd = new restaurantdetail(driver);
	 rd.detail();
	 
	 checkout co = new checkout(driver);
	 co.submitorder();
	 
 }
	
}
