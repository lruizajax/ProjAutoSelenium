package com.ecommerce.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ecommerce.util.BaseTest;

public class ChangePasswordTest extends BaseTest {
	
	@Test (groups = "Regression")
	public void changePassword() {
		homePageCommerce.goToLogin();
		loginPageCommerce.signIn();
		homePageCommerce.goChangePassword();
		changePasswordPageCommerce.ModifyPassword();
		
		assertEquals(changePasswordPageCommerce.verifyChangePass(), "Password was changed");
		System.out.println(changePasswordPageCommerce.verifyChangePass());
	}

}
