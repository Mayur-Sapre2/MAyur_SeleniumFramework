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
public class Motorcycle extends TestBase {

	@Test
	public void calculateInsurnace() throws Exception {
		System.out.println(driver.getTitle());
		vehicle_data.clickOnMotorCycleLink();
		vehicle_data.enterCylinderCapacity("33333");
		//verify error message
		String act_error=vehicle_data.getErrorMessageForCylinderCapacity();
		String exp_error="dummy";
		Assert.assertEquals(act_error, exp_error,"Error message ");
	}
	
}
