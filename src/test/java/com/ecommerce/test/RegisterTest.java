package com.ecommerce.test;


import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


import com.ecommerce.util.BaseTest;

public class RegisterTest extends BaseTest {

	
	@Test (priority = 0, groups = "Functional")
	public void doRegister() {
		homePageCommerce.goToRegister();
		//registerPageCommerce.createAccount();
		registerPageCommerce.createAccountFake();
		assertEquals(registerPageCommerce.verifyRegisterMessage(),"Your registration completed");
		System.out.println(registerPageCommerce.verifyRegisterMessage());
	}
	
}
