package com.vetan.mool.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.SingleEmployeeCreatePage;

public class TC_SingleEmployeeCreate_001 extends BaseClass{
	
	@Test
	public void SingleEmployeeCreateTest() throws InterruptedException, IOException
	{
		
		
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		SingleEmployeeCreatePage sep = new SingleEmployeeCreatePage(BaseClass.driver);
		Thread.sleep(2000);
		 
		login();
		Thread.sleep(4000);
		
		sep.clickEmployeeImage();
		Thread.sleep(2000);
		
		sep.clickAdd();
		Thread.sleep(4000);
		
		sep.clickSingleUser();
		Thread.sleep(2000);
		
		String pan = randomPanalpha()+randomPannumeric()+"Z";
		sep.setPan(pan);
		Thread.sleep(2000);
		
		String phone = randomPhone();
		sep.setPhone(phone);
		Thread.sleep(2000);
		
		String Email = randomEmail()+"@yahoo.com";
		sep.setEmail(Email);
		Thread.sleep(2000);
		
		String Name = randomFName()+ " " + randomLName();
		sep.setName(Name);
		Thread.sleep(2000);
		
		String EmpId = randomEmpid();
		sep.setEmpid(EmpId);
		Thread.sleep(2000);
		
		sep.clickDOB();
		Thread.sleep(2000);
		
		sep.clickYear();
		Thread.sleep(2000);
		
		sep.clickBackward();
		Thread.sleep(2000);
		
		sep.clickBackward();
		Thread.sleep(2000);
		
		sep.click2001();
		Thread.sleep(2000);
		
		sep.clickMonth();
		Thread.sleep(2000);
		
		sep.click08Date();
		Thread.sleep(2000);
		
		sep.clickNext();
		Thread.sleep(5000);
		
		String Ctc = randomCtc();
		sep.setCtc(Ctc);
		Thread.sleep(2000);
		
		sep.clickfieldEmpCont();
		Thread.sleep(2000);
		
		sep.clickYesCtc();
		Thread.sleep(2000);
		
		sep.clickfieldOptPf();
		Thread.sleep(2000);
		
		sep.clickYesPf();
		Thread.sleep(2000);
		
		sep.setVpercnt("0");
		Thread.sleep(1000);
		
		sep.clickfieldGroup();
		Thread.sleep(2000);
		
		sep.clickGeneral();
		Thread.sleep(2000);
		
		sep.clickfieldDept();
		Thread.sleep(2000);
		
		sep.clickDept1();
		Thread.sleep(2000);
		
		sep.clickfieldDesgn();
		Thread.sleep(2000);
		
		sep.clickD1();
		Thread.sleep(2000);
		
		sep.clickfieldLocation();
		Thread.sleep(2000);
		
		sep.clickHo();
		Thread.sleep(2000);
		
		sep.clickSubmit();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("Successfully created the employee"))
		{
			Assert.assertTrue(true);
			System.out.println("Passed");
		}
		else
		{
			Assert.assertTrue(false);
			capturescreen(driver, "SingleEmployeeCreateTest");
			System.out.println("Failed");
		}
		
	}	
	
}
