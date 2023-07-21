package com.ecommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.util.BasePage;

public class ChangePasswordPage extends BasePage {
	
	By oldPassword = By.id("OldPassword");
	By newPassword = By.id("NewPassword");
	By confirm_password = By.id("ConfirmNewPassword");
	By change_password= By.xpath("//button[text()='Change password']");
	By changed = By.className("content");

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public ChangePasswordPage(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
	}
	
	public void ModifyPassword() {
		type(oldPassword, "yd1073sw9y6ps");
		type(newPassword, "12345678");
		type(confirm_password, "12345678");
		submit(change_password);
		
	}
	
	public String verifyChangePass() {
		WebElement message = wait.until(ExpectedConditions.presenceOfElementLocated(changed));
		return message.getText();
	}


}
