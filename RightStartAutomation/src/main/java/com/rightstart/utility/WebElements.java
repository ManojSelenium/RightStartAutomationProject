package com.rightstart.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	
	WebDriver driver;
	
	public WebElements(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void enterText(By prop,String testData) {
		
		driver.findElement(prop).sendKeys(testData);
	}
	
	public void click(By prop) {
		System.out.println("WebElements Driver ::: "+driver);
		driver.findElement(prop).click();
	}
	
	public void selectValueFromDropDown(By prop,String option){
		new Select(driver.findElement(prop)).selectByVisibleText(option);
	}
	
	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}
	
	
	public String getAttribute(By prop,String key) {
		return driver.findElement(prop).getAttribute(key);
	}
	
	public void pause(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public void clearTextBoxValue(By prop) {
		driver.findElement(prop).clear();
	}
}
