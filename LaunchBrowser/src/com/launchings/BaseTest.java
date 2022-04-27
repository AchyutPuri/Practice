package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static WebDriver driver;
	
	public static void launch(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium jars\\chromedriver 98v\\chromedriver.exe");
		    driver=new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium jars\\firefoxdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	public static void navigate(String url)
	{
		driver.get(url);
	}
}
