package com.amazon.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBaseAmazon;

public class LoginPageAmazon extends TestBaseAmazon{
	 
	
	@FindBy(xpath="//span[contains(text(),'Hello. Sign in')]")
	WebElement signinbtn;
	
	@FindBy(xpath="//div[@id='nav-packard-glow-loc-icon']")
	WebElement locationlogo;
	
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginbtn;
	
	


//creating constructor
//initializing webelements

//this refers to the current class

//initializing the webelements using pagefactory

    public LoginPageAmazon() {
    PageFactory.initElements(driver, this);
	
	
}

//actions
    
    public String validateTitleOfThePage() {
    	return driver.getTitle();
    }
    
    public boolean verifyLocationLogo() {
    	return locationlogo.isDisplayed();
    	
    }
    
    public HomePageAmazon login(String un,String pwd) {
    	
    	signinbtn.click();
    	username.sendKeys(un);
    	continuebtn.click();
    	password.sendKeys(pwd);
    	loginbtn.click();
    	
    return new HomePageAmazon();
    
    }

}
