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

public class Flipkart_AbsoluteXpath {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// absolute xpath

		WebElement email = driver.findElement(By.xpath("//body/div[2]/div/div/div/div/div[2]/div/form/div/input"));

		email.sendKeys("rjayashree@gmail.com");

		
		WebElement password = driver.findElement(By.xpath("//body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));

		password.sendKeys("Jaya@123456");

		
		WebElement login = driver.findElement(By.xpath("//body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));

		login.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		TakesScreenshot sn = (TakesScreenshot) driver;

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\fabsolute.png");

		FileUtils.copyFile(source, destin);

		driver.close();

	}

}
