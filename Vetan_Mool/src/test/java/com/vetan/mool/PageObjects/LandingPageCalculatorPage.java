package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPageCalculatorPage {

    WebDriver ldriver;
    
    public LandingPageCalculatorPage (WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//li[normalize-space()='Calculator'])[1]")
    @CacheLookup
    WebElement btnCalculator;

    public void clickbtnCalculator()
	{
		btnCalculator.click();
	}

    @FindBy(xpath = "(//input[@placeholder='Your Full Name'])[1]")
    @CacheLookup
    WebElement txtFullName;

    public void settxtFullName(String fullName)
    {
        txtFullName.sendKeys(fullName);
    }

    @FindBy(xpath = "(//input[@placeholder='Your Email Address'])[1]")
    @CacheLookup
    WebElement txtEmail;

    public void settxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    @FindBy(xpath = "(//input[@placeholder='Your Monthly Gross'])[1]")
    @CacheLookup
    WebElement txtGrossSalary;

    public void settxtGrossSalary(String grossSalary)
    {
        txtGrossSalary.sendKeys(grossSalary);
    }

    @FindBy(xpath = "(//input[@placeholder='For ex: Netpay =15,000 INR'])[1]")
    @CacheLookup
    WebElement txtNetpay;

    public void settxtNetPay(String netPay)
    {
        txtNetpay.sendKeys(netPay);
    }

    @FindBy(xpath = "(//input[@placeholder='House Rent Allowance'])[1]")
    @CacheLookup
    WebElement txtHRA;

    public void settxtHRA(String hra)
    {
        txtHRA.sendKeys(hra);
    }

    @FindBy(xpath = "(//input[@placeholder='Total TDS Contribution'])[1]")
    @CacheLookup
    WebElement txtTotalTDS;

    public void setxtTotalTDS(String totalTDS)
    {
        txtTotalTDS.sendKeys(totalTDS);
    }

    @FindBy(xpath = "(//input[@placeholder='Employee PF Contribution'])[1]")
    @CacheLookup
    WebElement txtEmployeePF;

    public void settxtEmployeePF(String employeePF)
    {
        txtEmployeePF.sendKeys(employeePF);
    }

    // rented Yes/No
    @FindBy(xpath = "(//input[@value='true'])[1]")
    @CacheLookup
    WebElement btnEnableRentedHouse;

    public void clickbtnEnableRentedHouse()
    {
        btnEnableRentedHouse.click();
    }

    //metrocity Yes/No
    @FindBy(xpath = "(//input[@value='true'])[2]")
    @CacheLookup
    WebElement btnEnableMerocity;

    public void clickbtnEnableMerocity()
    {
        btnEnableMerocity.click();
    }

    @FindBy(xpath = "(//input[@placeholder='Rent you pay per month'])[1]")
    @CacheLookup
    WebElement txtActualRentPaid;

    public void settxtActualRentPaid(String actualRentPaid)
    {
        txtActualRentPaid.sendKeys(actualRentPaid);
    }

    @FindBy(xpath = "(//span[@title='- Select an allowance - '])[1]")
    @CacheLookup
    WebElement btnAllowancesDropdown;

    public void clickbtnAllowancesDropdown()
    {
        btnAllowancesDropdown.click();
    }

    @FindBy(xpath = "(//div[contains(text(),'Food')])[1]")
    @CacheLookup
    WebElement btnFoodAllowance;

    public void clickbtnFoodAllowances()
    {
        btnFoodAllowance.click();
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    @CacheLookup
    WebElement txtFoodAllowancesAmount;

    public void settxtFoodAllowancesAmount(String foodAllowancesAmount)
    {
        txtFoodAllowancesAmount.sendKeys(foodAllowancesAmount);
    }

    @FindBy(xpath = "(//span[normalize-space()='Add'])[1]")
    @CacheLookup
    WebElement btnAddFoodAllowance;

    public void clickbtnAddFoodAllowance()
    {
        btnAddFoodAllowance.click();
    }

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
    @CacheLookup
    WebElement btnDearnessAllowancesDropdown;

    public void clickbtnDearnessAllowancesDropdown()
    {
        btnDearnessAllowancesDropdown.click();
    }
    @FindBy(xpath = "(//div[contains(text(),'Dearness')])[1]")
    @CacheLookup
    WebElement btnDearnessAllowance;

    public void clickbtnDearnessAllowance()
    {
        btnDearnessAllowance.click();
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    @CacheLookup
    WebElement txtDearnessAllowancesAmount;

    public void settxtDearnessAllowancesAmount(String dearnessAllowancesAmount)
    {
        txtDearnessAllowancesAmount.sendKeys(dearnessAllowancesAmount);
    }

    @FindBy(xpath = "(//span[normalize-space()='Add'])[1]")
    @CacheLookup
    WebElement btnAddDearnessAllowance;

    public void clickbtnAddDearnessAllowance()
    {
        btnAddDearnessAllowance.click();
    }

    @FindBy(xpath = "(//input[@value='true'])[3]")
    @CacheLookup
    WebElement btnEnableItDeclaration;

    public void clickbtnEnableItDeclaration()
    {
        btnEnableItDeclaration.click();
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[4]")
    @CacheLookup
    WebElement txtInvestment80C;

    public void settxtInvestment80C(String txtInvestmentC)
    {
        txtInvestment80C.sendKeys(txtInvestmentC);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[5]")
    @CacheLookup
    WebElement txtMedicalInsurance80D;

    public void settxtMedicalInsurance80D(String txtMedicalInsuranceD)
    {
        txtMedicalInsurance80D.sendKeys(txtMedicalInsuranceD);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[6]")
    @CacheLookup
    WebElement txtEducationLoan80E;

    public void settxtEducationLoan80E(String txtEducationLoanE)
    {
        txtEducationLoan80E.sendKeys(txtEducationLoanE);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[7]")
    @CacheLookup
    WebElement txtHomeLoanInterest80EE;

    public void settxtHomeLoanInterest80EE(String txtHomeLoanInterestEE)
    {
        txtHomeLoanInterest80EE.sendKeys(txtHomeLoanInterestEE);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[8]")
    @CacheLookup
    WebElement txtInterestOnSavingsAccount80TTA;

    public void settxtInterestOnSavingsAccount80TTA(String txtInterestOnSavingsAccountTTA)
    {
        txtInterestOnSavingsAccount80TTA.sendKeys(txtInterestOnSavingsAccountTTA);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[9]")
    @CacheLookup
    WebElement txtDonationToCharitableOrganisation80G;

    public void settxtDonationToCharitableOrganisation80G(String txtDonationToCharitableOrganisationG)
    {
        txtDonationToCharitableOrganisation80G.sendKeys(txtDonationToCharitableOrganisationG);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[10]")
    @CacheLookup
    WebElement txtContributionToPensionPlanAnnuityFund80CCC;

    public void settxtContributionToPensionPlanAnnuityFund80CCC(String txtContributionToPensionPlanAnnuityFundCCC)
    {
        txtContributionToPensionPlanAnnuityFund80CCC.sendKeys(txtContributionToPensionPlanAnnuityFundCCC);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[11]")
    @CacheLookup
    WebElement txtEmployeeContributionToNPS80CCD1B;

    public void settxtEmployeeContributionToNPS80CCD1B(String txtEmployeeContributionToNPSCCDB)
    {
        txtEmployeeContributionToNPS80CCD1B.sendKeys(txtEmployeeContributionToNPSCCDB);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[12]")
    @CacheLookup
    WebElement txtDisabledDependentDeduction80DD;

    public void settxtDisabledDependentDeduction80DD(String txtDisabledDependentDeductionDD)
    {
        txtDisabledDependentDeduction80DD.sendKeys(txtDisabledDependentDeductionDD);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[13]")
    @CacheLookup
    WebElement txtDisability80U;

    public void settxtDisability80U(String txtDisabilityU)
    {
        txtDisability80U.sendKeys(txtDisabilityU);
    }

    @FindBy(xpath = "(//input[@placeholder='Amount'])[14]")
    @CacheLookup
    WebElement txtDisability80DDB;

    public void settxtDisability80DDB(String txtDisabilityDDB)
    {
        txtDisability80DDB.sendKeys(txtDisabilityDDB);
    }

    @FindBy(xpath = "(//button[@class='btn'])[1]")
    @CacheLookup
    WebElement btnCheckNow;

    public void clickbtnCheckNow()
    {
        btnCheckNow.click();
    }

   
    @FindBy(xpath = "(//h2[contains(text(),'Your result has been sent to your mail. Please che')])[1]")
    @CacheLookup
    WebElement VerifyEmailText;

    public void verifyEmailText()
    {
        VerifyEmailText.isDisplayed();
    }

    


}
