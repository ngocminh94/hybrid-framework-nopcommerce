package com.nopcommerce.user;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import reportConfig.ExtentTestManager;

public class Level_15_ExtentV5 extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getUserHomePage(driver);

		firstName = "Min";
		lastName = "Trinh";
		emailAddress = "auto" + generateFakeNumber() + "@mail.vn";
		validPassword = "123456";

	}

	@Test
	public void User_01_Register(Method method) {
		ExtentTestManager.startTest(method.getName(), "User_01_Register");
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 01: Navigate to Register page");
		registerPage = homePage.openRegisterPage();
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 02: Enter to First name textbox with value '" + firstName +"'");
		registerPage.inputToFirstnameTextbox(firstName);
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 03: Enter to Last name textbox with value '" + lastName +"'");
		registerPage.inputToLastnameTextbox(lastName);
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 04: Enter to Email address textbox with value '" + emailAddress +"'");
		registerPage.inputToEmailTextbox(emailAddress);
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 05: Enter to Password textbox with value '" + validPassword +"'");
		registerPage.inputToPasswordTextbox(validPassword);
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 06: Enter to Confirm Password textbox with value '" + validPassword +"'");
		registerPage.inputToConfirmPasswordTextbox(validPassword);
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 07: Click to Register button");
		registerPage.clickToRegisterButton();
		
		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 08: Verify register success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
	}

	@Test
	public void User_02_Login(Method method) {
		ExtentTestManager.startTest(method.getName(), "User_02_Login");
		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Navigate to Login page");
		homePage = registerPage.clickToLogoutlink();
		loginPage = homePage.openLoginPage();

		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Enter to Email address textbox with value '" + emailAddress +"'");
		loginPage.inputToEmailTextbox(emailAddress);
		
		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Enter to Password textbox with value '" + validPassword +"'");
		loginPage.inputToPasswordTextbox(validPassword);

		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click to Login button");
		homePage = loginPage.clickToLoginButton();
		
		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 05: Verify 'My Account link' displayed");
		Assert.assertFalse(homePage.isMyAccountLinkDisplayed());
		
		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 06: Navigate to My Account page");
		customerInforPage = homePage.openMyAccountPage();
		
		ExtentTestManager.getTest().log(Status.INFO, "Login - Step 07: Verify 'Cudtomer Info' page displayed");
		Assert.assertFalse(customerInforPage.isCustomerInforPageDisplayed());
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private UserCustomerInforPageObject customerInforPage;
	private String firstName, lastName, emailAddress, validPassword;

}
