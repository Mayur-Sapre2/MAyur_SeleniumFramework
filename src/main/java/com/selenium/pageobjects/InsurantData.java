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
public class InsurantData extends TestBase{
	
	
	@FindBy(xpath="//*[@class='menu' ]//li//a[@name='Navigation Motorcycle']")
	public WebElement motorcycle_link;
	
	@FindBy(id="firstname")
	public WebElement txtbox_fname;
	
	@FindBy(id="lastname")
	public WebElement txtbox_lname;
	
	@FindBy(id="birthdate")
	public WebElement txtbox_dob;
	
	@FindBy(xpath="//*[@name='Gender']")
	public List<WebElement> chk_gender;
	
	@FindBy(id="streetaddress")
	public WebElement txtbox_streetaddress;
	
	@FindBy(xpath="//*[@id='country']//option")
	public List<WebElement> dd_countries;
	
	@FindBy(id="zipcode")
	public WebElement txtbox_zipcode;
	
	@FindBy(id="city")
	public WebElement txtbox_city;
	
	@FindBy(xpath="//*[@id='occupation']//option")
	public List<WebElement> dd_occupation;
	
	@FindBy(xpath="//*[@name='Hobbies']")
	public List<WebElement> chkbox_hobbies;
	
	@FindBy(id="website")
	public WebElement txtbox_website;
	
	@FindBy(className="ideal-file-filename")
	public WebElement txtbox_picture;
	
	@FindBy(id="nextenterproductdata")
	public WebElement btn_next;
	
	
	public InsurantData() {
		PageFactory.initElements(driver,this);
	}
	
}
