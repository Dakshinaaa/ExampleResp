package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshina101\\eclipse-workspace\\Selenium7am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.findElement(By.id("home")).click();
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		String allwindowAll = driver.getWindowHandle();
		System.out.println(allwindowAll);
		
		for(String x:allwindowAll)
		{
			if(!x.equals(parentWindowId));
			{
				driver.switchTo().window(x);
			}
		}
		
			
	}

}
