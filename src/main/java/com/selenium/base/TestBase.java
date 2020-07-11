/**
 * 
 */
package com.selenium.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.pageobjects.InsurantData;
import com.selenium.pageobjects.ProductData;
import com.selenium.pageobjects.VehicleData;
import com.selenium.reusablecomponent.PropertyOperations;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author gslab
 *
 */


public class TestBase extends ObjectRepo {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception {
		launchBrowser();
		insurant_page=new InsurantData();
		product_data=new ProductData();
		vehicle_data=new VehicleData();
	}

	public static void launchBrowser() throws Exception {
		
		String browser=PropertyOperations.getProperty("browser");
		String url=PropertyOperations.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
