/**
 * 
 */
package com.selenium.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.base.TestBase;

/**
 * @author gslab
 *
 */
public class ProductData extends TestBase {

	@FindBy(id="startdate")
	public WebElement txtbox_startdate;
	
	@FindBy(id="insurancesum")
	public WebElement insurancesum;
	
	@FindBy(id="damageinsurance")
	public WebElement damageinsurance;
	
	@FindBy(xpath="//*[@id='EuroProtection']/../..//label")
	public List<WebElement> chkbox_optional_product;
	
	@FindBy(id="nextselectpriceoption")
	public WebElement btn_next;
	
	public ProductData() {
		PageFactory.initElements(driver,this);
	}
	
	public void enterProductData() throws Exception {
		txtbox_startdate.sendKeys("11/11/2020");
		cm.selectDropdownOption(insurancesum, "3.000.000,00");
		cm.selectDropdownOption(damageinsurance, "No Coverage");
		cm.selectCheckBoxes(chkbox_optional_product, "Euro Protection");
	}
	
	public void clickOnNextButton() {
		btn_next.click();
	}
	
}
