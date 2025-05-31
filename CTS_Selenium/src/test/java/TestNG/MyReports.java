package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

//Listeners are used in customized reports

public class MyReports implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		Reporter.log("on test start"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		Reporter.log("on test sucess"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		Reporter.log("on test failure"+result.getName());
		System.out.println("Take screenshot");
	}

}
