import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindowHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Click Here")).click();

		String mainwindow = driver.getWindowHandle();
		System.out.println("main winodw handle is:--" + mainwindow);

		// to handle all opened windows
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) 
		{
			String childwindow = i1.next();
			if (!mainwindow.equals(childwindow)) 
			{
				// switching to child window
				driver.switchTo().window(childwindow);
				driver.findElement(By.name("emailid")).sendKeys("puri@gmail.com");
				driver.findElement(By.name("btnLogin")).click();

				// closing the child window
				driver.close();
			}
		}

		// switching to main window
		driver.switchTo().window(mainwindow);
	}

}
