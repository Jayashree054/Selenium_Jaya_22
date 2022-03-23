package com.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");

		String title = driver.getTitle();

		System.out.println("Title :" + title);

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL :" + currentUrl);

		String pageSource = driver.getPageSource();

		System.out.println(" Page Source :" + pageSource);

		driver.manage().window().maximize(); // for maximizing window

		driver.navigate().to("https://www.hondacarindia.com/honda-jazz"); // navigate one url to another url

		driver.navigate().back(); // back to myntra
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);    //implicit wait
		
		driver.navigate().forward(); // forward to honda

		driver.navigate().refresh();

		Thread.sleep(3000);

		driver.close();

	}

}
