package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.dao.EditUserBean;
import com.rightstart.objrepo.MyProfileProeprty;
import com.rightstart.utility.WebElements;

public class MyProfilePage extends WebElements implements MyProfileProeprty {

	WebDriver driver;
	
	EditUserBean edituserbean;
	public MyProfilePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	/**
	 * This method is for editing first name
	 * @param edituserbean
	 */
	public void enterFirstName(EditUserBean edituserbean) {
		enterText(firstName, edituserbean.getFirstName());
	}
	/**
	 * This method is for editing lastname
	 * @param edituserbean
	 */
	
	public void enterLastName(EditUserBean edituserbean) {
		enterText(lastName, edituserbean.getLastName());
	}
	public void enterEmail(EditUserBean edituserbean) {
		enterText(emailName, edituserbean.getEmail());
	}
	public void enterConfirmEmail(EditUserBean edituserbean) {
		enterText(confirmEmail, edituserbean.getConfirmEmail());
	}
	public void enterpassword(EditUserBean edituserbean) {
		enterText(password, edituserbean.getPassword());
	}
	public void enterConfrimPassword(EditUserBean edituserbean) {
		enterText(confimPassword, edituserbean.getConfirmpassword());
	}
	public void enterbabyName(EditUserBean edituserbean) {
		enterText(babysname, edituserbean.getBabysName());
	}
	public void clickSumBit() {
		click(sumbitButton);
	}
	
	public void editUser(EditUserBean edituserbean) {
		pause(5000);
		clearTextBoxValue(firstName);
		clearTextBoxValue(lastName);
		clearTextBoxValue(emailName);
		enterFirstName(edituserbean);
		enterLastName(edituserbean);
		enterEmail(edituserbean);
		enterConfirmEmail(edituserbean);
		enterpassword(edituserbean);
		enterConfrimPassword(edituserbean);
		enterbabyName(edituserbean);
	}
}
