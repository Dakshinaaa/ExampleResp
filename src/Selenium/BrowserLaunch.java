package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshina101\\eclipse-workspace\\Selenium7am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement user= driver.findElement(By.id("txtUsername"));
		user.sendKeys("admin");
		
		WebElement pass=driver.findElement(By.name("txtPassword"));
		pass.sendKeys("admin123");
		
		//WebElement login=driver.findElement(By.className("button"));
		//login.click();
		
		WebElement forgot= driver.findElement(By.xpath("//div[contains(@id,'forgot')]//a"));
		forgot.click();
		
		*/
		
		/* 2
		driver.get("https://chromedriver.chromium.org/downloads");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		*/
		
		/* 1
		driver.get("https://chromedriver.chromium.org/downloads");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();
		driver.quit();*/
		

	}

}
