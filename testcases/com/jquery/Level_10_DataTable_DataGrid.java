package com.jquery;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.jQuery.dataTable.HomePageObject;
import pageObjects.nopCommerce.user.UserAddressPageObject;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import pageObjects.nopCommerce.user.UserRewardPointPageObject;

public class Level_10_DataTable_DataGrid extends BaseTest {
	HomePageObject homePage;
	List<String> actualAllCountryValues;
	List<String> expectedAllCountryValues;

	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = pageObjects.jQuery.dataTable.PageGeneratorManager.getHomePage(driver);

	}

	public void Table_01_Paging() {
		homePage.openPagingByPageNumber("10");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("10"));
		
		homePage.openPagingByPageNumber("20");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("20"));
		
		homePage.openPagingByPageNumber("7");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("10"));

	}

	public void Table_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);
		
		homePage.enterToHeaderTextboxByLabel("Country", "Argentina");
		homePage.enterToHeaderTextboxByLabel("Females", "338282");
		homePage.enterToHeaderTextboxByLabel("Males", "349238");
		homePage.enterToHeaderTextboxByLabel("Total", "687522");
		homePage.sleepInSecond(3);
		
		homePage.enterToHeaderTextboxByLabel("Country", "Angola");
		homePage.enterToHeaderTextboxByLabel("Females", "276880");
		homePage.enterToHeaderTextboxByLabel("Males", "276472");
		homePage.enterToHeaderTextboxByLabel("Total", "553353");
		homePage.sleepInSecond(3);

	}
	
	public void Table_03_Enter_To_Header() {
		// Đọc dữ liệu của file country.txt ra
		// Lưu vào 1 List<String> = expected value = expectedAllCountryValues
		
		// Actual value
		actualAllCountryValues = homePage.getValueEachRowAllPage();
		
		Assert.assertEquals(actualAllCountryValues, expectedAllCountryValues);	
	}
	
	@Test
	public void Table_04_Action_At_Any_Row() {
		homePage.clickToLoadButton();
		homePage.sleepInSecond(5);
		
		homePage.enterToTextboxByColumnNameAtRowNumber("Album", "2", "Minmin2022");
		homePage.enterToTextboxByColumnNameAtRowNumber("Artist", "4", "Min");
		homePage.enterToTextboxByColumnNameAtRowNumber("Year", "3", "2022");
		homePage.enterToTextboxByColumnNameAtRowNumber("Price", "1", "1000");
		
		homePage.selectDropdownByColumnNameAtRowNumber("Origin", "5", "Japan");
		
		homePage.checkToCheckBoxByColumnNameAtRowNumber("With Poster?", "3");
		homePage.checkToCheckBoxByColumnNameAtRowNumber("With Poster?", "5");
		
		homePage.uncheckToCheckBoxByColumnNameAtRowNumber("With Poster?", "1");
		homePage.uncheckToCheckBoxByColumnNameAtRowNumber("With Poster?", "2");
		homePage.uncheckToCheckBoxByColumnNameAtRowNumber("With Poster?", "4");
		
		homePage.clickToIconByRowNumber("1", "Remove Current Row");
		homePage.clickToIconByRowNumber("1", "Insert Row Above");
		homePage.clickToIconByRowNumber("3", "Move Up");
		
		homePage.clickToIconByRowNumber("5", "Remove Current Row");
		homePage.clickToIconByRowNumber("4", "Remove Current Row");
		homePage.clickToIconByRowNumber("3", "Remove Current Row");
		homePage.clickToIconByRowNumber("2", "Remove Current Row");
		homePage.clickToIconByRowNumber("1", "Remove Current Row");
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	

}
