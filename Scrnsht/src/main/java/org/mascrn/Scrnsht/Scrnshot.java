package org.mascrn.Scrnsht;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrnshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Scrnsht\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("C:\\Users\\User\\eclipse-workspace\\Scrnsht\\Scrnshott\\test.png");
		FileUtils.copyFile(sourcefile, destinationfile);
		
		WebElement iframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframe.click();		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		
		
		WebElement box = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		box.sendKeys("divya");*/
		WebElement alerttextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));		
		Actions ac=new Actions(driver);
		ac.moveToElement(alerttextbox).click().build().perform();
		WebElement clickthebtn = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		clickthebtn.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("dp");
		Thread.sleep(3000);
		alert.accept();
		
		
		
		
	}

}
