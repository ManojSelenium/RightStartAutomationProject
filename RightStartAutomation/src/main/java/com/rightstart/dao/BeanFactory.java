package com.rightstart.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {

	public void createUser(CreateUserBean createuserbean) {	
		createuserbean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		createuserbean.setLastName(RandomStringUtils.randomAlphabetic(5));
		String email=RandomStringUtils.randomAlphabetic(5)+"@mailinator.com";
		String password="password@123";
		createuserbean.setEmail(email);
		createuserbean.setConfirmEmail(email);
		createuserbean.setPassword(password);
		createuserbean.setConfirmpassword(password);
		
	}
	
	
	public void editUser(EditUserBean edituserbean) {
		
		String email=RandomStringUtils.randomAlphabetic(5)+"@mailinator.com";
		String password="password@1234";
		
		edituserbean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		edituserbean.setLastName(RandomStringUtils.randomAlphabetic(5));
		edituserbean.setEmail(email);
		edituserbean.setConfirmEmail(email);
		
		edituserbean.setPassword(password);
		edituserbean.setConfirmpassword(password);
		
		edituserbean.setBabysName(RandomStringUtils.randomAlphabetic(5));
		
	}
}
