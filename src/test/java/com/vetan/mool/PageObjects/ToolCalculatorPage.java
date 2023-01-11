package com.vetan.mool.PageObjects;


import org.openqa.selenium.Keys;
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
	
	

	@FindBy(xpath = "(//span[@class='ant-menu-title-content'])[7]")
	@CacheLookup
	WebElement btnTools;

	public void clickbtnTools()
	{
		btnTools.click();
	}

	@FindBy(xpath = "(//a[@class='menu-content'])[1]")
	@CacheLookup
	WebElement btnCalculator;

	public void clickbtnCalculator()
	{
		btnCalculator.click();
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-true'])[1]")
	@CacheLookup
	WebElement btnCtcCalculator;

	public void clickbtnCtcCalculator()
	{
		btnCtcCalculator.click();
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[1]")
	@CacheLookup
	WebElement txtExpectingAmount;

	public void settxtExpectingAmount(String expectingamount)
	{
		txtExpectingAmount.sendKeys(expectingamount);
	}

	@FindBy(xpath = "(//input[@value='true'])[1]")
	@CacheLookup
	WebElement btnMetroYes;

	public void clickbtnMetroYes()
	{
		btnMetroYes.click();
	}

	@FindBy(xpath = "(//input[@value='false'])[1]")
	@CacheLookup
	WebElement btnMetroNo;

	public void clickbtnMetroNo()
	{
		btnMetroNo.click();
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[4]")
	@CacheLookup
	WebElement txtRentAmount;

	public void settxtRentAmount(String ramount)
	{
		txtRentAmount.sendKeys(ramount);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[5]")
	@CacheLookup
	WebElement txtVariablePercentage;

	public void settxtVariablePercentage(String vpercentage)
	{
		txtVariablePercentage.sendKeys(vpercentage);
	}

	@FindBy(xpath = "(//*[name()='svg'])[8]")
	@CacheLookup
	WebElement btnAllowance;

	public void clickbtnAllowance()
	{
		btnAllowance.click();
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement btncheckboxAllowMoolEng;

	public void clickbtncheckboxAllowMoolEng()
	{
		btncheckboxAllowMoolEng.click();
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[1]")
	@CacheLookup
	WebElement txtFoodAllowance;

	public void cleartxtFoodAllowance()
	{
		txtFoodAllowance.sendKeys(Keys.COMMAND+"a",Keys.DELETE);
	}

	public void settxtFoodAllowance(String fallowance)
	{	
		txtFoodAllowance.sendKeys(fallowance);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[2]")
	@CacheLookup
	WebElement txtMobileAllowance;

	public void cleartxtMobileAllowance()
	{
		txtMobileAllowance.sendKeys(Keys.COMMAND+"a",Keys.DELETE);
	}

	public void settxtMobileAllowances(String mallowance)
	{
		txtMobileAllowance.sendKeys(mallowance);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[3]")
	@CacheLookup
	WebElement txtTelephoneAllowance;

	public void cleartxtTelephoneAllowance()
	{
		txtTelephoneAllowance.sendKeys(Keys.COMMAND+"a",Keys.DELETE);
	}

	public void settxtTelephoneAllowance(String tallowance)
	{
		txtTelephoneAllowance.sendKeys(tallowance);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[4]")
	@CacheLookup
	WebElement txtDearnessAllowance;

	public void cleartxtDearnessAllowance()
	{
		txtDearnessAllowance.sendKeys(Keys.COMMAND+"a",Keys.DELETE);
	}

	public void settxtDearnessAllowance(String dallowance)
	{
		txtDearnessAllowance.sendKeys(dallowance);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[5]")
	@CacheLookup
	WebElement txtLtaAllowance;

	public void cleartxtLtaAllowance()
	{
		txtLtaAllowance.sendKeys(Keys.COMMAND+"a",Keys.DELETE);
	}

	public void settxtLtaAllowance(String lallowance)
	{
		txtLtaAllowance.sendKeys(lallowance);
	}

	@FindBy(xpath = "(//*[name()='svg'])[19]")
	@CacheLookup
	WebElement btnDeclarations;

	public void clickbtnDeclarations()
	{
		btnDeclarations.click();
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	@CacheLookup
	WebElement btncheckboxDeclMoolEng;

	public void clickbtncheckboxDeclMoolEng()
	{
		btncheckboxDeclMoolEng.click();
	}

	@FindBy(xpath = "(//*[name()='svg'])[20]")
	@CacheLookup
	WebElement btn80C;

	public void clickbtn80C()
	{
		btn80C.click();
	}

	@FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
	@CacheLookup
	WebElement txtInvestment;

	public void settxtInvestment(String Investment)
	{
		txtInvestment.sendKeys(Investment);
	}

	@FindBy(xpath = "(//input[@placeholder='Amount'])[2]")
	@CacheLookup
	WebElement txtContriToPension;

	public void settxtContriToPension(String pension)
	{
		txtContriToPension.sendKeys(pension);
	}

	@FindBy(xpath = "(//*[name()='svg'])[26]")
	@CacheLookup
	WebElement btn80D;

	public void clickbtn80D()
	{
		btn80D.click();
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[6]")
	@CacheLookup
	WebElement txtMedicalInsurance;

	public void settxtMedicalInsurance(String MedicalInsurance)
	{
		txtMedicalInsurance.sendKeys(MedicalInsurance);
	}

	@FindBy(xpath = "(//*[name()='svg'])[30]")
	@CacheLookup
	WebElement btnForDisabled;

	public void clickbtnForDisabled()
	{
		btnForDisabled.click();
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[7]")
	@CacheLookup
	WebElement txtDisabledDependentDeduction;

	public void settxtDisabledDependentDeduction(String DisabledDependentDeduction)
	{
		txtDisabledDependentDeduction.sendKeys(DisabledDependentDeduction);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[8]")
	@CacheLookup
	WebElement txtDisability1;

	public void settxtDisability1(String Disability1)
	{
		txtDisability1.sendKeys(Disability1);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[9]")
	@CacheLookup
	WebElement txtDisability2;

	public void settxtDisability2(String Disability2)
	{
		txtDisability2.sendKeys(Disability2);
	}

	@FindBy(xpath = "(//*[name()='svg'])[38]")
	@CacheLookup
	WebElement btnOtherSections;

	public void clickbtnOtherSections()
	{
		btnOtherSections.click();
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[10]")
	@CacheLookup
	WebElement txtEducationLoan;

	public void settxtEducationLoan(String EducationLoan)
	{
		txtEducationLoan.sendKeys(EducationLoan);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[11]")
	@CacheLookup
	WebElement txtHomeLoanInterest;

	public void settxtHomeLoanInterest(String HomeLoanInterest)
	{
		txtHomeLoanInterest.sendKeys(HomeLoanInterest);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[12]")
	@CacheLookup
	WebElement txtInterestOnSavingsAccount;

	public void settxtInterestOnSavingsAccount(String InterestOnSavingsAccount)
	{
		txtInterestOnSavingsAccount.sendKeys(InterestOnSavingsAccount);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[13]")
	@CacheLookup
	WebElement txtDonationToCharitableOrganisation;

	public void settxtDonationToCharitableOrganisation(String DonationToCharitableOrganisation)
	{
		txtDonationToCharitableOrganisation.sendKeys(DonationToCharitableOrganisation);
	}

	@FindBy(xpath = "(//input[@placeholder='INR'])[14]")
	@CacheLookup
	WebElement txtEmployerContributionInNPS;

	public void settxtEmployerContributionInNPS(String EmployerContributionInNPS)
	{
		txtEmployerContributionInNPS.sendKeys(EmployerContributionInNPS);
	}

	@FindBy(xpath = "(//div[contains(text(),'Calculate Data')])[1]")
	@CacheLookup
	WebElement btnCalculateData;

	public void clickbtnCalculateData()
	{
		btnCalculateData.click();
	}

	@FindBy(xpath = "h(//div[contains(text(),'Clear all fields')])[1]")
	@CacheLookup
	WebElement btnClearAllFields;

	public void clickbtnClearAllFields()
	{
		btnClearAllFields.click();
	}





	

}
