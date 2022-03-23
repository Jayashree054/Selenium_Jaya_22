package com.WebElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Alert {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");

		driver.manage().window().maximize();

		// Type 1 -> simple alert

		WebElement alert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alert.click();

		Alert alert_pop = driver.switchTo().alert();
		Thread.sleep(3000);
		alert_pop.accept();

		// Type 2 -> confirm alert

		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirm.click();

		Alert confirm_pop = driver.switchTo().alert();
		Thread.sleep(3000);
		confirm_pop.dismiss();

		WebElement getconfirm = driver.findElement(By.id("result"));
		System.out.println(getconfirm.getText());

		// Type 3 -> prompt alert

		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		prompt.click();

		Alert prompt_pop = driver.switchTo().alert();
		prompt_pop.sendKeys("Hi... This is Jayashree");
		Thread.sleep(3000);
		prompt_pop.accept();

		WebElement getprompt = driver.findElement(By.id("result1"));
		System.out.println(getprompt.getText());
		
		Thread.sleep(3000);
		
		TakesScreenshot sn =(TakesScreenshot) driver;
		File source = sn.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\alert.png");
        FileUtils.copyFile(source, destination);
		
        driver.close();

	}
}
