/**
 * 
 */
package com.selenium.insurancecalctest;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
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
		test.log(Status.PASS,"Cylinder Capacity is filled with data:33333");
		//verify error message
		String act_error=vehicle_data.getErrorMessageForCylinderCapacity();
		String exp_error="dummy";
		AssertJUnit.assertEquals(act_error, exp_error,"Error message ");
	}
	
	@Test
	public void verifyModelDropdownOptions() {
		vehicle_data.clickOnMotorCycleLink();
		List<String> actual_values=vehicle_data.getDropdownOPtions();
		test.log(Status.INFO,"Actual Dropdown Contents for model dropdown is:"+actual_values);
		List<String> expected_options=Arrays.asList("– please select –","Scooter","Three-Wheeler","Moped","Motorcycle");
		test.log(Status.INFO,"Expected Dropdown Contents for model dropdown is:"+expected_options);
		//expected value and compare
		Assert.assertEquals(actual_values, expected_options,"Error in dropdown options compare");
	}
}
