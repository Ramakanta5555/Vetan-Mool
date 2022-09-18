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
		 
		sp.settxtOrgName("Automated Test Org");
		Thread.sleep(2000);
		
		String pan = randomPanalpha()+randomPannumeric()+"Z";
		sp.settxtOrgPan(pan);
		Thread.sleep(2000);
		
		String Email = randomEmail()+"@yahoo.com";
		sp.settxtOrgEmail(Email);
		Thread.sleep(2000);
		
		String Name = randomFName()+ " " + randomLName();
		sp.settxtOrgPocName(Name);
		Thread.sleep(2000);
		
		sp.settxtOrgDesignation("HR Head");
		Thread.sleep(2000);
		
		String phone = randomPhone();
		sp.settxtOrgPhone(phone);
		Thread.sleep(2000);
		
		sp.clickbtnAcceptTerm();
		Thread.sleep(2000);
		
		sp.clickbtnCreateAccount();
		Thread.sleep(10000);
		
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
