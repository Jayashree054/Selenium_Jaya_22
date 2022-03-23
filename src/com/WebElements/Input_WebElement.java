package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input_WebElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement note = driver.findElement(By.id("reg_pages_msg"));
		String text = note.getText();
		System.out.println("Bottom Presented Note :" + text);

		// username

		WebElement username = driver.findElement(By.id("email"));

		username.sendKeys("jayashree054@gmail.com");

		// password

		WebElement pswd = driver.findElement(By.name("pass"));

		pswd.sendKeys("Jaya@123456");

		// WebElement pwdc = driver.findElement(By.id("pass"));

		// pwdc.sendKeys("Jaya@123456");

		// login button

		WebElement login = driver.findElement(By.name("login"));

		login.click();

		Thread.sleep(9000);
	//	driver.close();

	}

}
