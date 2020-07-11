/**
 * 
 */
package com.selenium.reusablecomponent;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.selenium.base.ObjectRepo;

/**
 * @author gslab
 *
 */
public class Listener extends ObjectRepo implements ITestListener{

	public void onTestStart(ITestResult result) {
		//before each testcase
		test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		//setup report method call
		extent=EventSetup.setupExtentReport();
	}

	public void onFinish(ITestContext context) {
		//close extent
		extent.flush();
		
	}

}
