package com.vetan.mool.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.PageObjects.ReportsPage;

public class TC_Reports_001 extends BaseClass{
	
	@Test
	public void reportsTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		ReportsPage rp = new ReportsPage(BaseClass.driver);
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		//Login
		lp.settxtUsername(userName);

		lp.clickbtnContinue();
		Thread.sleep(2000);
		
		lp.settxtPassword(password);
		Thread.sleep(2000);
		
		lp.clickbtnSignin();
		Thread.sleep(2000);
				
		System.out.println(driver.getTitle());
		
		rp.clickbtnnavReports();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0, 1500)");
		Thread.sleep(2000);
		
		jse.executeScript("window.scroll(0, -1500)");
		Thread.sleep(2000);
		
		//Salary Register
		rp.clickbtnSalaryRegister();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Tax Deduction
		rp.clickbtnTaxDeduction();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//PF Register
		rp.clickbtnPfRegister();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Professional Tax
		rp.clickbtnProfessionalTax();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Bank Advice
		rp.clickbtnBankAdvice();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Salary
		rp.clickbtnSalary();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		jse.executeScript("window.scroll(0, 600)");
		Thread.sleep(2000);
		
		//Monthly CTC
		rp.clickbtnMonthlyCtc();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Yearly CTC
		rp.clickbtnYearlyCtc();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//YTD Earnings
		rp.clickbtnYtdEarning();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Statutory Bonus
		rp.clickbtnStatutoryBonus();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		//Arrear&Bonuses
		rp.clickbtnArrearBonuses();
		Thread.sleep(2000);
		
		rp.clickbtnCalender();
		Thread.sleep(2000);
		
		rp.clickbtnJune();
		Thread.sleep(5000);
		
		rp.clickbtnDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnReports();
		Thread.sleep(2000);
		
		System.out.println("Reports Section run Successfully");
		
		
		
		//Compliance report
		rp.clickbtnComplianceReport();
		Thread.sleep(2000);
		
		rp.clickbtnComplianceCalender();
		Thread.sleep(2000);
		
		rp.clickbtnComplianceJune();
		Thread.sleep(2000);
		
		rp.clickbtnUpdatereport();
		Thread.sleep(15000);
		
		rp.clickbtnAllEmpPdf();
		Thread.sleep(2000);
		
		rp.clickbtnAllEmpXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnEmpDataBasePdf();
		Thread.sleep(2000);
		
		rp.clickbtnEmpDataBaseXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnWagesregisterPdf();
		Thread.sleep(2000);
		
		rp.clickbtnWagesregisterXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnWagesRegisterType2Pdf();
		Thread.sleep(2000);
		
		rp.clickbtnFinesPdf();
		Thread.sleep(2000);
		
		rp.clickbtnFinesXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnOverTimePdf();
		Thread.sleep(2000);
		
		rp.clickbtnOverTimeXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnBonusPdf();
		Thread.sleep(2000);
		
		rp.clickbtnBonusXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnAccidentPdf();
		Thread.sleep(2000);
		
		rp.clickbtnAccidentXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnEsicContributionPdf();
		Thread.sleep(2000);
		
		rp.clickbtnEsicContributionXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnPfContributionPdf();
		Thread.sleep(2000);
		
		rp.clickbtnPfContributionXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnPfRegisterSalaryPdf();
		Thread.sleep(2000);
		
		rp.clickbtnPfRegisterSalaryXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnWorkmanRegisterPdf();
		Thread.sleep(2000);
		
		rp.clickbtnWorkmanRegisterXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnWorkmanRegisterType2Pdf();
		Thread.sleep(2000);
		
		rp.clickbtnWorkmanRegisterType2Xlsx();
		Thread.sleep(2000);
		
		rp.clickbtnPayslipSummaryPdf();
		Thread.sleep(2000);
		
		rp.clickbtnPayslipSummaryXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnAllEmployeeCardPdf();
		Thread.sleep(2000);
		
		rp.clickbtnEmployeesWagesCardPdf();
		Thread.sleep(2000);
		
		rp.clickbtnmusterRollPdf();
		Thread.sleep(2000);
		
		rp.clickbtnMusterRollXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnFormTPdf();
		Thread.sleep(2000);
		
		rp.clickbtnFormTXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnFormDPdf();
		Thread.sleep(2000);
		
		rp.clickbtnFormDXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnESICContributionSheetPdf();
		Thread.sleep(2000);
		
		rp.clickbtnESICContributionSheetXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnPFMonthlyContributionWthAccountWisePdf();
		Thread.sleep(2000);
		
		rp.clickbtnPFMonthlyContributionWthAccountWiseXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnPFMonthlyContributionSheetPdf();
		Thread.sleep(2000);
		
		rp.clickbtnPFMonthlyContributionSheetXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnPFAnnualSummaryPdf();
		Thread.sleep(2000);
		
		rp.clickbtnPFAnnualSummaryXlsx();
		Thread.sleep(2000);
		
		rp.clickbtnnavReports();
		Thread.sleep(2000);
		
		System.out.println("Compliance reports Test Passes");
		
		
		//Custom Report
		rp.clickbtnCustomReport();
		Thread.sleep(5000);
		
		rp.clickbtnAddCustomReport();
		Thread.sleep(2000);
		
		rp.settxtCusReportName("cus100");
		Thread.sleep(2000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of check boxes are:"+checkboxes.size());
		Thread.sleep(2000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(2000);
		
		rp.clickbtncusCreate();
		Thread.sleep(2000);
		
		if (driver.getPageSource().contains("cus100")) {
			 System.out.println("Custom report Created");
		 }else{
			 System.out.println("Error");
		 }
		
		rp.clicktabcus100();
		Thread.sleep(2000);
		
		rp.clickbtnCustomReportCalender();
		Thread.sleep(2000);
		
		rp.clickbtnCustomReportJune();
		Thread.sleep(5000);
		
		rp.clickbtnCustomReportDownloadCsv();
		Thread.sleep(2000);
		
		rp.clickbtnCustomReport();
		Thread.sleep(2000);
		
		rp.clickbtnDelete();
		Thread.sleep(2000);
		
		rp.clickbtnConfirmDelete();
		Thread.sleep(2000);
		
		System.out.println("Custom Report Pass");	
		
		
		
	}
}
