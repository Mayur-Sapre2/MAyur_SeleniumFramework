/**
 * 
 */
package com.selenium.insurancecalctest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.base.TestBase;

/**
 * @author gslab
 *
 */
public class EndToEnd extends TestBase{

	@Test
	public void insuranceCalculate() throws Exception {
		vehicle_data.clickOnMotorCycleLink();
		vehicle_data.enterVehicleData();
		vehicle_data.clickOnNextButton();
		insurant_page.enterInsurantData();
		insurant_page.clickOnNextButton();
		product_data.enterProductData();
		product_data.clickOnNextButton();
		
		String expectedSilverPlanPrice="234.00";
		String actual=priceoption_data.getPriceFOrSelectedOption("Silver");
		Assert.assertEquals(actual, expectedSilverPlanPrice);
		
		priceoption_data.selectPriceOption("Silver");
		
		
	}
	
}
