package com.webOrder.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrder_ListOfProductsPage {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/table/tbody/tr/td[2]/div[2]/h2")
	WebElement ListOfProducts;

	@FindBy(xpath = "//th[normalize-space()='Product name']")
	WebElement Productname;

	@FindBy(xpath = "//th[normalize-space()='Price']")
	WebElement Price;

	@FindBy(xpath = "//th[normalize-space()='Discount']")
	WebElement Discount;

	public WebOrder_ListOfProductsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void VerifyListofProduct() {
		ListOfProducts.isDisplayed();

	}

	public void ProductName() {
		Productname.isDisplayed();
	}

	public void Price() {
		Price.isDisplayed();
	}

	public void Discount() {
		Discount.isDisplayed();
	}

}
