package com.ecommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ecommerce.util.BasePage;

public class LoginPage extends BasePage {


    By email = By.id("Email");
    By password = By.id("Password");
    By login = By.xpath("//button[contains(text(), 'Log in')]");
    By verify_login = By.linkText("Log out");
    By error = By.xpath("//div[contains (text(), 'Login was unsuccessful. Please correct the errors and try again.')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage(WebDriver driver, int timeoutSec) {
        this(driver);
        setTimeoutSec(timeoutSec);
    }

    public void signIn() {
        type(email, "rob.roberts@gmail.com");
        type(password, "yd1073sw9y6ps");
        click(login);
    }

    public String verifyLogout() {
        WebElement message = wait.until(ExpectedConditions.presenceOfElementLocated(verify_login));
        return message.getText();
    }

    public void LoginInvalidUser() {
        type(email, "ral@gmail.com");
        type(password, "linra20");
        click(login);
    }

    public void LoginInvalidPassword() {
        type(email, "lim.r@gmail.com");
        type(password, "123");
        click(login);
    }

    public String verifyLogoutLogin() {

        if (isDisplayed(error)) {
            return text(error);
        }
        return null;
    }

}
	