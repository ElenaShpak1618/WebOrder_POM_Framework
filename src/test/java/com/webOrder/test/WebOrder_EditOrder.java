package com.webOrder.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.common.WebOrder_BasePage;
import com.webOrder.common.WebOrder_BaseSetup;
import com.webOrder.home.WebOrder_CreateOrderPage;
import com.webOrder.home.WebOrder_HomePage;

public class WebOrder_EditOrder extends WebOrder_BaseSetup{
	
	WebOrder_BasePage basePage ;                                         
//	WebOrder_SignInPage signIn ;
	WebOrder_BaseSetup baseSetup;
	WebOrder_CreateOrderPage createOrder;
	WebOrder_HomePage homePage;
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new WebOrder_BasePage(driver);
		homePage = new 	WebOrder_HomePage(driver);
		createOrder = new WebOrder_CreateOrderPage(driver);
	}
	
	@Test()
	public void createOrder() throws Exception {
//		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		basePage.GoToHomePageAndSignIn("Tester", "test");
		Thread.sleep(2000);
		homePage.OrderButton();
		Thread.sleep(2000);
		createOrder.select_product("ScreenSaver");
		Thread.sleep(2000);
		createOrder.enter_quantity("10");
		Thread.sleep(2000);
		createOrder.enter_quantity_price("100");
		Thread.sleep(2000);
		createOrder.enter_discount("10");
		Thread.sleep(2000);
		createOrder.calculate_total();
		Thread.sleep(2000);
		createOrder.enter_customer_name("farid");
		Thread.sleep(2000);
		createOrder.enter_street("100 john");
		Thread.sleep(2000);
		createOrder.enter_city("brooklyn");
		Thread.sleep(2000);
		createOrder.enter_state("New York");
		Thread.sleep(2000);
		createOrder.enter_zip("10012");
		Thread.sleep(2000);
		createOrder.selectMasterCard();
		Thread.sleep(2000);
		createOrder.enter_cardNumber("1236524372939");
		Thread.sleep(2000);
		createOrder.enter_expiration_date("12/23");
		Thread.sleep(2000);
		createOrder.clickOnSubmit();
	}


}
