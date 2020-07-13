/**
 * 
 */
package com.selenium.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selenium.base.TestBase;

/**
 * @author gslab
 *
 */
public class VehicleData extends TestBase{
	
	@FindBy(xpath="//*[@class='menu' ]//li//a[@name='Navigation Motorcycle']")
	public WebElement motorcycle_link;

	@FindBy(xpath="//*[@name='Make']//option")
	public List<WebElement> dd_make;
	
	@FindBy(id="model")
	public WebElement model;
	
	@FindBy(xpath="//*[@name='Model']//option")
	public WebElement dd_model;
	
	@FindBy(id="engineperformance")
	public WebElement txtbox_engine_perf;
	
	@FindBy(id="cylindercapacity")
	public WebElement txtbox_cylinder_capacity;
	
	@FindBy(xpath="//*[@id='cylindercapacity']//following-sibling::span")
	public WebElement error_cylinder_capacity;
	
	@FindBy(xpath="//*[text()='Date of Manufacture']//following-sibling::input")
	public WebElement txtbox_date_of_man;
	
	@FindBy(xpath="//*[@id='fuel']//option")
	public WebElement dd_fuel_type;
	
	@FindBy(xpath="//*[@id='numberofseats']//option")
	public WebElement dd_number_seats;
	
	@FindBy(id="listprice")
	public WebElement txtbox_listprice;
	
	@FindBy(id="licenseplatenumber")
	public WebElement txtbox_licenseplatenumber;
	
	@FindBy(id="annualmileage")
	public WebElement txtbox_annualmileage;
	
	@FindBy(id="nextenterinsurantdata")
	public WebElement btn_next;
	
	public VehicleData() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMotorCycleLink() {
		motorcycle_link.click();
	}
	
	public void enterCylinderCapacity(String cylindercapacity) {
		txtbox_cylinder_capacity.sendKeys(cylindercapacity);
	}
	
	public String getErrorMessageForCylinderCapacity() {
		return error_cylinder_capacity.getText();
	}
	
	public List<String> getDropdownOPtions() {
		return cm.getDropdownOptions(model);
	}
}
