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

public class Adactin_Hotelbooking {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("jayashree054");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Jaya@123");
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

		WebElement location = driver.findElement(By.id("location"));
		Select l = new Select(location);

		l.selectByValue("New York");
		Thread.sleep(1000);

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(hotel);

		h.selectByValue("Hotel Sunshine");
		Thread.sleep(1000);

		WebElement room = driver.findElement(By.name("room_type"));
		Select r = new Select(room);

		r.selectByVisibleText("Deluxe");
		Thread.sleep(1000);

		WebElement num = driver.findElement(By.id("room_nos"));
		Select n = new Select(num);

		n.selectByValue("2");
		Thread.sleep(1000);

		WebElement fdate = driver.findElement(By.id("datepick_in"));
		fdate.clear();
		fdate.sendKeys("23/02/2022");
		Thread.sleep(1000);

		WebElement edate = driver.findElement(By.id("datepick_out"));
		edate.clear();
		edate.sendKeys("27/02/2022");
		Thread.sleep(1000);

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select a = new Select(adult);

		a.selectByValue("2");
		Thread.sleep(1000);

		WebElement child = driver.findElement(By.id("child_room"));
		Select c = new Select(child);

		c.selectByValue("2");
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		Thread.sleep(3000);

		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		Thread.sleep(1000);

		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		Thread.sleep(3000);

		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Jayashree");
		Thread.sleep(1000);

		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Ragavan");
		Thread.sleep(1000);

		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("Chennai");
		Thread.sleep(1000);

		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("1234567890123456");
		Thread.sleep(1000);

		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select cc = new Select(cardtype);

		cc.selectByValue("AMEX");
		Thread.sleep(1000);

		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select e = new Select(expmonth);

		e.selectByValue("5");
		Thread.sleep(1000);

		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select ey = new Select(expyear);

		ey.selectByValue("2022");
		Thread.sleep(1000);

		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("345");
		Thread.sleep(3000);

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(10000);

		TakesScreenshot sn = (TakesScreenshot) driver; // higher to lower -> narrowing(type casting)

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\adactin.png");

		FileUtils.copyFile(source, destination);

		driver.close();

	}

}
