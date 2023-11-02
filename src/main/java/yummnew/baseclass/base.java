package yummnew.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import yummnew.utill.testutill;

public class base {
	
	static public Properties prop;
	public WebDriver driver;
	String browser = "edge";
	
	public void getproperty() throws IOException {
		
//		FileInputStream fis = new FileInputStream(System.getProperty("C:\\Users\\HP\\Desktop\\yummnew\\src\\main\\java\\yummnew\\config\\config.properties"));
//		 prop = new Properties();
//		prop.load(fis);
		
	}
	
	
	public void initillize() {
		
	// browser = prop.getProperty("browsername");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(testutill.Implicit_Waits, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		driver.get("https://test.yoyumm.4livedemo.com/");
	//	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		
	}
   

}

  
