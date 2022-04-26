import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("007");
		driver.findElement(By.name("submit")).submit();
		
		//switching to alert
		 Alert alert=driver.switchTo().alert();
		 
		 //getting message 
		 String getmessage=driver.switchTo().alert().getText();
		 
		 //diplaying alert message
		 System.out.println(getmessage);
		 
		 Thread.sleep(5000);
		 
		 //accepting alert
		 
		 alert.accept();
		 
		    
		
		
	}

}
