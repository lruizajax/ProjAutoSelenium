package com.ecommerce.page;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.util.BasePage;

import java.util.Locale;

public class RegisterPage extends BasePage{

	By gender = By.id("gender-female");
	By firstname = By.id("FirstName");
	By lastname = By.id("LastName");
	By email = By.id("Email");
	By password = By.id("Password");
	By confirm = By.id("ConfirmPassword");
	By register_button = By.id("register-button");
	By verify_register = By.className("result");
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public RegisterPage(WebDriver driver2, int timeoutSec) {
		this(driver2);
		setTimeoutSec(timeoutSec);
	}

	public void createAccount() {

		click(gender);
		type(firstname, "Lindsy");
		type(lastname, "Ramos");			
		type(email, "lima.r@gmail.com");
		type(password, "linra20"); 
		type(confirm, "linra20");
		submit(register_button);
		
	}

	public void createAccountFake() {

		Faker faker = new Faker(new Locale("en-US"));
		String emailg = faker.internet().emailAddress();
		String passwordg = faker.internet().password();

		click(gender);
		type(firstname, faker.name().firstName());
		type(lastname, faker.name().lastName());
		type(email, emailg);
		type(password, passwordg);
		type(confirm, passwordg);
		click(register_button);

		System.out.println("Email is: " + emailg +" " + "Password is: "+ passwordg);

	}
	public String verifyRegisterMessage() {
		WebElement message = wait.until(ExpectedConditions.presenceOfElementLocated(verify_register));
		return message.getText();
	}


}
