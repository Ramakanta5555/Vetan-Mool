package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolCalculatorPage {
WebDriver ldriver;
	
	public ToolCalculatorPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	

	@FindBy(xpath = "(//img[@alt='Tools'])[1]")
	WebElement btnTool;
	
	public void clickbtnTool()
	{
		btnTool.click();
	}
	
	@FindBy(xpath = "(//a[@class='menu-content'])[1]")
	WebElement btnTabCalculator;
	
	public void clickbtnTabCalculator()
	{
		btnTabCalculator.click();
	}
	
	@FindBy(xpath = "(//input[@value='true'])[1]")
	WebElement btnCtcCalculator;
	
	public void clickbtnCtcCalculator()
	{
		btnCtcCalculator.click();
	}
	
	@FindBy(xpath = "(//input[@value='false'])[1]")
	WebElement btnOptimalPayStructure;
	
	public void clickbtnOptimalPayStructure()
	{
		btnOptimalPayStructure.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder='Enter employer CTC'])[1]")
	WebElement txtEmployeeInhandExpectation;
	
	public void settxtEmployeeInhandExpectation(String iExp)
	{
		txtEmployeeInhandExpectation.sendKeys(iExp);
	}
	
	@FindBy(xpath = "(//input[@value='true'])[2]")
	WebElement btnMetroYes;
	
	public void clickbtnMetroYes()
	{
		btnMetroYes.click();
	}
	
	@FindBy(xpath = "(//input[@value='false'])[2]")
	WebElement btnMetroNo;
	
	public void clickbtnMetroNo()
	{
		btnMetroNo.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder='House Rent'])[1]")
	WebElement txtActualRentPaid;
	
	public void settxtActualRentPaid(String aRent)
	{
		txtActualRentPaid.sendKeys(aRent);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Variable Perentage'])[1]")
	WebElement txtVariablePercentage;
	
	public void settxtVaribalePercentage(String vPer)
	{
		txtVariablePercentage.sendKeys(vPer);
	}
	
	@FindBy(xpath = "(//input[@value='5000'])[1]")
	WebElement txtFoodAllowance;
	
	public void settxtFoodAllowance(String fAllownace)
	{
		txtFoodAllowance.sendKeys(fAllownace);
	}
	
	@FindBy(xpath = "(//input[@role='spinbutton'])[5]")
	WebElement txtMobileAllowance;
	
	public void settxtMobileAllowance(String mAllowance)
	{
		txtMobileAllowance.sendKeys(mAllowance);
	}
	
	@FindBy(xpath = "(//input[@value='500'])[1]")
	WebElement txtDearnessAllowance;
	
	public void settxtDearnessAllowance(String dAllowance)
	{
		txtDearnessAllowance.sendKeys(dAllowance);
	}
	
	@FindBy(xpath = "(//input[@value='1000'])[1]")
	WebElement txtOvertimeAllowance;
	
	public void settxtOvertimeAllowance(String oAllowance)
	{
		txtOvertimeAllowance.sendKeys(oAllowance);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[2]/div/div[5]/div[2]/div/div[2]/input")
	WebElement txtLtaAllowance;
	
	public void settxtLtaAllowance(String lAllowance)
	{
		txtLtaAllowance.sendKeys(lAllowance);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/input")
	WebElement txtInvestment;
	
	public void settxtInvestment(String iDecla)
	{
		txtInvestment.sendKeys(iDecla);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[2]/div[2]/div/div[2]/input")
	WebElement txtMedicalnsurance;
	
	public void settxtMedicalInsurance(String mDecla)
	{
		txtMedicalnsurance.sendKeys(mDecla);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div/div[2]/input")
	WebElement txtEducationLoan;
	
	public void settxtEducationLoan(String eDecla)
	{
		txtEducationLoan.sendKeys(eDecla);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div/div[2]/input")
	WebElement txtHomeLoanIntrest;
	
	public void settxtHomeLoanIntrest(String hDecla)
	{
		txtHomeLoanIntrest.sendKeys(hDecla);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[5]/div[2]/div/div[2]/input")
	WebElement txtIntrestOnSavingAccont;
	
	public void settxtIntrestOnSavingAccont(String iDecla)
	{
		txtIntrestOnSavingAccont.sendKeys(iDecla);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[6]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txtDonationToCharitableOrganisation;
	
	public void settxtDonationToCharitableOrganisation(String cOrg)
	{
		txtDonationToCharitableOrganisation.sendKeys(cOrg);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[7]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txtContributionToPensionPlanAnnuityFund;
	
	public void settxtContributionToPensionPlanAnnuityFund(String cPen)
	{
		txtContributionToPensionPlanAnnuityFund.sendKeys(cPen);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[8]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txtEmployerContributionInNps;
	
	public void settxtEmployerContributionInNps(String nps)
	{
		txtEmployerContributionInNps.sendKeys(nps);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[9]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txtDisabledDependentDeduction;
	
	public void settxtDisabledDependentDeduction(String dDep)
	{
		txtDisabledDependentDeduction.sendKeys(dDep);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[10]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txtDisabilityU;
	
	public void settxtDisabilityU(String dIsability)
	{
		txtDisabilityU.sendKeys(dIsability);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div[2]/div[3]/div/div/div[11]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement txtDisabilityDDB;
	
	public void settxtDisabilityDDB(String DDB)
	{
		txtDisabilityDDB.sendKeys(DDB);
	}
	
	
	
	@FindBy(xpath = "(//div[contains(text(),'Calculate')])[1]")
	WebElement btnCalculate;
	
	public void clickbtnCalculate()
	{
		btnCalculate.click();
	}
}
