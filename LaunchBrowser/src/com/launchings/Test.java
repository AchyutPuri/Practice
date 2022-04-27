package com.launchings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium jars\\chromedriver 98v\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.setProperty("webdriver.gecko.driver","E:\\Selenium jars\\firefoxdriver\\geckodriver.exe");
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.navigate().to("https://www.amazon.in/");
		

	}

}
