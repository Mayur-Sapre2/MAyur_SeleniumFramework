/**
 * 
 */
package com.selenium.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.selenium.pageobjects.InsurantData;
import com.selenium.pageobjects.ProductData;
import com.selenium.pageobjects.VehicleData;

/**
 * @author gslab
 *
 */
public class ObjectRepo {

	public static InsurantData insurant_page;
	public static ProductData product_data;
	public static VehicleData vehicle_data;
	public static ExtentReports extent;
	public static ExtentTest test;
}
