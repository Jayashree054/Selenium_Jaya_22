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

public class Automation_DemoAlert {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		// Alert with OK
		
		WebElement simple = driver.findElement(By.xpath("//a[@class='analystic']"));
		simple.click();
		
		WebElement display = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		display.click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		
		// Alert with OK and Cancel
		
		WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmbox.click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.accept();
		
		WebElement text = driver.findElement(By.id("demo"));
		System.out.println(text.getText());
		
		// Alert with TextBox
		
		WebElement prompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		
		WebElement promptbox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptbox.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Hi... This Is Jayashree");
		Thread.sleep(3000);
		alert3.accept();
		
		WebElement text1 = driver.findElement(By.id("demo1"));
		System.out.println(text1.getText());
		
		Thread.sleep(3000);
		
		TakesScreenshot sn = (TakesScreenshot) driver;
		
		File source = sn.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\auto.png");
		
		FileUtils.copyFile(source, destination);
		
		
		driver.close();
		
		
	}

}
