package com.WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus_CSS_Selector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement from = driver.findElement(By.cssSelector("input#src"));

		from.sendKeys("chennai");

		WebElement to = driver.findElement(By.cssSelector("[tabindex='2']"));

		to.sendKeys("Tirupathi");

		WebElement date = driver.findElement(By.cssSelector("[id^='onw']"));

		// date.click();

		date.sendKeys("16-Mar-2022");

		WebElement submit = driver.findElement(By.cssSelector("[class*='fl button']"));

		submit.click();

	}

}
