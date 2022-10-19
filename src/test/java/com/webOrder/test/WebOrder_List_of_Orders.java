package com.webOrder.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.common.WebOrder_BasePage;
import com.webOrder.common.WebOrder_BaseSetup;
import com.webOrder.common.WebOrder_VerifyListOffOrdersPage;
import com.webOrder.home.WebOrder_HomePage;

public class WebOrder_List_of_Orders extends WebOrder_BaseSetup {


	WebOrder_BasePage basePage ;                                         
	WebOrder_BaseSetup baseSetup;
	WebOrder_HomePage homePage;
	WebOrder_VerifyListOffOrdersPage verifyOrderPage;
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new WebOrder_BasePage(driver);
		homePage = new 	WebOrder_HomePage(driver);
		verifyOrderPage = new WebOrder_VerifyListOffOrdersPage(driver);
		//createOrder = new WebOrder_CreateOrderPage(driver);
	}
	
	@Test
	public void verify_orders() throws Exception {
		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		basePage.GoToHomePageAndSignIn("Tester", "test");
		homePage.ListOfAllOrders();
		
	    
	}
}


