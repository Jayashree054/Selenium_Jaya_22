package com.WebElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leafground_Dragdrop {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/drop.html");

		Actions a = new Actions(driver);

		Thread.sleep(2000);

		WebElement drag = driver.findElement(By.id("draggable"));

		Thread.sleep(2000);

		WebElement drop = driver.findElement(By.id("droppable"));

	//	a.clickAndHold(drag).moveToElement(drop).build().perform();  --> one way of drag and drop
		
		a.dragAndDrop(drag, drop).build().perform(); // another way
		
		TakesScreenshot sn = (TakesScreenshot) driver;
		
		File source = sn.getScreenshotAs(OutputType.FILE);
		
		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\ldrag.png");
		
		FileUtils.copyFile(source, destin);
		
		driver.close();

	}
}
