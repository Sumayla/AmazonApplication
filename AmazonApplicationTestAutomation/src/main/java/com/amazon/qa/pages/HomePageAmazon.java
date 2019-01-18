package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.TestBaseAmazon;

public class HomePageAmazon extends TestBaseAmazon {
	
	@FindBy(xpath="//span[contains(text(),'Deliver to sumayla')]")
	WebElement usernamelabel;
	
	
	@FindBy(xpath="//span[contains(text(),'Hello, sumayla')]")
	WebElement greetlabel;
	
	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	WebElement cartbtn;
	
	@FindBy(xpath="//span[contains(text(),'Your Orders')]")
	WebElement yourorderlink;
	
	@FindBy(xpath="//a[contains(text(),\"Today's Deals\")]")
	WebElement todaysdeallink ;

	
	

//initializing the elements using pagefactory
	
  public HomePageAmazon() {
	  PageFactory.initElements(driver, this);
	  
  }
  
  
  
  //actions
  public boolean validateUsernameLabel() {
	 return  usernamelabel.isDisplayed();
	 
  }
  
  
  public boolean validateGreetLabel() {
	  return greetlabel.isDisplayed();
	  
  }
  
  public CartPageAmazon enterCartPage() {
	  cartbtn.click();
	  return new CartPageAmazon();
	  
	  
  }
  
  
  public TodaysDealPageAmazon validateTodaysDealLink() {
	  todaysdeallink.click();
	  return new TodaysDealPageAmazon();
	  
  }
  
  public void validateYourOrder() {
		//Select select = new Select(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-line-2']")));
		//select.selectByVisibleText("Your Orders");
	  
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-line-2']"))).build().perform();
		yourorderlink.click();
		
	}
  
  
}
