package com.WebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Youtube {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().to(driver.getCurrentUrl()); // refresh
	
		Thread.sleep(2000);
		
		Robot r = new Robot(); // refresh another way
		
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		
	}

}
