package com.WebElements;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLink {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Link.html");

		// partial link text

		WebElement partial = driver.findElement(By.partialLinkText("Verify am"));

		partial.click();

		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//link text

		WebElement link = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));

		link.click();
		

		TakesScreenshot sn = (TakesScreenshot) driver;

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\LinkText.png");

		FileUtils.copyFile(source, destin);

		driver.close();

	}

}
