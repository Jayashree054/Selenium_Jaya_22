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

public class Dynamic_Webtable_Guru99 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.demo.guru99.com/test/web-table-element.php");
		
		

		// xpath is taken using absolute xpath

		WebElement company = driver.findElement(By.xpath("//body/div/div[3]/div/table/tbody/tr[5]"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(company.getText());
		
		

		// selecting particular cell data

		WebElement particular = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[6]/td[3]"));

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(particular.getText());
		

		TakesScreenshot sn = (TakesScreenshot) driver;

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\dynamic_webtable.png");

		FileUtils.copyFile(source, destin);
		
		driver.close();

	}

}
