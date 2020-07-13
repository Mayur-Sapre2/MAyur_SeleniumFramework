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

	public List<String> getDropdownOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> list_webelement_model=s.getOptions();
		List<String> list_string_models=new ArrayList<String>();
		
		for(WebElement ele:list_webelement_model) {
			list_string_models.add(ele.getText());
		}
		return list_string_models;
	}
}
