package com.rightstart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.LandinPageProperty;
import com.rightstart.utility.WebElements;

public class LandingPage extends WebElements implements LandinPageProperty{

	WebDriver driver;
	
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	/**
	 * This method is for closing welcome popup
	 */
	public void closeWelcomePopup() {
		
		System.out.println("Landing Page Driver "+driver);
		click(welcomepopuplocator);
	}
	
	/**
	 * This method will click register button
	 */
	public void clickregisterButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		pause(2000);
		click(registerlocator);
	}
	
}
