import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		//using click() we can select radiobutton
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement e=driver.findElement(By.id("vfb-7-1"));
		WebElement e1=driver.findElement(By.id("vfb-7-2"));
		e.click();
		Thread.sleep(5000);
		e1.click();

	}

}
