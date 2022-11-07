package com.vetan.mool.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.ToolCalculatorPage;

public class TC_ToolCalculator_001 extends BaseClass {
	
	@Test
	public void ToolCalculatorTest() throws InterruptedException
	{
		
		
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		ToolCalculatorPage tp = new ToolCalculatorPage(BaseClass.driver);
		Thread.sleep(2000);
		
		//Login
		
		lp.settxtUsername(userName);
		
		lp.clickbtnContinue();
		Thread.sleep(2000);
		
		lp.settxtPassword(password);
		Thread.sleep(2000);
		
		lp.clickbtnSignin();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//Calculator
		
		tp.clickbtnTool();
		Thread.sleep(2000);
		
		tp.clickbtnTabCalculator();
		Thread.sleep(2000);
		
		tp.clickbtnCtcCalculator();
		Thread.sleep(2000);
		
		tp.settxtEmployeeInhandExpectation("80000");
		Thread.sleep(2000);
		
		tp.clickbtnMetroYes();
		Thread.sleep(2000);
		
		tp.settxtActualRentPaid("12000");
		Thread.sleep(2000);
		
		tp.settxtVaribalePercentage("0");
		Thread.sleep(2000);
		
//		tp.settxtFoodAllowance("2000");
//		Thread.sleep(2000);
		
//		tp.settxtMobileAllowance("1000");
//		Thread.sleep(2000);
//		
//		tp.settxtDearnessAllowance("1500");
//		Thread.sleep(2000);
//		
//		tp.settxtOvertimeAllowance("2000");
//		Thread.sleep(2000);
//		
		tp.settxtLtaAllowance("10000");
		Thread.sleep(3000);
		
		tp.settxtInvestment("100000");
		Thread.sleep(2000);
		
		tp.settxtMedicalInsurance("40000");
		Thread.sleep(2000);
		
		tp.settxtEducationLoan("100000");
		Thread.sleep(2000);
		
		tp.settxtHomeLoanIntrest("200000");
		Thread.sleep(2000);
		
		tp.settxtIntrestOnSavingAccont("20000");
		Thread.sleep(2000);
		
		tp.settxtDonationToCharitableOrganisation("50000");
		Thread.sleep(2000);
		
		tp.settxtContributionToPensionPlanAnnuityFund("25000");
		Thread.sleep(2000);
		
		tp.settxtEmployerContributionInNps("5000");
		Thread.sleep(2000);
		
		tp.settxtDisabledDependentDeduction("10000");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		System.out.println("scrolled");
		
		
		tp.settxtDisabilityU("8000");
		Thread.sleep(2000);
		
		tp.settxtDisabilityDDB("15000");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);
		
		tp.clickbtnCalculate();
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
