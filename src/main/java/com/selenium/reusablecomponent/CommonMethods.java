/**
 * 
 */
package com.selenium.reusablecomponent;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author gslab
 *
 */
public class CommonMethods {
	
	public void selectDropdownOption(WebElement element,String value) throws Exception {
		Select s=new Select(element);
		try {
		s.selectByVisibleText(value);
		}catch(Exception e) {
			throw new Exception("Value is not present in dropdown for webelement: "+element + "Value to be selected is: "+value);
		}
	}

	public List<String> getDropdownOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> list_webelement_model=s.getOptions();
		List<String> list_string_models=new ArrayList<String>();
		
		for(WebElement ele:list_webelement_model) {
			list_string_models.add(ele.getText());
		}
		return list_string_models;
	}
	
	public void selectRadioButton(List<WebElement> element,String value) {
		for(WebElement ele:element) {
			if(ele.getText().equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
		}
	}
	
	public void selectCheckBoxes(List<WebElement> element,String values) {
		String[] checks=values.split(",");
		for(String str:checks) {
			for(WebElement ele:element) {
				if(ele.getText().equalsIgnoreCase(str)) {
					ele.click();
					break;
				}
			}
		}
	}
	
}
