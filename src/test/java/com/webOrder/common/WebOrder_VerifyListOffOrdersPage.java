package com.webOrder.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrder_VerifyListOffOrdersPage {
	
	WebDriver driver;
	public WebOrder_VerifyListOffOrdersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
//	@FindBy(linkText = "javascript:__doPostBack('ctl00$MainContent$btnCheckAll','')")
//	WebElement CheckAll;
//	
//    @FindBy(linkText = "javascript:__doPostBack('ctl00$MainContent$btnUncheckAll','')")
//	WebElement UnCheckAll;
    
    @FindBy(name = "ctl00_MainContent_orderGrid_ctl02_OrderSelector")
    WebElement selectCheckBox;
    
    @FindBy(name = "ctl00_MainContent_btnDelete")
    WebElement DeleteSelectedButton;
    
    @FindBy(xpath = "(//input[@alt='Edit'])[1]")
    WebElement editOrderButton;
    
    
//    public void verifyCheAll() {
//    	CheckAll.isDisplayed();
//    }
    
//    public void VerifyUncheckAll() {
//    	UnCheckAll.isDisplayed();
//    }
    public void clickOnselectCheckBox() {
    	selectCheckBox.click();
    }
    public void clickOnDeleteSelectedButton() {
    	DeleteSelectedButton.click();
    }
    public void clickOneditOrderButton() {
    	editOrderButton.click();
    }
    

}
