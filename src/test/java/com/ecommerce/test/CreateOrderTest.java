package com.ecommerce.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ecommerce.util.BaseTest;


public class CreateOrderTest extends BaseTest{
	
	@Test (groups = {"Functional" , "Integration"})
	public void CreateNewOrder() throws InterruptedException {
		homePageCommerce.goToLogin();
		loginPageCommerce.signIn();
		createOrderPageCommerce.chooseProduct();
		createOrderPageCommerce.makePurchase();
		assertEquals(createOrderPageCommerce.successfullyOrder(), "Your order has been successfully processed!");
		System.out.println(createOrderPageCommerce.successfullyOrder());
		
	} 

}
