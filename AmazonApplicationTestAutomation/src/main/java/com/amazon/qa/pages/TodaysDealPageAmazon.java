package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.TestBaseAmazon;

public class TodaysDealPageAmazon extends TestBaseAmazon{

	

@FindBy(xpath="//div[@class='gbh1-bold']")
WebElement todaysdeallabel;

@FindBy(xpath="//div[@class='a-row a-expander-container a-expander-inline-container']//span[@class='a-label a-checkbox-label'][contains(text(),'Appliances')]\r\n" + 
		"")
WebElement appliances;

@FindBy(xpath="//a[@href='https://www.amazon.in/Prestige-PIC-20-Induction-Cooktop/dp/B00YMJ0OI8/ref=gbps_tit_s-4_bb3a_8f840306?smid=A19FTARVZBE213&pf_rd_p=b64a98c4-7e1d-4b82-a77c-891a716ebb3a&pf_rd_s=slot-4&pf_rd_t=701&pf_rd_i=gb_main&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_r=Z7B6FMKW8TF3A9WYK731']//following::button[1]")
WebElement addtocart;



//initializing webelements using page factory

public TodaysDealPageAmazon() {
	PageFactory.initElements(driver, this);
}
	
//Actions
	

public boolean validateTodaysDealLabel() {
	return todaysdeallabel.isDisplayed();
	
}


public void selectAppliancesOption() {
	//Select select = new Select(driver.findElement(By.xpath("//div[@class='a-row a-expander-container a-expander-inline-container']//span[@class='a-label a-checkbox-label'][contains(text(),'Appliances')]")));
	//select.selectByVisibleText("Appliances");
	appliances.click();
	addtocart.click();
	
	
}

	
}
