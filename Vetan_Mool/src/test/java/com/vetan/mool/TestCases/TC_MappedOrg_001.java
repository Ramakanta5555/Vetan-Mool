package com.vetan.mool.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.MappedOrgPage;

public class TC_MappedOrg_001 extends BaseClass{
	
	@Test
	public void mappedOrganisationTest() throws InterruptedException, IOException
	{
		driver.manage().window().maximize();
		
		MappedOrgPage mp = new MappedOrgPage(BaseClass.driver);
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		lp.settxtUsername(userName);

		lp.clickbtnContinue();
		Thread.sleep(2000);
		
		lp.settxtPassword(password);
		Thread.sleep(2000);
		
		lp.clickbtnSignin();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0, 1500);");
		Thread.sleep(2000);
		jse.executeScript("window.scroll(0, -1500);");
		Thread.sleep(5000);
		
		if(driver.getTitle().equals("Mool Innovation Labs"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			capturescreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
		
		mp.clickbtnMappedOrg();
		Thread.sleep(2000);
		
		mp.clickbtnCreateOrg();
		Thread.sleep(2000);
		
		mp.clicktxtUsername();
		Thread.sleep(1000);
		
		jse.executeScript("window.scroll(0, 1500);");
		Thread.sleep(2000);
		jse.executeScript("window.scroll(0, -1500);");
		Thread.sleep(5000);
		
		String uname = randomUserName();
		mp.settxtUsername(uname);
		Thread.sleep(2000);
		
		String phone = randomPhone();
		mp.settxtPhoneNumber(phone);
		Thread.sleep(2000);
		
		String email = randomEmail()+"@yahoo.com";
		mp.settxtEmail(email);
		Thread.sleep(5000);
		
		mp.settxtPass(password);
		Thread.sleep(2000);
		
		mp.clickbtnEyePass();
		
		mp.settxtCPass(password);
		Thread.sleep(2000);
		
		mp.clickbtnCEyePass();
		Thread.sleep(2000);
		
		jse.executeScript("window.scroll(0, 2500);");
		Thread.sleep(5000);
		System.out.println("scrolled");
		
		
		String Clegalname = randomOrgname()+ "pvt"+ "ltd";
		mp.settxtClegalName(Clegalname);
		
		mp.settxtOrgName(Clegalname);
		Thread.sleep(5000);
		
		String pocName = randomFName() + randomLName();
		mp.settxtPoc(pocName);
		Thread.sleep(2000);
		
		jse.executeScript("window.scroll(0, -1500)");
		
		mp.settxtDesignation("abc");
		Thread.sleep(2000);
		
		mp.goDown();
		Thread.sleep(5000);
		
		mp.clickbtnCreateOrg1();
		
		
	}	
}
