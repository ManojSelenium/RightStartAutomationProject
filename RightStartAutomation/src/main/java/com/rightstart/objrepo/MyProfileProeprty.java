package com.rightstart.objrepo;

import org.openqa.selenium.By;

public interface MyProfileProeprty {

	
	By firstName=By.id("dwfrm_profile_customer_firstname");
	By lastName=By.id("dwfrm_profile_customer_lastname");
	By emailName=By.id("dwfrm_profile_customer_email");
	By confirmEmail=By.id("dwfrm_profile_customer_emailconfirm");
	By password=By.id("dwfrm_profile_login_password");
	By confimPassword=By.id("dwfrm_profile_login_passwordconfirm");
	
	By babysname=By.id("childname0");
	By sumbitButton=By.name("dwfrm_profile_confirm");
			
}
