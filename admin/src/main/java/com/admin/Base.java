package com.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	WebDriver driver;
	 
	 
	public Base(WebDriver ldriver)
	{	
	this.driver=ldriver;
	}
	
	
	//Navigations
	
	@FindBy(xpath ="//a[@class='nav-section blc-icon-catalog active']")
	WebElement navCatalog;
	
	@FindBy(xpath ="//a[@class='nav-section fa fa-usd']")
	WebElement navDollar;
	
	@FindBy(xpath ="//a[@class='nav-section blc-icon-content']")
	WebElement navContent;
	
	@FindBy(xpath ="//a[@class='nav-section blc-icon-customer-care']")
	WebElement navCustomerCare;
	
	@FindBy(xpath ="//a[@class='nav-section blc-icon-settings']")
	WebElement navSetting;
	
	
	@FindBy(xpath ="//a[contains(text(),'Categories')]")
	WebElement navCategories;
	
	@FindBy(xpath ="//a[contains(text(),'All Products')]")
	WebElement navAllProducts;
	
	@FindBy(xpath ="//a[contains(text(),'Base Product')]")
	WebElement navBaseProduct;
	
	@FindBy(xpath ="//a[contains(text(),'Product Options')]")
	WebElement navProductOptions;
	
	@FindBy(xpath ="//button[contains(text(),'Filter')]")
	WebElement buttonFilter;
	
	@FindBy(xpath ="//div[@class='selectize-input items has-options full has-items']")
	WebElement dropdown;
	
	@FindBy(xpath ="//a[contains(text(),'Offers')]")
	WebElement navOffer;
	
	@FindBy (xpath ="//button[contains(text(),'Offer')]")
	WebElement addOffer;
	
	@FindBy (xpath = "//input[@type='text' and @value ='New Offer']")
	WebElement nameOffer;
	
	@FindBy (xpath = "//label[@class='radio-label' and contains(text(),'Amount Off')]")
	WebElement amountOff;
	
	@FindBy (xpath ="//label[contains(text(),'Order Item')]")
	WebElement orderItem;
	
	@FindBy(xpath ="//div[@id='field-value']/div/input[@class='numeric-field']")
	WebElement discountValue;
	
	@FindBy (xpath ="//button[contains(text(),'Save')]")
	WebElement offerSave;
	
	@FindBy(xpath ="//select[@name='qb_95867_rule_0_filter']")
	WebElement select_cond;
	
	public void filterItem() {
		System.out.println("Hi");
		
		navCatalog.click();
		navCategories.click();
		buttonFilter.click();
		dropdown.click();
	}
	
	public void addOffer() throws Exception {
		
		//click on dollar symbol
		navDollar.click();
		
		//click on offer
		navOffer.click();
		// click on add offer button
		addOffer.click();
		//name the offer
		Thread.sleep(5000);
		nameOffer.clear();
		nameOffer.sendKeys("MyOffer");
		//discount type - amount off
		amountOff.click();
		//type - order item
		orderItem.click();
		//value - 1$
		discountValue.clear();
		discountValue.sendKeys("1");
		
		Select cond = new Select(select_cond);
		cond.selectByValue("price");
		
		
		//Click on Save
		offerSave.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
