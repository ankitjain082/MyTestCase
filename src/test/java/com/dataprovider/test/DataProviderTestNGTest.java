package com.dataprovider.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProviderTestNGTest {

	public static String driverPath = "C:/chromedriver/";
	public static WebDriver driver;

	
@BeforeTest
	public void server() {
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
@AfterMethod
public void clearCache(){
	String webURL=driver.getCurrentUrl();
	System.out.println("Current URl is" + webURL);
}
	
	@Test
	public void openURL() throws InterruptedException{
		driver.get("https://www.google.com");
		WebElement sEarchTextBox= driver.findElement(By.id("lst-ib"));
		sEarchTextBox.sendKeys("wiki" + "\n");
		Thread.sleep(3000);
		Assert.assertTrue(sEarchTextBox.isDisplayed());
		
	}
	
	@AfterTest
	public void cLosebrowser(){
		driver.close();
	}
}
