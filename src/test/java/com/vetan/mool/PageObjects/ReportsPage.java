package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	
WebDriver ldriver;
	
	public ReportsPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Reports
	@FindBy(xpath= "//*[@id=\"root\"]/section/aside/div/div/div[1]/div[2]/div[1]/ul/li[4]/span")
	WebElement btnnavReports;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/aside/div/div/div[2]/div[2]/ul/li[1]/span/a")
	WebElement btnReports;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[1]/div/p[1]")
	WebElement btnSalaryRegister;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[1]/div/div[2]/div/input")
	WebElement btnCalender;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]")
	WebElement btnJune;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[1]/div/div[3]/a")
	WebElement btnDownloadCsv;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[2]/div/p[1]")
	WebElement btnTaxDeduction;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[3]/div/p[1]")
	WebElement btnPfRegister;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[4]/div/p[1]")
	WebElement btnProfessionalTax;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[5]/div/p[1]")
	WebElement btnBankAdvice;
	
	@FindBy(xpath ="//*[@id=\"root\"]/section/section/div/main/a[6]/div/p[1]")
	WebElement btnSalary;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[7]/div/p[1]")
	WebElement btnMonthlyCtc;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[8]/div/p[1]")
	WebElement btnYearlyCtc;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[9]/div/p[1]")
	WebElement btnYtdEarning;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[10]/div/p[1]")
	WebElement btnStatutoryBonus;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[11]/div/p[1]")
	WebElement btnReimburshment;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/a[12]/div/p[1]")
	WebElement btnArrearBonuses;
	
	
	//Compliance Report
	@FindBy(xpath = "//*[@id=\"root\"]/section/aside/div/div/div[2]/div[2]/ul/li[2]")
	WebElement btnComplianceReport;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[2]/div/div/div/div/input")
	WebElement btnComplianceCalender;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/div")
	WebElement btnComplianceJune;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[2]/div/button/div")
	WebElement btnUpdatereport;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[1]/div[2]/a[2]")
	WebElement btnAllEmpPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[1]/div[2]/a[1]")
	WebElement btnAllEmpXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[2]/div[2]/a[2]")
	WebElement btnEmpDataBasePdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[2]/div[2]/a[1]")
	WebElement btnEmpDataBaseXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[3]/div[2]/a[2]")
	WebElement btnWagesregisterPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[3]/div[2]/a[1]")
	WebElement btnWagesregisterXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[4]/div[2]/a")
	WebElement btnWagesRegisterType2Pdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[5]/div[2]/a[2]")
	WebElement btnFinesPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[5]/div[2]/a[1]")
	WebElement btnFinesXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[6]/div[2]/a[2]")
	WebElement btnOverTimePdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[6]/div[2]/a[1]")
	WebElement btnOverTimeXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[7]/div[2]/a[2]")
	WebElement btnBonusPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[7]/div[2]/a[1]")
	WebElement btnBonusXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[8]/div[2]/a[2]")
	WebElement btnAccidentPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[8]/div[2]/a[1]")
	WebElement btnAccidentXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[8]/div[2]/a[1]")
	WebElement btnEsicContributionPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[9]/div[2]/a[1]")
	WebElement btnEsicContributionXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[10]/div[2]/a[2]")
	WebElement btnPfContributionPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[10]/div[2]/a[1]")
	WebElement btnPfContributionXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[11]/div[2]/a[2]")
	WebElement btnPfRegisterSalaryPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[11]/div[2]/a[1]")
	WebElement btnPfRegisterSalaryXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[12]/div[2]/a[2]")
	WebElement btnWorkmanRegisterPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[12]/div[2]/a[1]")
	WebElement btnWorkmanRegisterXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[13]/div[2]/a[2]")
	WebElement btnWorkmanRegisterType2Pdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[13]/div[2]/a[1]")
	WebElement btnWorkmanRegisterType2Xlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[14]/div[2]/a[2]")
	WebElement btnPayslipSummaryPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[14]/div[2]/a[1]")
	WebElement btnPayslipSummaryXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[15]/div[2]/a")
	WebElement btnAllEmployeeCardPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[16]/div[2]/a")
	WebElement btnEmployeesWagesCardPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[17]/div[2]/a[2]")
	WebElement btnmusterRollPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[17]/div[2]/a[1]")
	WebElement btnMusterRollXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[18]/div[2]/a[2]")
	WebElement btnFormTPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[18]/div[2]/a[1]")
	WebElement btnFormTXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[19]/div[2]/a[2]")
	WebElement btnFormDPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[19]/div[2]/a[1]")
	WebElement btnFormDXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[20]/div[2]/a[2]")
	WebElement btnESICContributionSheetPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[20]/div[2]/a[1]")
	WebElement btnESICContributionSheetXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[21]/div[2]/a[2]")
	WebElement btnPFMonthlyContributionWthAccountWisePdf;
	
	@FindBy(xpath= "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[21]/div[2]/a[1]")
	WebElement btnPFMonthlyContributionWthAccountWiseXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[22]/div[2]/a[2]")
	WebElement btnPFMonthlyContributionSheetPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[22]/div[2]/a[1]")
	WebElement btnPFMonthlyContributionSheetXlsx;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[23]/div[2]/a[2]")
	WebElement btnPFAnnualSummaryPdf;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[3]/div[1]/div[23]/div[2]/a[1]")
	WebElement btnPFAnnualSummaryXlsx;

	
	//Custom Reports
	@FindBy(xpath = "//*[@id=\"root\"]/section/aside/div/div/div[2]/div[2]/ul/li[3]/span/a")
	WebElement btnCustomReport;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[1]/button")
	WebElement btnAddCustomReport;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[1]/input")
	WebElement txtCusReportName;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[3]/div/div/div[1]/label/span[1]/input")
	WebElement btnCusEmployeeId;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/button")
	WebElement btncusCreate;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[2]/div/div[5]/div[1]")
	WebElement tabcus100;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[2]/div/div[4]/div[2]/button/div")
	WebElement btnDelete;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[1]/div/div[1]/div/input")
	WebElement btnCustomReportCalender;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/div")
	WebElement btnCustomReportJune;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div[1]/div/div[2]/a")
	WebElement btnCustomReportDownloadCsv;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div/div[2]/button[2]/div/div")
	WebElement btnConfirmDelete;
	
	
	
		
	
	//Reports
	public void clickbtnnavReports()
	{
		btnnavReports.click();
	}
	
	public void clickbtnReports()
	{
		btnReports.click();
	}
	
	public void clickbtnSalaryRegister()
	{
		btnSalaryRegister.click();
	}
	
	public void clickbtnCalender()
	{
		btnCalender.click();
	}
	
	public void clickbtnJune()
	{
		btnJune.click();
	}
	
	public void clickbtnDownloadCsv()
	{
		btnDownloadCsv.click();
	}
	
	public void clickbtnTaxDeduction()
	{
		btnTaxDeduction.click();
	}
	
	public void clickbtnPfRegister()
	{
		btnPfRegister.click();
	}
	
	public void clickbtnProfessionalTax()
	{
		btnProfessionalTax.click();
	}
	
	public void clickbtnBankAdvice()
	{
		btnBankAdvice.click();
	}
	
	public void clickbtnSalary()
	{
		btnSalary.click();
	}
	
	public void clickbtnMonthlyCtc()
	{
		btnMonthlyCtc.click();
	}
	
	public void clickbtnYearlyCtc()
	{
		btnYearlyCtc.click();
	}
	
	public void clickbtnYtdEarning()
	{
		btnYtdEarning.click();
	}
	
	public void clickbtnStatutoryBonus()
	{
		btnStatutoryBonus.click();
	}
	
	public void clickbtnReimburshment()
	{
		btnReimburshment.click();
	}
	
	public void clickbtnArrearBonuses()
	{
		btnArrearBonuses.click();
	}
	
	
	//Compliance Report
	public void clickbtnComplianceReport()
	{
		btnComplianceReport.click();
	}
	
	public void clickbtnUpdatereport()
	{
		btnUpdatereport.click();
	}
	
	public void clickbtnComplianceCalender()
	{
		btnComplianceCalender.click();
	}
	
	public void clickbtnComplianceJune()
	{
		btnComplianceJune.click();
	}
	
	public void clickbtnAllEmpPdf()
	{
		btnAllEmpPdf.click();
	}
	
	public void clickbtnAllEmpXlsx()
	{
		btnAllEmpXlsx.click();
	}
	
	public void clickbtnEmpDataBasePdf()
	{
		btnEmpDataBasePdf.click();
	}
	
	public void clickbtnEmpDataBaseXlsx()
	{
		btnEmpDataBaseXlsx.click();
	}
	
	public void clickbtnWagesregisterPdf()
	{
		btnWagesregisterPdf.click();
	}
	
	public void clickbtnWagesregisterXlsx()
	{
		btnWagesregisterXlsx.click();
	}
	
	public void clickbtnWagesRegisterType2Pdf()
	{
		btnWagesRegisterType2Pdf.click();
	}
	
	public void clickbtnFinesPdf()
	{
		btnFinesPdf.click();
	}
	
	public void clickbtnFinesXlsx()
	{
		btnFinesXlsx.click();
	}
	
	public void clickbtnOverTimePdf()
	{
		btnOverTimePdf.click();
	}
	
	public void clickbtnOverTimeXlsx()
	{
		btnOverTimeXlsx.click();
	}
	
	public void clickbtnBonusPdf()
	{
		btnBonusPdf.click();
	}
	
	public void clickbtnBonusXlsx()
	{
		btnBonusXlsx.click();
	}
	
	public void clickbtnAccidentPdf()
	{
		btnAccidentPdf.click();
	}
	
	public void clickbtnAccidentXlsx()
	{
		btnAccidentXlsx.click();
	}
	
	public void clickbtnEsicContributionPdf()
	{
		btnEsicContributionPdf.click();
	}
	
	public void clickbtnEsicContributionXlsx()
	{
		btnEsicContributionXlsx.click();
	}
	
	public void clickbtnPfContributionPdf()
	{
		btnPfContributionPdf.click();
	}
	
	public void clickbtnPfContributionXlsx()
	{
		btnPfContributionXlsx.click();
	}
	
	public void clickbtnPfRegisterSalaryPdf()
	{
		btnPfRegisterSalaryPdf.click();
	}
	
	public void clickbtnPfRegisterSalaryXlsx()
	{
		btnPfRegisterSalaryXlsx.click();
	}
	
	public void clickbtnWorkmanRegisterPdf()
	{
		btnWorkmanRegisterPdf.click();
	}
	
	public void clickbtnWorkmanRegisterXlsx()
	{
		btnWorkmanRegisterXlsx.click();
	}
	
	public void clickbtnWorkmanRegisterType2Pdf()
	{
		btnWorkmanRegisterType2Pdf.click();
	}
	
	public void clickbtnWorkmanRegisterType2Xlsx()
	{
		btnWorkmanRegisterType2Xlsx.click();
	}
	
	public void clickbtnPayslipSummaryPdf()
	{
		btnPayslipSummaryPdf.click();
	}
	
	public void clickbtnPayslipSummaryXlsx()
	{
		btnPayslipSummaryXlsx.click();
	}
	
	public void clickbtnAllEmployeeCardPdf()
	{
		btnAllEmployeeCardPdf.click();
	}
	
	public void clickbtnEmployeesWagesCardPdf()
	{
		btnEmployeesWagesCardPdf.click();	
	}
	
	public void clickbtnmusterRollPdf()
	{
		btnmusterRollPdf.click();
	}
	
	public void clickbtnMusterRollXlsx()
	{
		btnMusterRollXlsx.click();
	}
	
	public void clickbtnFormTPdf()
	{
		btnFormTPdf.click();
	}
	
	public void clickbtnFormTXlsx()
	{
		btnFormTXlsx.click();
	}
	
	public void clickbtnFormDPdf()
	{
		btnFormDPdf.click();
	}
	
	public void clickbtnFormDXlsx()
	{
		btnFormDXlsx.click();
	}
	
	public void clickbtnESICContributionSheetPdf()
	{
		btnESICContributionSheetPdf.click();
	}
	
	public void clickbtnESICContributionSheetXlsx()
	{
		btnESICContributionSheetXlsx.click();
	}
	
	public void clickbtnPFMonthlyContributionWthAccountWisePdf()
	{
		btnPFMonthlyContributionWthAccountWisePdf.click();
	}
	
	public void clickbtnPFMonthlyContributionWthAccountWiseXlsx()
	{
		btnPFMonthlyContributionWthAccountWiseXlsx.click();
	}
	
	public void clickbtnPFMonthlyContributionSheetPdf()
	{
		btnPFMonthlyContributionSheetPdf.click();
	}
	
	public void clickbtnPFMonthlyContributionSheetXlsx()
	{
		btnPFMonthlyContributionSheetXlsx.click();
	}
	
	public void clickbtnPFAnnualSummaryPdf()
	{
		btnPFAnnualSummaryPdf.click();
	}
	
	public void clickbtnPFAnnualSummaryXlsx()
	{
		btnPFAnnualSummaryXlsx.click();
	}
	
	
	//Custom report
	
	public void clickbtnCustomReport()
	{
		btnCustomReport.click();
	}
	
	public void clickbtnAddCustomReport()
	{
		btnAddCustomReport.click();
	}
	
	public void settxtCusReportName(String cusName)
	{
		txtCusReportName.sendKeys(cusName);
	}
	
	public void clickbtncusCreate()
	{
		btncusCreate.click();
	}
	
	public void clicktabcus100()
	{
		tabcus100.click();
	}
	
	public void clickbtnDelete()
	{
		btnDelete.click();
	}
	
	public void clickbtnCustomReportCalender()
	{
		btnCustomReportCalender.click();
	}
	
	public void clickbtnCustomReportJune()
	{
		btnCustomReportJune.click();
	}
	
	public void clickbtnCustomReportDownloadCsv()
	{
		btnCustomReportDownloadCsv.click();
	}
	
	public void clickbtnConfirmDelete()
	{
		btnConfirmDelete.click();
	}
}
