package com.vetan.mool.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.SignupPage;

public class TC_SignupFlow_001 extends BaseClass{
	
	@Test
	public void SignupTest() throws InterruptedException, IOException
	{
		driver.manage().window().maximize();
		
		SignupPage sp = new SignupPage(BaseClass.driver);
		Thread.sleep(2000);
		
		sp.clickbtnNewOrgCreateAccount();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("We’re getting things ready for you…"))
		{
			Assert.assertTrue(true);
			System.out.println("Signup Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			capturescreen(driver,"SignupoFlow");
			System.out.println("Signup Test Failed");
		}
		
		
		

		
		
	}

}
