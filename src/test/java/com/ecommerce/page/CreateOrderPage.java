package com.ecommerce.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.util.BasePage;

public class CreateOrderPage extends BasePage{
	
	By optionComputer_link = By.xpath("//a[text()= \"Computers \"]");
	By optionNotebooks_link = By.xpath("//a[text()= \" Notebooks \"]");
	By product1 = By.linkText("Asus N551JK-XO076H Laptop");
	By addProduct1_button = By.id("add-to-cart-button-5");
	By optionJewelry_link = By.xpath("//a[text()= \"Jewelry \"]");
	By product2 = By.linkText("Vintage Style Engagement Ring");
	By addProduct2_button = By.id("add-to-cart-button-42");
	By addProductExit = By.xpath("//a[text() =\"shopping cart\"]");
	By aceptConditions = By.id("termsofservice");
	By chaeckout_button = By.id("checkout"); 
	By billingAddress_button = By.name("save");
	By shippingMethod = By.id("shippingoption_2");
	By continueMethod = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button");
	By payMethod = By.id("paymentmethod_0");
	By aceeptPayMethod = By.xpath("//div[@id='payment-method-buttons-container']/button");
	By aceptPayInfo = By.xpath("//div[@id='payment-info-buttons-container']/button");
	By comfirOrder = By.xpath("//div[@id='confirm-order-buttons-container']/button");
	By orderFinish = By.xpath("//strong[text() = 'Your order has been successfully processed!']");

	public CreateOrderPage(WebDriver driver2) {
		super(driver2);
	}
	
	public CreateOrderPage(WebDriver driver2, int timeoutSec) {
		this(driver2);
		setTimeoutSec(timeoutSec);
	}
	
	public void chooseProduct () {
		click(optionComputer_link);
		click(optionNotebooks_link);
		click(product1);
		click(addProduct1_button);
		click(optionJewelry_link);
		click(product2);
		click(addProduct2_button);
	}
	
	public void makePurchase() throws InterruptedException {
		click(addProductExit);
		click(aceptConditions);
		click(chaeckout_button);
		click(billingAddress_button);
		click(shippingMethod);
		click(continueMethod);
		click(payMethod);
		click(aceeptPayMethod);
		// sysout ...
		//  usarlo solo para debug
		//  Thread.sleep(2000);
		isDisplayed(aceptPayInfo);
		click(aceptPayInfo);
		isDisplayed(comfirOrder);
		click(comfirOrder);
	}
	
	
	public String verifyAddedProducts() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement message = wait.until(ExpectedConditions.presenceOfElementLocated(addProductExit));
		return message.getAttribute("href");
		
	}
	
	public String successfullyOrder() {
		WebElement mesage = find(orderFinish);
		return mesage.getText();
		
		
	}
	

}
