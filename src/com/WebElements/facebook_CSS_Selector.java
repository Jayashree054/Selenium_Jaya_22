package com.WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_CSS_Selector {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	// using id
		
		WebElement email = driver.findElement(By.cssSelector("#email"));
		
		email.sendKeys("ishu123@gmail.com");
		
		Thread.sleep(2000);
		
		email.clear();
		
	
		// using attribute
		
		WebElement email1 = driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']"));
		
		email1.sendKeys("Babi123@gmail.com");
		
		Thread.sleep(2000);
		
		email1.clear();
		
		
		// using multiple attribute
		
		
		WebElement email2 = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
		
		email2.sendKeys("SV@gmail.com");
		
		Thread.sleep(2000);
		
		
		// prefix
		
		WebElement pass = driver.findElement(By.cssSelector("[type^='pa']"));
		
		pass.sendKeys("12344566");
		
		Thread.sleep(2000);
		
		pass.clear();
		
		
		// suffix
		
		WebElement pass1 = driver.findElement(By.cssSelector("[class$='_9npi']"));
		
		pass1.sendKeys("86764543245");
		
		Thread.sleep(1000);
		
		
		//substring
		
		WebElement submit = driver.findElement(By.cssSelector("[type*='submit']"));
		
		submit.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
