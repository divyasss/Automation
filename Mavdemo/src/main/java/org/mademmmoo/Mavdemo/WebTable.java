package org.mademmmoo.Mavdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
        
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Mavdemo\\Driver\\chromedriver.exe");
		  WebDriver driver;
	        driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		System.out.println("===All Data===");
		 List<WebElement> allData=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr/td"));
		for(WebElement data:allData) {
			String text = data.getText();
			System.out.println(text);
		}
		
	}

}
