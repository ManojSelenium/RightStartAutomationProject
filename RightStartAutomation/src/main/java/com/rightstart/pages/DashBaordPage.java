package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.DashBoardProperty;
import com.rightstart.utility.WebElements;

public class DashBaordPage extends WebElements implements DashBoardProperty{

	WebDriver driver;

	public DashBaordPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public String verifyCreateUserSuccessMessage() {
		pause(4000);
		return getText(myAccountProperty);
	}


	public void clickMyProfile() {
		pause(5000);
		click(myProfile);
	}
}
