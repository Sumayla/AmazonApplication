package com.amazom.qa.testcases;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC007 {

	public static void main(String[] args) {

	
		
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.pdfonline.com/pdf-to-word-converter/");
	
		//driver.switchTo().frame("fb_xdm_frame_https");
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//a[text()='Upload a File to Convert...']"));
		driver.findElement(By.xpath("//a[@id='uploader']"));
		
		
		
	
		

	}

}
