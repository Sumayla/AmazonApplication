package com.amazom.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseAmazon;
import com.amazon.qa.pages.HomePageAmazon;
import com.amazon.qa.pages.LoginPageAmazon;

public class LoginPageAmazonTest extends TestBaseAmazon {
	LoginPageAmazon loginPageAmazon;
	HomePageAmazon homePageAmazon;
	
	
	
	public LoginPageAmazonTest() {
		super();
		
	}
	
	
 @BeforeMethod
 
 public void setUp() {
	 intializationAmazon();
	 
	 loginPageAmazon = new LoginPageAmazon();
	 
	  
 }
 
 
 @Test(priority=1)
 public void validateTitleOfThePageTest() {
	 String title= loginPageAmazon.validateTitleOfThePage();
	 Assert.assertEquals(title , "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	 System.out.println(title);
 }

 
 
 @Test(priority=2)
 public void verifyLocationLogoTest() {
	 boolean flag= loginPageAmazon.verifyLocationLogo();
		Assert.assertTrue(flag);
	 
	 
 }
 
 
 @Test(priority=3)
 public void login() {
	 homePageAmazon=loginPageAmazon.login(prop.getProperty("username"), prop.getProperty("password"));
	 
 }
 
 @AfterMethod
 public void tearDown() {
	 driver.quit();
 }

}
