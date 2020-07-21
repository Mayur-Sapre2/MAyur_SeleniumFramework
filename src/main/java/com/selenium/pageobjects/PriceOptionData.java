/**
 * 
 */
package com.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.base.TestBase;

/**
 * @author gslab
 *
 */
public class PriceOptionData extends TestBase {
	
	@FindBy(id="nextsendquote")
	public WebElement btn_next;
	
	public PriceOptionData() {
		PageFactory.initElements(driver,this);
	}
	
	//to get price for plan
	public String getPriceFOrSelectedOption(String plan) {
		String data_xpath="//table[@id='priceTable']//tr[1]/td[@data-label='"+plan+"']";
		return driver.findElement(By.xpath(data_xpath)).getText();
		
	}
	
	public void selectPriceOption(String plan) {
		String data_xpath="//input[@name='Select Option' and @value='"+plan+"']/parent::label";
		driver.findElement(By.xpath(data_xpath)).click();		
	}
	
	
}
