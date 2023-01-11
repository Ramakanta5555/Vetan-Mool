package com.vetan.mool.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.ToolCalculatorPage;

public class TC_ToolCalculator_001 extends BaseClass {
	
	@Test
	public void ToolCalculatorTest() throws InterruptedException, IOException
	{
		
		
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		ToolCalculatorPage tp = new ToolCalculatorPage(BaseClass.driver);
		Thread.sleep(2000);
		
		//Login
		
		login();
		Thread.sleep(4000);
		
		//Calculator
		
		tp.clickbtnTools();
		Thread.sleep(2000);

		tp.clickbtnCtcCalculator();
		Thread.sleep(2000);

		tp.settxtExpectingAmount("70000");
		Thread.sleep(2000);

		tp.clickbtnMetroYes();
		Thread.sleep(2000);

		tp.settxtRentAmount("8000");
		Thread.sleep(2000);

		tp.settxtVariablePercentage("0");
		Thread.sleep(2000);

		tp.clickbtnAllowance();
		Thread.sleep(2000);

		tp.cleartxtFoodAllowance();
		Thread.sleep(2000);

		tp.settxtFoodAllowance("2000");
		Thread.sleep(2000);

		tp.cleartxtMobileAllowance();
		Thread.sleep(2000);

		tp.settxtMobileAllowances("1000");
		Thread.sleep(2000);

		tp.cleartxtTelephoneAllowance();
		Thread.sleep(2000);

		tp.settxtTelephoneAllowance("1000");
		Thread.sleep(2000);

		tp.cleartxtDearnessAllowance();
		Thread.sleep(2000);

		tp.settxtDearnessAllowance("1500");
		Thread.sleep(2000);

		tp.cleartxtLtaAllowance();
		Thread.sleep(2000);

		tp.settxtLtaAllowance("2000");
		Thread.sleep(2000);

		tp.clickbtnDeclarations();
		Thread.sleep(2000);

		tp.clickbtn80C();
		Thread.sleep(2000);

		tp.settxtInvestment("60000");
		Thread.sleep(2000);

		tp.settxtContriToPension("50000");
		Thread.sleep(2000);

		tp.clickbtn80D();
		Thread.sleep(2000);

		tp.settxtMedicalInsurance("20000");
		Thread.sleep(2000);

		scrollDown();
		Thread.sleep(2000);

		tp.clickbtnForDisabled();
		Thread.sleep(2000);

		tp.settxtDisabledDependentDeduction("15000");
		Thread.sleep(2000);

		tp.settxtDisability1("10000");
		Thread.sleep(2000);

		tp.settxtDisability2("10000");
		Thread.sleep(2000);

		tp.clickbtnOtherSections();
		Thread.sleep(2000);

		tp.settxtEducationLoan("90000");
		Thread.sleep(2000);

		tp.settxtHomeLoanInterest("50000");
		Thread.sleep(2000);

		tp.settxtInterestOnSavingsAccount("10000");
		Thread.sleep(2000);

		tp.settxtDonationToCharitableOrganisation("50000");
		Thread.sleep(2000);

		tp.settxtEmployerContributionInNPS("4000");
		Thread.sleep(2000);

		tp.clickbtnCalculateData();
		Thread.sleep(20000);

		scrollDown();
		Thread.sleep(2000);

		capturescreen(driver, "ToolCalculatorTest");
		Thread.sleep(2000);

		
		if(driver.getPageSource().contains("Breakdown"))
		{
			System.out.println("Calculator test Passed");
		}
		else
		{
			System.out.println("Calculator test Failed");
		}
	}
}
