package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserAddressPageObject;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import pageObjects.nopCommerce.user.UserRewardPointPageObject;

public class Level_15_ReportNG_Screenshot extends BaseTest {

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
	public void User_01_Register() {
		log.info("Register - Step 01: Navigate to Register page");	
		registerPage = homePage.openRegisterPage();
		
		log.info("Register - Step 02: Enter to First name textbox with value '" + firstName +"'");	
		registerPage.inputToFirstnameTextbox(firstName);
		
		log.info("Register - Step 03: Enter to Last name textbox with value '" + lastName +"'");	
		registerPage.inputToLastnameTextbox(lastName);
		
		log.info("Register - Step 04: Enter to Email address textbox with value '" + emailAddress +"'");
		registerPage.inputToEmailTextbox(emailAddress);
		
		log.info("Register - Step 05: Enter to Password textbox with value '" + validPassword +"'");
		registerPage.inputToPasswordTextbox(validPassword);
		
		log.info("Register - Step 06: Enter to Confirm Password textbox with value '" + validPassword +"'");
		registerPage.inputToConfirmPasswordTextbox(validPassword);
		
		log.info("Register - Step 07: Click to Register button");
		registerPage.clickToRegisterButton();
		
		log.info("Register - Step 08: Verify register success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed----");
	}

	@Test
	public void User_02_Login() {	
		log.info("Login - Step 01: Navigate to Login page");
		homePage = registerPage.clickToLogoutlink();
		loginPage = homePage.openLoginPage();

		log.info("Login - Step 02: Enter to Email address textbox with value '" + emailAddress +"'");
		loginPage.inputToEmailTextbox(emailAddress);
		
		log.info("Login - Step 03: Enter to Password textbox with value '" + validPassword +"'");
		loginPage.inputToPasswordTextbox(validPassword);

		log.info("Login - Step 04: Click to Login button");
		homePage = loginPage.clickToLoginButton();
		
		log.info("Login - Step 05: Verify 'My Account link' displayed");
		Assert.assertFalse(homePage.isMyAccountLinkDisplayed());
		
		log.info("Login - Step 06: Navigate to My Account page");
		customerInforPage = homePage.openMyAccountPage();
		
		log.info("Login - Step 07: Verify 'Cudtomer Info' page displayed");
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
