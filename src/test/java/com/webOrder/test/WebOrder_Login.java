package com.webOrder.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.common.WebOrder_BasePage;
import com.webOrder.common.WebOrder_BaseSetup;
import com.webOrder.utils.WebOrder_TestData;

public class WebOrder_Login extends WebOrder_BaseSetup {

	WebOrder_BasePage signIn;
	WebOrder_BasePage basePage;
	WebOrder_BaseSetup baseSetup;
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new WebOrder_BasePage(driver);
		
	}

	@Test(description = "validateLogo() method call for logo verification", dataProvider = "login", dataProviderClass = WebOrder_TestData.class, priority = 3)
	public void logoVerifyTest(String uName, String uPass) throws Exception {
//		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		signIn = basePage.GoToHomePageAndSignIn(uName, uPass);
		Thread.sleep(3000);

		
	}

}
	


