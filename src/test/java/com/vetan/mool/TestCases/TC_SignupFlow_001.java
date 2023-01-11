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

		sp.settxtOrgName("Test Automation");
		Thread.sleep(2000);

		sp.settxtGSTIN("02AABCU9393R1ZZ");
		Thread.sleep(2000);

		sp.settxtEmail(randomEmail()+"@yahoo.com");
		Thread.sleep(2000);

		sp.settxtPOC("Trishna parida");
		Thread.sleep(2000);

		sp.settxtDesignation("HR");
		Thread.sleep(2000);
		
		sp.settxtPhoneNumber(randomPhone());
		Thread.sleep(2000);

		sp.clickbtnTermsConditionCheckbox();
		Thread.sleep(2000);

		sp.clickbtnRegisterNow();
		Thread.sleep(5000);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		sp.clickbtnMonthlyPlan();
		Thread.sleep(2000);

		sp.clickbtnStaterPlan();
		Thread.sleep(2000);

		sp.clickbtnChangePlan();
		Thread.sleep(2000);
		
		sp.clickbtnStandardPlan();
		Thread.sleep(2000);

		sp.clickbtnChangePlan();
		Thread.sleep(2000);

		sp.clickbtnQuarterlyPlan();
		Thread.sleep(2000);

		sp.clickbtnStaterPlan();
		Thread.sleep(2000);

		sp.clickbtnChangePlan();
		Thread.sleep(2000);

		sp.clickbtnStandardPlan();
		Thread.sleep(2000);

		sp.clickbtnChangePlan();
		Thread.sleep(2000);

		sp.clickbtnYearlyPlan();
		Thread.sleep(2000);

		sp.clickbtnStaterPlan();
		Thread.sleep(2000);

		sp.clickbtnChangePlan();
		Thread.sleep(2000);

		sp.clickbtnStandardPlan();
		Thread.sleep(2000);

		sp.settxtEmployeeCount("20");
		Thread.sleep(2000);

		sp.setxtAddressLine1("Bangalore");
		Thread.sleep(2000);

		sp.settxtAddressLine2("Bangalore");
		Thread.sleep(2000);

		sp.settxtState("Karnataka");
		Thread.sleep(2000);

		sp.settxtCity("Bangalore");
		Thread.sleep(2000);

		sp.settxtPincode("560100");
		Thread.sleep(2000);

		sp.clickbtnMakePayment();
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
