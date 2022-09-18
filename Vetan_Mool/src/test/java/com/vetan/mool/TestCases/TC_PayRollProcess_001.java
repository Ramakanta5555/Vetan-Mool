package com.vetan.mool.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.PayRollPage;

public class TC_PayRollProcess_001 extends BaseClass{
	
	@Test
	public void PayRollProess() throws InterruptedException, IOException
	{
		driver.manage().window().maximize();
		
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		PayRollPage pp = new PayRollPage(BaseClass.driver);
		Thread.sleep(2000);
		
		lp.settxtUsername(userName);

		lp.clickbtnContinue();
		Thread.sleep(2000);
		
		lp.settxtPassword(password);
		Thread.sleep(2000);
		
		lp.clickbtnSignin();
		Thread.sleep(2000);
				
		System.out.println(driver.getTitle());
		
		pp.clickbtnPayroll();
		Thread.sleep(2000);
		
		pp.clickbtnPayrolljune();
		Thread.sleep(5000);
		
		pp.clickbtnRunPayRoll();
		Thread.sleep(2000);
		
		pp.clickbtnCheckBox();
		Thread.sleep(2000);
		
		pp.clickbtnRunPayRoll1();
		Thread.sleep(20000);
		
		pp.clickbtnDownloadcsv();
		Thread.sleep(2000);
		
		pp.clickbtn2ndpage();
		Thread.sleep(2000);
		
		System.out.println("Done");
		
		
		
	}
}
