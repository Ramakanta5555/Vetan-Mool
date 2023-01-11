package com.vetan.mool.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.OrganisationProfilePage;

public class TC_OrganisationProflePage_001 extends BaseClass{
	
	@Test
	public void OrgProfileTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		OrganisationProfilePage op = new OrganisationProfilePage(BaseClass.driver);
		Thread.sleep(2000);
		
		//login
		
		login();
		Thread.sleep(4000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		op.clickbtnProfileImage();
		Thread.sleep(2000);
		
		op.clickbtnProfile();
		Thread.sleep(2000);
		
		op.clickbtnEdit();
		Thread.sleep(2000);
		
		op.cleartxtOrgName();
		Thread.sleep(2000);
		
		op.settxtOrgName("Test_Org");
		Thread.sleep(2000);
		
		op.cleartxtOrgDisplayName();
		Thread.sleep(2000);
		
		op.settxtOrgDisplayName("CEO");
		Thread.sleep(2000);
		
		op.cleartxtOrgCode();
		Thread.sleep(2000);
		
		op.settxtOrgCode("123456");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		op.cleartxtPocName();
		Thread.sleep(2000);
		
		op.settxtPocName("Manohar Das");
		Thread.sleep(2000);
		
		op.cleartxtPocDesignation();
		Thread.sleep(2000);
		
		op.settxtPocDesignation("CTO");
		Thread.sleep(2000);
		
		op.cleartxtOrgAddress();
		Thread.sleep(2000);
		
		op.settxtOrgAddress("124/114");
		Thread.sleep(2000);
		
		op.cleartxtOrgLandMark();
		Thread.sleep(2000);
		
		op.settxtOrgLandMark("SBI");
		Thread.sleep(2000);
		
		op.cleartxtOrgCity();
		Thread.sleep(2000);
		
		op.settxtOrgCity("Banglore");
		Thread.sleep(2000);
		
		op.cleartxtOrgState();
		Thread.sleep(2000);
		
		op.settxtOrgState("Karnataka");
		Thread.sleep(2000);
		
		op.cleartxtOrgCountry();
		Thread.sleep(2000);
		
		op.settxtOrgCountry("India");
		Thread.sleep(2000);
		
		op.cleartxtOrgPin();
		Thread.sleep(2000);
		
		op.settxtOrgPin("560100");
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("Test_Org"))
		{
			System.out.println("Org Profile Page Test Passed");
		}
		else
		{
			System.out.println("Org Profile Page Test Failed");
		}		
		
	}
}
