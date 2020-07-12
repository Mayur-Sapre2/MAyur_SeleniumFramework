/**
 * 
 */
package com.selenium.reusablecomponent;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
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
		test.log(Status.PASS,"Test Case:"+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Test Case:"+result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy HH-mm-ss");
		Date date=new Date();
		String act_date=format.format(date);
		String screenshot_path=System.getProperty("user.dir")+"/Reports/Screenshots/Execution_Report_"+act_date+".jpeg";
		File dest=new File(screenshot_path);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(screenshot_path,"Test case failure screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
