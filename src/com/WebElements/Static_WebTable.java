package com.WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		System.out.println("=========HEADER========");
		
		// all header
		
		List<WebElement> allheader = driver.findElements(By.xpath("//table/tbody/tr/th"));
		
		
		for(WebElement all : allheader) {
		
			System.out.println("Header :"+all.getText());
		}
		
		//all data
		
		System.out.println("=========ALL DATA========");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		
		for (WebElement alld : alldata ) {
			
			System.out.println("All Data :"+alld.getText());
		}
		
		// specific row
		
		System.out.println("=======SPECIFIC ROW=======");
		
		List<WebElement> specific_row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		
		for (WebElement specific : specific_row) {
			
			System.out.println("Specifice Row : "+specific.getText());
			
		}
			
		// specific column
		
		System.out.println("=========SPECIFIC COLUMN======");
		
		List<WebElement> specific_col = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		
		for(WebElement col : specific_col) {
			
			System.out.println("Specific column :"+col.getText());
		}
			
		// Row Size
		
		System.out.println("======ROW SIZE======");
		
		List<WebElement> row_size = driver.findElements(By.tagName("tr"));
		
		int rsize = row_size.size();
		
		System.out.println("Row Size :"+rsize);
		
		// total data
		
		System.out.println("======TOTAL DATA SIZE======");
		
		List<WebElement> data_size = driver.findElements(By.tagName("td"));
		
		int dsize = data_size.size();
		
		System.out.println("Total Data Size :"+dsize);
		
		// following
		
		WebElement follow = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[5]"));
		
		System.out.println("Follow(next) data :"+follow.getText());
		
		driver.close();
		
	}

}
