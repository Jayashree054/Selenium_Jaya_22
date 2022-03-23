package com.WebElements;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Frame {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/frame.html");

		// frame 1
		driver.switchTo().frame(0); // enter into frame

		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();

		System.out.println("Text :" + frame1.getText());

		driver.switchTo().defaultContent(); // to come out of the frame

		// frame 2 inner and outer

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();

		System.out.println(" Text 2 :" + frame2.getText());
		driver.switchTo().defaultContent();

		// size

		List<WebElement> frame_size = driver.findElements(By.tagName("iframe"));

		int size = frame_size.size();
		System.out.println(" Size :" + size);

		Thread.sleep(3000);

		TakesScreenshot sn = (TakesScreenshot) driver;

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\frame.png");

		FileUtils.copyFile(source, destination);
		
		driver.close();

	}

}
