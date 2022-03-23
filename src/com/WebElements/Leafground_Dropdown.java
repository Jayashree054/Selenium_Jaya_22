package com.WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("dropdown1"));

		Select s = new Select(dropdown); // select ->class

		s.selectByIndex(4);
		Thread.sleep(3000);

		s.selectByValue("2");
		Thread.sleep(3000);

		s.selectByVisibleText("Selenium");

		// multiple -dropdown

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));

		Select m = new Select(multiple);

		boolean multiple2 = m.isMultiple();

		System.out.println("Is Multiple :" + multiple2);

		System.out.println("----Multiple drop down------");

		List<WebElement> msize = m.getOptions();

		int size = msize.size();
		System.out.println("Size :" + size);

		for (WebElement i : msize) {
			System.out.println(i.getText());
		}

		// get all selected

		for (int i = 0; i < size; i++) {

			if (i == 1 | i == 3 | i == 5) {
				m.selectByIndex(i);

			}

		}
		
		System.out.println("--------All Selected option------");
		
		
		List<WebElement> allSelected = m.getAllSelectedOptions();
		
		
		for (WebElement i1 : allSelected) {
			System.out.println(i1.getText());
			
		}
		Thread.sleep(3000);
		
		System.out.println("-------First Selected option------");
		
		WebElement firstselect = m.getFirstSelectedOption();
		System.out.println("First Selected option :"+firstselect.getText());
		
		driver.close();
		
	}

}
