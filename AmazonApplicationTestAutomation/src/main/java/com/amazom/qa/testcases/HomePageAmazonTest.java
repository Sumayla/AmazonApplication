package com.amazom.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseAmazon;
import com.amazon.qa.pages.HomePageAmazon;
import com.amazon.qa.pages.LoginPageAmazon;

public class HomePageAmazonTest extends TestBaseAmazon {
	
	
    LoginPageAmazon loginPageAmazon;
	HomePageAmazon homePageAmazon;
	
	
	public  HomePageAmazonTest() {
	super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		intializationAmazon();
		
		//creating object
		loginPageAmazon = new LoginPageAmazon();
		//homePageAmazon= new HomePageAmazon();	
		homePageAmazon= loginPageAmazon.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}

	
	@Test(priority=1)
	public void validateUsernameLabel() {
		boolean label= homePageAmazon.validateUsernameLabel();
		Assert.assertTrue(label);
		
	}
	
	@Test(priority=2)
	public void validateGreetLabelTest() {
		boolean flag=homePageAmazon.validateGreetLabel();
		Assert.assertTrue(flag);
	}
	
	
	////span[@class='nav-line-2']
	@Test(priority=3)
	public void validateYourOrderTest() {
		homePageAmazon.validateYourOrder();
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
		
	}
	
}
