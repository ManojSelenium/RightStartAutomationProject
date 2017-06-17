package com.rightstart.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountProperty {

	
	By firstNameLocator=By.id("dwfrm_profile_customer_firstname");
	By lastNameLocator=By.id("dwfrm_profile_customer_lastname");
	By emailLocator=By.id("dwfrm_profile_customer_email");
	By confirmEmail=By.id("dwfrm_profile_customer_emailconfirm");
	By password=By.id("dwfrm_profile_login_password");
	By confirmpassword=By.id("dwfrm_profile_login_passwordconfirm");
	By submitButon=By.name("dwfrm_profile_confirm");
}
