package com.ecommerce.test;


import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ecommerce.util.BaseTest;


public class NewAddressesTest extends BaseTest{

	@Test (priority = 2, groups = "Functional" )
	public void createNewAddresses() {
		homePageCommerce.goToLogin();
		loginPageCommerce.signIn();		
		homePageCommerce.goNewAddresses();
		newAddressesPage.AddAddress();
		
		assertEquals(newAddressesPage.verifyAddAddress(), "The new address has been added successfully.");
		System.out.println(newAddressesPage.verifyAddAddress());
	}
	
}
