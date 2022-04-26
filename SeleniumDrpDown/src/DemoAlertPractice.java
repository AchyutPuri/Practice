import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlertPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("7007");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		//switching to Alert
		Alert alert=driver.switchTo().alert();
		
		String getmessage=driver.switchTo().alert().getText();
		System.out.println("message on alert is:-"+getmessage);
		alert.accept();
		
		String getmessage1=driver.switchTo().alert().getText();
		System.out.println("message second is:-"+getmessage1);
		alert.accept();
		
		driver.findElement(By.name("cusid")).sendKeys("6533");
        driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		//switching to Alert
		//Alert alert=driver.switchTo().alert();
		
		String getmessage3=driver.switchTo().alert().getText();
		System.out.println("message on alert is:-"+getmessage);
		alert.accept();
		
		String getmessage4=driver.switchTo().alert().getText();
		System.out.println("message second is:-"+getmessage1);
		alert.accept();
		
		
		
		
		

	}

}
