package com.rightstart.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rightstart.dao.BeanFactory;
import com.rightstart.dao.CreateUserBean;
import com.rightstart.dao.EditUserBean;
import com.rightstart.pages.CreateAccountPage;
import com.rightstart.pages.DashBaordPage;
import com.rightstart.pages.LandingPage;
import com.rightstart.pages.MyProfilePage;
import com.rightstart.utility.TestBase;

public class EditAccountTest extends TestBase{
	
	LandingPage landingPageObj;
	CreateAccountPage createaccountPage;
	CreateUserBean createUserBean;
	DashBaordPage baordPage;
	BeanFactory beanFactory;
	MyProfilePage myprofilePage;
	EditUserBean edituserbean;
	String browser="chrome";
	
	@BeforeMethod
	public void setUp() {
		driver=launchBrowser(browser);
		enterURL(automationURL);
		landingPageObj=new LandingPage(driver);
		createaccountPage=new CreateAccountPage(driver);
		baordPage=new DashBaordPage(driver);
		myprofilePage=new MyProfilePage(driver);
		createUserBean=new CreateUserBean();
		beanFactory=new BeanFactory();
		beanFactory.createUser(createUserBean);
		edituserbean=new  EditUserBean();			
		beanFactory.editUser(edituserbean);;
	}
	
	
	/**
	 * This test case is for updating created user details
	 */
	@Test(description="Edit Accout Details")
	public void AT_Verify_EditAccounttestCase() {
		landingPageObj.closeWelcomePopup();
		landingPageObj.clickregisterButton();
		createaccountPage.createNewUser(createUserBean);
		createaccountPage.clickSubmitButton(); 
		baordPage.clickMyProfile();
		myprofilePage.editUser(edituserbean);
		myprofilePage.clickSumBit();
		
	}
}
