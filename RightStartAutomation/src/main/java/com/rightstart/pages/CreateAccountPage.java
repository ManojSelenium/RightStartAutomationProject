package com.rightstart.pages;

import org.openqa.selenium.WebDriver;

import com.rightstart.dao.CreateUserBean;
import com.rightstart.objrepo.CreateAccountProperty;
import com.rightstart.utility.WebElements;

public class CreateAccountPage extends WebElements implements CreateAccountProperty{

	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	CreateUserBean createUserBean;

	/**
	 * This method is for entering firstname
	 * @param createUserBean
	 */
	public void enterFirstName(CreateUserBean createUserBean) {
		pause(6000);
		enterText(firstNameLocator, createUserBean.getFirstName());
	}
	/**
	 * This method is for entering lastname
	 * @param createUserBean
	 */
	public void enterLastName(CreateUserBean createUserBean) {
		enterText(lastNameLocator, createUserBean.getLastName());
	}
	/**
	 * This method is for entering email 
	 * @param createUserBean
	 */
	public void enterEmailName(CreateUserBean createUserBean) {
		enterText(emailLocator, createUserBean.getEmail());
	}
	public void enterconfirmEmailName(CreateUserBean createUserBean) {
		enterText(confirmEmail, createUserBean.getConfirmEmail());
	}
	public void enterPassword(CreateUserBean createUserBean) {
		enterText(password, createUserBean.getPassword());
	}
	
	public void enterConfirmPassword(CreateUserBean createUserBean) {
		enterText(confirmpassword, createUserBean.getConfirmpassword());
	}
	
	public void clickSubmitButton() {
		click(submitButon);
		pause(5000);
	}
	 
	public void createNewUser(CreateUserBean createUserBean) {
		
		enterFirstName(createUserBean);
		enterLastName(createUserBean);
		enterEmailName(createUserBean);
		enterconfirmEmailName(createUserBean);
		enterPassword(createUserBean);
		enterConfirmPassword(createUserBean);
		
	}	
}
