package com.amazom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBaseAmazon;
import com.amazon.qa.pages.HomePageAmazon;
import com.amazon.qa.pages.LoginPageAmazon;
import com.amazon.qa.pages.TodaysDealPageAmazon;

public class TodaysDealPageAmazonTest extends TestBaseAmazon{
	
	TodaysDealPageAmazon todaysDealPageAmazon;
	LoginPageAmazon loginPageAmazon;
	HomePageAmazon homePageAmazon;
	

	public TodaysDealPageAmazonTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		intializationAmazon();
		todaysDealPageAmazon= new TodaysDealPageAmazon();
		loginPageAmazon = new LoginPageAmazon();
		homePageAmazon= loginPageAmazon.login(prop.getProperty("username"), prop.getProperty("password"));
		todaysDealPageAmazon=homePageAmazon.validateTodaysDealLink();
		
		
		
	}
	
	@Test(priority=1)
	public void validateTodaysDealLabelTest() {
		boolean flag= todaysDealPageAmazon.validateTodaysDealLabel();
		Assert.assertTrue(flag);
		
		
	}
	
	@Test(priority=2)
	public void selectAppliancesOptionTest() {
		todaysDealPageAmazon.selectAppliancesOption();
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

