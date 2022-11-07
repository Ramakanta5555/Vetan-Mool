package com.vetan.mool.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.PayRollPage;

public class TC_PayRollProcess_001 extends BaseClass{
	
	@Test
	public void PayRollProess() throws InterruptedException, IOException
	{	
		driver.get(vetanURL);
		driver.manage().window().maximize();
		
		
		BaseClass BC = new BaseClass();
		
		PayRollPage pp = new PayRollPage(BaseClass.driver);
		Thread.sleep(2000);

		//Login

		BC.login();
		Thread.sleep(5000);

		//PayRollProcess
		
		pp.clickbtnPayroll();
		Thread.sleep(4000);
		
//	 	JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1500)");
		
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
