package com.vetan.mool.TestCases;
  
import org.junit.Assert; 
import org.testng.annotations.Test;
import com.vetan.mool.PageObjects.LoginPage;



public class TC_LoginFlow_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException
	{ 
		
		driver.get(baseURL);
		
		logger.info("Url is opened");
		
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		
		lp.settxtUsername(userName);
		Thread.sleep(2000);
 
		lp.clickbtnContinue();
		Thread.sleep(2000);
		
		lp.settxtPassword(password);
		Thread.sleep(2000);
		
		lp.clickbtnSignin();
		Thread.sleep(2000);
		
		if(driver.getTitle().contains("Mool Innovation Labs"))
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
