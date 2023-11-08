package yorent.genericutills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import pageobject.landingpage;
import pageobject.launchwebsite;

public class baseclass {

	public WebDriver driver;
	//public launchwebsite launchwebsite;


	
	public WebDriver browserfile() throws IOException {

//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\main\\java\\yorent\\genericutills\\globaldata.properties");
//		prop.load(fis);
//
//		String BrowserName = prop.getProperty("Browser");
//		
		String BrowserName = "chrome";
		
		if (BrowserName.equalsIgnoreCase("chrome"))

		{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (BrowserName.equalsIgnoreCase("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else if (BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;

	}
	
	//base class for taking screenshot
	public String getscreenshot(String testCaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
            File  savescreenshot = ts.getScreenshotAs(OutputType.FILE);
            File DestFile=new File(System.getProperty("user.dir") + "//reportings//" + testCaseName + ".png");
            FileUtils.copyFile(savescreenshot, DestFile);
			return System.getProperty("user.dir") + "//reportings//" + testCaseName + ".png";
	
	}
	          
	
	
	@BeforeMethod
	public launchwebsite launchwebsite1() throws IOException {	
		 driver = browserfile();
		launchwebsite lw = new pageobject.launchwebsite(driver);
		lw.launch();
//		launchwebsite.launch();
		return lw;
			
	}

}


