package com.amazon.qa.base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.amazon.qa.utility.TestUtilAmazon;
import com.amazon.qa.utility.WebEventListener;

public class TestBaseAmazon {
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	public  static EventFiringWebDriver e_driver;
	
	
	
	
	public TestBaseAmazon() {
		 
		
		try {
			prop= new Properties();
			
			FileInputStream ip= new FileInputStream("C:\\Users\\SumaylaKhan\\eclipse-workspace\\AmazonApplicationTestAutomation\\src\\main\\java\\com\\amazon\\qa\\config\\config.propertiesAmazon");
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		

		public static void intializationAmazon() {
			
			String browserName =prop.getProperty("browser");
			if (browserName.equals("chrome")) {
					System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
					
					driver=new ChromeDriver();
					}
					
			
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.13.0\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\selenium-java-3.13.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtilAmazon.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtilAmazon.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			
		driver.get(prop.getProperty("url"));
			
			
		}
			
		
		
				
	



	private void intialization() {
		// TODO Auto-generated method stub
		
	}
	


	 
	
}
