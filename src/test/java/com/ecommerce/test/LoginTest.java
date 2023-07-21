package com.ecommerce.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ecommerce.util.BaseTest;


public class LoginTest extends BaseTest {

	@Test (priority = 1, groups = "Functional")
	public void doLogin() {
		homePageCommerce.goToLogin();
		loginPageCommerce.signIn();		
		assertEquals(loginPageCommerce.verifyLogout(),"Log out");
		System.out.println(loginPageCommerce.verifyLogout());
	} 

	@Test (priority = 2)
	public void doLoginFail() {
		homePageCommerce.goToLogin();
		loginPageCommerce.LoginInvalidUser();
		assertEquals(loginPageCommerce.verifyLogoutLogin(), "No customer account found ");
	}
	
	@Test (priority = 3)
	public void doLoginFailPassword() {
		homePageCommerce.goToLogin();
		loginPageCommerce.LoginInvalidPassword();
		assertEquals(loginPageCommerce.verifyLogoutLogin(), "The credentials provided are incorrect");

	}
	

}
