package com.webOrder.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebOrder_EditOrderPage {
	
private WebDriver driver;
	
	
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
	WebElement productdd;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
	WebElement txtbxquantity;
	
	
	
	@FindBy(id = "View all ctl00_MainContent_fmwOrder_txtUnitPrice")
	WebElement txtbxpriceperunit;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
	WebElement txtbxdiscount;
	
	@FindBy(xpath = "//input[@class='btn_dark']")
	WebElement btntotal;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
	WebElement txtbxcustname;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
	WebElement txtbxst;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
	WebElement txtbxcity;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
	WebElement txtbxstate;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
	WebElement txtbxzip;
	
	@FindBy(xpath = "//input[@value='MasterCard']")
	WebElement rdbtncardtype;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
	WebElement txtbxcardnum;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
	WebElement txtbxexpiredate;
	
	@FindBy(id = "ctl00_MainContent_fmwOrder_UpdateButton")
	WebElement btnupdate;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public WebOrder_EditOrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public WebOrder_BasePage signInToWebOrder(String username, String passwd) {
//		enterUserName(username);
//		enterPassword(passwd);
//		submitButton();
//		return new WebOrder_BasePage(driver);
//		
//	}
	
	public void productdd(String ddvalue) {
		txtbxquantity.clear();
		Select selectProduct = new Select(txtbxquantity);
		selectProduct.selectByVisibleText("ddvalue");
		
	}
		
	
	public void editquantity(String quan) {
		txtbxquantity.clear();
		txtbxquantity.sendKeys(quan);
	}
	
	public void editpriceperunit(String priceperunit) {
		txtbxpriceperunit.clear();
		txtbxpriceperunit.sendKeys(priceperunit);
	}
	
	public void discount(String disc) {
		txtbxdiscount.clear();
		txtbxdiscount.sendKeys(disc);
	}
	public void clickcalcbutton() {
		btntotal.clear();
		btntotal.click();
	}
	
	public void editcustname(String custname) {
		txtbxcustname.clear();
		txtbxcustname.sendKeys(custname);
	}
	
	public void editstreet(String street) {
		txtbxst.clear();
		txtbxst.sendKeys(street);
	}
	
	public void editcity(String city) {
		txtbxcity.clear();
		txtbxcity.sendKeys(city);
	}
	
	public void editstate(String state) {
		txtbxstate.clear();
		txtbxstate.sendKeys(state);
	}
	
	public void editzip(String zipcode) {
		txtbxzip.clear();
		txtbxzip.sendKeys(zipcode);
	}
	
	public void cardtype(String card) {
		rdbtncardtype.clear();
		rdbtncardtype.sendKeys(card);
	}
	
	public void editcardnum(String cardnum) {
		txtbxcardnum.clear();
		txtbxcardnum.sendKeys(cardnum);
	}
	
	public void editexpdate(String expdate) {
		txtbxexpiredate.clear();
		txtbxexpiredate.sendKeys(expdate);
	}
	

	public void clickupdatebutton() {
		
		btnupdate.click();;
	}


}
