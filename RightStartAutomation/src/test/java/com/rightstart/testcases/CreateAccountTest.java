package com.rightstart.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.emitter.Emitable;

import com.rightstart.dao.BeanFactory;
import com.rightstart.dao.CreateUserBean;
import com.rightstart.pages.CreateAccountPage;
import com.rightstart.pages.DashBaordPage;
import com.rightstart.pages.LandingPage;
import com.rightstart.pages.LoginPage;
import com.rightstart.utility.TestBase;

public class CreateAccountTest extends TestBase{
	LandingPage landingPageObj;
	CreateAccountPage createaccountPageObj;
	DashBaordPage dashBaordPageObj;
	String Browser="chrome";
	CreateUserBean createuserbean;
	BeanFactory beanfactory;
	@BeforeMethod
	public void setUp() {
		//Launch the browser
		driver=launchBrowser(Browser);
		//Enter URL
		enterURL(automationURL);
		landingPageObj=new LandingPage(driver);
		createaccountPageObj=new CreateAccountPage(driver);
		dashBaordPageObj=new DashBaordPage(driver);  
		beanfactory=new BeanFactory();
		createuserbean=new CreateUserBean();
		beanfactory.createUser(createuserbean);
	}


	/**
	 * This test case is for creating account in rightstart application
	 *  
	 */
	@Test(description="Create Account Test Case")
	public void AT_Verify_CreateAccountTestCase() {

		landingPageObj.closeWelcomePopup();
		landingPageObj.clickregisterButton();
		createaccountPageObj.createNewUser(createuserbean);
		createaccountPageObj.clickSubmitButton();
		Assert.assertTrue(dashBaordPageObj.verifyCreateUserSuccessMessage().contains("my account"));
		Assert.assertEquals(dashBaordPageObj.verifyCreateUserSuccessMessage(),"my account");

	}
}
