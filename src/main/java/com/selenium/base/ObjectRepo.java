/**
 * 
 */
package com.selenium.base;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.selenium.pageobjects.InsurantData;
import com.selenium.pageobjects.ProductData;
import com.selenium.pageobjects.VehicleData;
import com.selenium.reusablecomponent.CommonMethods;

/**
 * @author gslab
 *
 */
public class ObjectRepo {
	
	public static WebDriver driver;
	public static InsurantData insurant_page;
	public static ProductData product_data;
	public static VehicleData vehicle_data;
	public static ExtentReports extent;
	public static ExtentTest test;
	public CommonMethods cm=new CommonMethods();
}
