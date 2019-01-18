package com.amazom.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC008 {

	public static void main(String[] args) throws AWTException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.13.0\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.pdfonline.com/pdf-to-word-converter/");
	     driver.findElement(By.xpath("//div[@id='nav-xshop-container']")).click();	
	     Robot robot = new Robot();
	    // robot.keyPress(KeyEvent.VK_TAB);
	     robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		
		
		
	}

}
