package com.ecommerce.test;

import org.testng.annotations.Test;

import com.ecommerce.util.BaseTest;

public class HomeTest extends BaseTest{

	
	@Test 
	public void goToRegisterPage() {
		homePageCommerce.goToRegister();
		
	}
	
	@Test 
	public void goToLogIn() {
		homePageCommerce.goToLogin();
	}
	
	@Test
	public void goCreateNewAddresses() {
		homePageCommerce.goNewAddresses();
		
	}
	
	@Test
	public void goChangePassword() {
		homePageCommerce.goChangePassword();
	}

}
