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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_ExplicitWait {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		
		
		// Explicit Wait

		WebElement amazon_device = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));

		WebDriverWait w = new WebDriverWait(driver, 50);

		w.until(ExpectedConditions.visibilityOf(amazon_device));
		
        
		TakesScreenshot sn = (TakesScreenshot) driver;
		
		File source = sn.getScreenshotAs(OutputType.FILE);
		
		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\await.png");
		
		FileUtils.copyFile(source, destin);


		
		driver.close();

	}

}
