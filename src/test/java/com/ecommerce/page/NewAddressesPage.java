package com.ecommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.util.BasePage;

public class NewAddressesPage extends BasePage{

	
	By add_new = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/button");
	By fistname = By.id("Address_FirstName");
	By lastname = By.id("Address_LastName");
	By email = By.id("Address_Email");
	By country = By.id("Address_CountryId");
	By city = By.id("Address_City");
	By address = By.id("Address_Address1");
	By postal_code= By.id("Address_ZipPostalCode");
	By phone_number = By.id("Address_PhoneNumber");
	By saveAddresses = By.xpath("//button[@class = \"button-1 save-address-button\"]");
	By registered = By.className("content"); 
	
	public NewAddressesPage(WebDriver driver) {
		super(driver);
	}
	
	public NewAddressesPage(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
	}
	
	public void AddAddress() {
		click(add_new);
		type(fistname, "Lindsy");
		type(lastname, "Ramos");
		type(email, "lim.r@gmail.com");
		Select sel_country = new Select(find(country));
		sel_country.selectByValue("50");
		type(city, "hnnn");
		type(address, "ucv 73 lote 56 zon e");
		type(postal_code, "1524");
		type(phone_number, "936548231");
		submit(saveAddresses);
		
	}

	public String verifyAddAddress() {
		WebElement info = wait.until(ExpectedConditions.presenceOfElementLocated(registered));
		return info.getText();
	}
	
}
