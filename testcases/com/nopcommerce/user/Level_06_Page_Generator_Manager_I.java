package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_06_Page_Generator_Manager_I  extends BaseTest{
	private WebDriver driver;
	private String firstName, lastName, invalidEmail, notFoundEmail, existingEmail, validPassword, incorrectPassword;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = new UserHomePageObject(driver);
				
		firstName ="Min"; 
		lastName = "Trinh";
		invalidEmail = "auto@auto.com@.vn";
		existingEmail = "auto" + generateFakeNumber() + "@mail.vn";
		notFoundEmail = "auto" + generateFakeNumber() + "@mail.com";
		validPassword = "123456";
		incorrectPassword = "654321";
				
		homePage.openRegisterPage();
		registerPage = new UserRegisterPageObject(driver);
		
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(existingEmail);
		registerPage.inputToPasswordTextbox(validPassword);
		registerPage.inputToConfirmPasswordTextbox(validPassword);
		
		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		
		registerPage.clickToLogoutlink();
		
		homePage = new UserHomePageObject(driver);
	}

	@Test
	public void Login_01_Empty_Data() {	
		homePage.openLoginPage();
		
		loginPage = new UserLoginPageObject(driver);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextbox(), "Please enter your email");	
	}
	
	@Test
	public void Login_02_Invalid_email() {	
		homePage.openLoginPage();
		
		loginPage = new UserLoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(invalidEmail);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextbox(), "Wrong email");
	}
	
	@Test
	public void Login_03_Email_Not_Found() {
		homePage.openLoginPage();
		
		loginPage = new UserLoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(notFoundEmail);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageUnsuccessful(), 
				"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
		
	}
	
	@Test
	public void Login_04_Existing_Email_Empty_Password() {	
		homePage.openLoginPage();
		
		loginPage = new UserLoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox("");
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageUnsuccessful(), 
				"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
		
	}
	
	@Test
	public void Login_05_Existing_Email_Incorrect_Password() {	
		homePage.openLoginPage();
		
		loginPage = new UserLoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox(incorrectPassword);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageUnsuccessful(), 
				"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
		
	}
	
	@Test
	public void Login_06_Valid_Email_Password() {	
		homePage.openLoginPage();
		
		loginPage = new UserLoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox(validPassword);
		
		loginPage.clickToLoginButton();
		
		homePage = new UserHomePageObject(driver);
		
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
	}	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}


}
