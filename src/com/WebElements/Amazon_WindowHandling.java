package com.WebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_WindowHandling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		WebElement home = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		
		a.contextClick(home).build().perform();
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement cust_serv = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		
		a.contextClick(cust_serv).build().perform();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		
		a.contextClick(registry).build().perform();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement gift = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		
		a.contextClick(gift).build().perform();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement sell = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		
		a.contextClick(sell).build().perform();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//size
		
		int size = driver.getWindowHandles().size();
		
		System.out.println("Size :"+size);
		
		// parent id
		
		String parent_id = driver.getWindowHandle();
		
		System.out.println("Parent id :"+parent_id);
		
		// title of all window
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String i : allwindow) {
			
			String title = driver.switchTo().window(i).getTitle();
			
			System.out.println("Title :"+title);
		}
			
		
		// specific child window
		
	/*	String child ="Amazon Registry & Gifting";
		
		for(String child_window : allwindow) {
			
			if(driver.switchTo().window(child_window).getTitle().equalsIgnoreCase(child)) {
				break;
			}
		}
		
		*/
		
		//except parent close all window
		
		
		for(String close_window : allwindow) {
			
			if(!close_window.equals(parent_id)) {
				driver.switchTo().window(close_window).close();
			}
		}
		
		
		
		
		
		
	}

}
