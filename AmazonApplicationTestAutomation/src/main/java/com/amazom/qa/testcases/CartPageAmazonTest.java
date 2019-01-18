package com.amazom.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseAmazon;
import com.amazon.qa.pages.CartPageAmazon;
import com.amazon.qa.pages.HomePageAmazon;
import com.amazon.qa.pages.LoginPageAmazon;

public class CartPageAmazonTest extends TestBaseAmazon {
	
	CartPageAmazon cartPageAmazon;
	LoginPageAmazon loginPageAmazon;
	HomePageAmazon homePageAmazon;
	
	

	
	public CartPageAmazonTest() {
		super();
		
	}
	
	@BeforeTest
	public void setUp() {
		intializationAmazon();
		loginPageAmazon = new LoginPageAmazon();
		cartPageAmazon= new CartPageAmazon();
		homePageAmazon=loginPageAmazon.login(prop.getProperty("username"), prop.getProperty("password"));
		
		homePageAmazon.enterCartPage();
		
		
	}
	
	@Test
	public void decreaseCartQuantityTest() {
		cartPageAmazon.decreaseCartQuantity();
		
	}
	
	
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
}
