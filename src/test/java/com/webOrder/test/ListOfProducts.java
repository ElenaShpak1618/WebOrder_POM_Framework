package com.webOrder.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.common.WebOrder_BasePage;
import com.webOrder.common.WebOrder_BaseSetup;
import com.webOrder.common.WebOrder_ListOfProductsPage;
import com.webOrder.home.WebOrder_HomePage;

public class ListOfProducts extends WebOrder_BaseSetup{
	WebOrder_BasePage basePage ;                                         
	WebOrder_BaseSetup baseSetup;
	WebOrder_ListOfProductsPage productsList;
	WebOrder_HomePage homePage;
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new WebOrder_BasePage(driver);
		homePage = new 	WebOrder_HomePage(driver);
		productsList = new WebOrder_ListOfProductsPage(driver);
		
	}
	

    @Test
	public void verifyAllProduct() throws Exception {
		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		basePage.GoToHomePageAndSignIn("Tester", "test");
		
		homePage.lnviewAllProducts();
		productsList.VerifyListofProduct();
		productsList.Price();
		productsList.ProductName();
		
	
}
}



