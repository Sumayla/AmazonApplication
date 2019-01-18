package com.amazom.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC009 {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.13.0\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		String message=alert.getText();
		System.out.println(message);
		alert.accept();
		driver.close();
		
		
		
				
		

	}

}
