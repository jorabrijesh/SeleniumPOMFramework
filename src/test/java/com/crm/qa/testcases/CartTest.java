package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class CartTest extends TestBase{
	CartTest cartTest;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	public CartTest() {
		super();
	}
	@Test(priority=4)
	public void addItems() {
		
	}

	
	
}
