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

public class Email_Gov {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://email.gov.in/");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("jayashree054@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("12345567");

		WebElement signin = driver.findElement(By.xpath("//button[@type ='submit']"));
		signin.click();

		Thread.sleep(3000);

		TakesScreenshot sn = (TakesScreenshot) driver; // higher to lower -> narrowing(type casting)

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\screen.png");

		FileUtils.copyFile(source, destination);

		driver.close();

	}

}
