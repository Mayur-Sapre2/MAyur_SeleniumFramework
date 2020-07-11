/**
 * 
 */
package com.selenium.reusablecomponent;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.selenium.base.ObjectRepo;

/**
 * @author gslab
 *
 */
public class EventSetup extends ObjectRepo{
	
	/*
	 * 1) Setup report-before exec. begin 
	 * 2) Create Test-before each test 
	 * 3) attach
	 * screenshot for fail 
	 * 4) close
	 */

	public static ExtentReports setupExtentReport() {
		
		SimpleDateFormat format=new SimpleDateFormat("dd-mmy-yyyy HH-mm-ss");
		Date date=new Date();
		String act_date=format.format(date);
		String report_path=System.getProperty("usr.dir")+"/target/Execution_Report_"+act_date+".html";
		
		ExtentSparkReporter report=new ExtentSparkReporter("location of file");
		extent=new ExtentReports();
		extent.attachReporter(report);
		
		report.config().setDocumentTitle("Title");
		report.config().setTheme(Theme.DARK);
		report.config().setReportName("ReportName");
		
		return extent;
	}
}
