package com.WebElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("http://automationpractice.com/index.php");
		
		
		Dimension resize = new Dimension(800,800);
		driver.manage().window().setSize(resize);
		
		Thread.sleep(3000);
		
		
	//	WebElement category = driver.findElement(By.xpath("//div[text()='Categories']"));
	//	category.click();
		
		
		driver.manage().window().maximize();
		
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		
		
		WebElement img = driver.findElement(By.xpath("//img[@title='Blouse']"));
		img.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		WebElement quantity = driver.findElement(By.xpath("//input[@name='qty']"));
		quantity.clear();
		quantity.sendKeys("2");
		
		
		WebElement size = driver.findElement(By.id("group_1"));
		size.click();
		
		Select s =new Select(size);
		s.selectByValue("2");
		
		Thread.sleep(1000);
		
		WebElement color = driver.findElement(By.xpath("//a[@title='White']"));
		color.click();
		
		WebElement addchart = driver.findElement(By.xpath("//button[@name='Submit']"));
		addchart.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		
		Thread.sleep(2000);
		
		WebElement pro = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		pro.click();
		
		Thread.sleep(2000);
		
		//sign in
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("3jayashree054@gmail.com");
		
		
		Thread.sleep(1000);
		
		WebElement create = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		create.click();
		
		Thread.sleep(4000);
		
		//Address detail
		
		WebElement radio = driver.findElement(By.id("uniform-id_gender2"));
		radio.click();
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		firstname.sendKeys("Jayashree");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lastname.sendKeys("Ragavan");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("Jaya@123456");
		
		WebElement days = driver.findElement(By.xpath("//select[@name='days']"));
		Select d = new Select(days);
		
		d.selectByValue("5");
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		Select m = new Select(month);
		
		m.selectByValue("8");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		Select y = new Select(year);
		
		y.selectByValue("1990");
		
		Thread.sleep(1000);
		
		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("Greens");
		
		WebElement add1 = driver.findElement(By.xpath("//input[@name='address1']"));
		add1.sendKeys("Tiruvallur");
		
		WebElement add2 = driver.findElement(By.xpath("//input[@name='address2']"));
		add2.sendKeys("Chennai");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select t = new Select(state);
		
		t.selectByValue("14");
		
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcode.sendKeys("00039");
		
		WebElement add3 = driver.findElement(By.xpath("//textarea[@name='other']"));
		add3.sendKeys("hjgdfuy");
		
		WebElement home = driver.findElement(By.xpath("//input[@name='phone']"));
		home.sendKeys("98765432310");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		mobile.sendKeys("9876343102");
		
		WebElement alias = driver.findElement(By.xpath("//input[@name='alias']"));
		alias.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register.click();
		
		Thread.sleep(3000);
		
		WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		address.click();
		
		//shipping
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		Thread.sleep(2000);
		
		WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		process.click();
		
		Thread.sleep(2000);
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		
		Thread.sleep(2000);
		
		WebElement submit1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		submit1.click();
		
		
		TakesScreenshot sn = (TakesScreenshot) driver;
		
		File source = sn.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\automation.png");
		
		FileUtils.copyFile(source, destination);
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
