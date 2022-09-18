package com.vetan.mool.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


		public class Logintest {
	
		WebDriver driver = null;
		
		@BeforeTest
		public void setup()
		{
			String projectPath = System.getProperty("user.dir");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
		}
		
		
		@Test
		public void loginTest() throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver");
		
		
		driver.get("https://vetan.moolfinance.com");
		Thread.sleep(2000);
		
		WebElement uName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div/div/label/input"));
		uName.sendKeys("PERCE1111N");
		Thread.sleep(2000);
		
		
		WebElement cBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div/div/button/span"));
		cBtn.click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		
		
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.close();
		}
	
		}
