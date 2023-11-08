package yorent.genericutills;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners extends baseclass implements ITestListener {
	
	ExtentReports	extent = ExtentReport.reporting();
 ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		
   test = extent.createTest(result.getMethod().getMethodName());
    
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
          test.log(Status.PASS, "testcase pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		 String filepath = null ;

      try {
		 filepath =  getscreenshot(result.getMethod().getMethodName(), driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}
		 
	@Override
	public void onTestSkipped(ITestResult result) {

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
