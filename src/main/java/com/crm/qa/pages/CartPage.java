package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class CartPage extends TestBase{
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Backpack']")
	WebElement item1;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement itemBag;
	
	@FindBy(id="back-to-products")
	WebElement navigateBack;
	
	
	
	// Item Selection
	public void ItemSelection() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", item1);
	}
	
}
