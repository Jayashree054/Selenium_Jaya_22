package com.WebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra_Wait_Scrollbar {

	public static void main(String[] args) throws AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		// implicit wait - global wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions a = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]"));

		a.contextClick(women).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allwindow = driver.getWindowHandles();

		for (String i : allwindow) {

			String title = driver.switchTo().window(i).getTitle();

			System.out.println("Title :" + title);

		}
		
		//Explicit wait
		
		WebElement kids = driver.findElement(By.xpath("//a[@data-reactid='17']"));
		
		WebDriverWait w = new WebDriverWait(driver,100);
		
		w.until(ExpectedConditions.visibilityOf(kids));
		
		

		// JavaScriptExecutor js = (JavaScriptExecutor) driver;

		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

		js.executeScript("window.scroll(0,4300)", "");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait

	
		// selecting particular element

		WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));

		js.executeScript("arguments[0].scrollIntoView(true)", beauty);

		js.executeScript("arguments[0].click()", beauty);
		
		
        TakesScreenshot sn = (TakesScreenshot) driver;
		
		File source = sn.getScreenshotAs(OutputType.FILE);
		
		File destin = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Jaya\\Screenshots\\mwait.png");
		
		FileUtils.copyFile(source, destin);


		driver.quit();
		
	}

}
