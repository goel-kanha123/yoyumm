package yorent.genericutills;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	
	public static  ExtentReports reporting() {
		
		
		String path = System.getProperty("user.dir") + "//reportings//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("web automation");
		reporter.config().setDocumentTitle("test result");
		
		ExtentReports report = new ExtentReports();

		 //report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester Name", "kanhaiya");

		return report;
	}
	
	

}
