package com.vetan.mool.TestCases;
  

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC_LoginFlow_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException
	{ 
		
		driver.get(vetanURL);
		
		logger.info("Url is opened");
		
		driver.manage().window().maximize();

		BaseClass BC = new BaseClass();
		Thread.sleep(2000);

		BC.login();
		Thread.sleep(2000);

		System.out.println(driver.getTitle());	
		
		if(driver.getTitle().contains("Organization | Dashboard"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Login Test Passed");
			logger.info("Login Test Failed");
		}
		
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
