package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBaseAmazon;

public class CartPageAmazon extends TestBaseAmazon {

	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	WebElement cart;
	
	
	@FindBy(xpath="//input[@value='Proceed to checkout']")
	WebElement checkoutbtn;
	
	
	
	
	@FindBy(xpath="//span[@id='a-autoid-0-announce']")
	WebElement quantity;
	
	
	//initializing webelements usingpagefactory
	public CartPageAmazon() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void decreaseCartQuantity() {
		quantity.click();
		
	}
	
}
