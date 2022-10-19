package com.webOrder.common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebOrder_BasePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//div[@class='login_info']")
	WebElement txtWelcome;
	
	@FindBy(linkText = "Logout")
	WebElement InLogout;
	
	@FindBy(xpath = "//h1[normalize-space()='Web Orders']")
	WebElement divLogo_img;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebOrder_BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebOrder_BasePage GoToHomePageAndSignIn(String username, String passwd) throws Exception {
		return signInToWebOrder(username, passwd);
	}

	public WebOrder_BasePage signInToWebOrder(String username, String passwd) {
		enterUserName(username);
		enterPassword(passwd);
		submitButton();
		return new WebOrder_BasePage(driver);
		
	}

	public void enterUserName(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
	}

	public void enterPassword(String passwd) {
		txtPassword.clear();
		txtPassword.sendKeys(passwd);
	}

	public void submitButton() {
		btnLogin.click();
	}
	
	public void logout() throws InterruptedException {
		txtWelcome.click();
		Thread.sleep(3000);
		InLogout.click();
		Thread.sleep(3000);
		divLogo_img.isDisplayed();
	}


	

}
