package com.ecommerce.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ecommerce.page.ChangePasswordPage;
import com.ecommerce.page.CreateOrderPage;
import com.ecommerce.page.HomePage;
import com.ecommerce.page.LoginPage;
import com.ecommerce.page.NewAddressesPage;
import com.ecommerce.page.RegisterPage;

public class BaseTest {

	protected WebDriver driver;
	private String BASE_URL;
	private FileReader reader;
	private Properties props;
	protected HomePage homePageCommerce;
	protected RegisterPage registerPageCommerce;
	protected LoginPage loginPageCommerce;
	protected NewAddressesPage newAddressesPage;
	protected ChangePasswordPage changePasswordPageCommerce;
	protected CreateOrderPage createOrderPageCommerce;

	@BeforeTest
	public void loadSettings() throws IOException {
		reader = new FileReader(System.getProperty("user.dir")+"/src/test/resources/config.properties");
		props = new Properties();
		props.load(reader);
		BASE_URL = props.getProperty("url");
	}

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver(); // unica inicializacion para todas las clases
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		homePageCommerce = new HomePage(driver);
		registerPageCommerce = new RegisterPage(driver);
		loginPageCommerce = new LoginPage(driver);
		newAddressesPage = new NewAddressesPage(driver);
		changePasswordPageCommerce = new ChangePasswordPage(driver);
		createOrderPageCommerce = new CreateOrderPage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
