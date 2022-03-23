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
import org.openqa.selenium.support.ui.Select;

public class Facebook_SingnUP {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("shree");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Ragavan");

		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9514122147");

		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Jaya@123456");

		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);

		d.selectByValue("5");

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);

		m.selectByValue("8");

		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);

		y.selectByValue("1990");

		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		radio.click();

		Thread.sleep(3000);

		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();

		Thread.sleep(8000);

		TakesScreenshot sn = (TakesScreenshot) driver;

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\facebook.png");

		FileUtils.copyFile(source, destin);

		driver.close();

	}
}
