package com.rightstart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.LoginPageProperty;
import com.rightstart.utility.WebElements;

public class LoginPage extends WebElements implements LoginPageProperty{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickGuestCheckout() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(guestCheckoutLocator);
	}
}
