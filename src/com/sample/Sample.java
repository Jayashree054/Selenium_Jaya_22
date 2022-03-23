package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");

		
	}

}
