package com.vetan.mool.TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.LandingPageCalculatorPage;
import com.vetan.mool.Utilities.xlutils;

public class TC_LandingPageCalculator_001 extends BaseClass{

    @Test
    public void LandingPageCalculator() throws InterruptedException
    {
        driver.get(landingPageURL);

        logger.info("Url is opened");
		
		driver.manage().window().maximize();

        LandingPageCalculatorPage LPCP = new LandingPageCalculatorPage(BaseClass.driver);
        Thread.sleep(2000);

        BaseClass BC = new BaseClass();
        Thread.sleep(2000);

        //LandingPageCalculator

        LPCP.clickbtnCalculator();
        Thread.sleep(2000);

        LPCP.settxtFullName("Ramakanta");
        Thread.sleep(2000);

        LPCP.settxtEmail("ramakanta.samal@moolfinace.com");
        Thread.sleep(2000);

        LPCP.settxtGrossSalary("60000");
        Thread.sleep(2000);

        LPCP.settxtNetPay("53000");
        Thread.sleep(2000);

        LPCP.settxtHRA("8000");
        Thread.sleep(2000);

        LPCP.setxtTotalTDS("1000");
        Thread.sleep(2000);

        LPCP.settxtEmployeePF("1800");
        Thread.sleep(2000);

        LPCP.clickbtnEnableRentedHouse();
        Thread.sleep(2000);
        
        LPCP.clickbtnEnableRentedHouse();
        Thread.sleep(2000);

        LPCP.clickbtnEnableMerocity();
        Thread.sleep(2000);

        LPCP.settxtActualRentPaid("9000");
        Thread.sleep(2000);

        LPCP.clickbtnAllowancesDropdown();
        Thread.sleep(2000);

        LPCP.clickbtnFoodAllowances();
        Thread.sleep(2000);

        LPCP.settxtFoodAllowancesAmount("2500");
        Thread.sleep(2000);

        LPCP.clickbtnAddFoodAllowance();
        Thread.sleep(2000);

        LPCP.clickbtnDearnessAllowancesDropdown();
        Thread.sleep(2000);

        LPCP.clickbtnDearnessAllowance();
        Thread.sleep(2000);

        LPCP.settxtDearnessAllowancesAmount("1000");
        Thread.sleep(2000);

        LPCP.clickbtnAddDearnessAllowance();
        Thread.sleep(2000);

        BC.scrollDown();
        Thread.sleep(2000);

        LPCP.clickbtnEnableItDeclaration();
        Thread.sleep(2000);

        LPCP.settxtInvestment80C("100000");
        Thread.sleep(2000);

        LPCP.settxtMedicalInsurance80D("50000");
        Thread.sleep(2000);

        LPCP.settxtEducationLoan80E("200000");
        Thread.sleep(2000);

        LPCP.settxtHomeLoanInterest80EE("5000");
        Thread.sleep(2000);

        LPCP.settxtInterestOnSavingsAccount80TTA("10000");
        Thread.sleep(2000);

        LPCP.settxtDonationToCharitableOrganisation80G("10000");
        Thread.sleep(2000);

        LPCP.settxtContributionToPensionPlanAnnuityFund80CCC("2000");
        Thread.sleep(2000);

        LPCP.settxtEmployeeContributionToNPS80CCD1B("50000");
        Thread.sleep(2000);

        LPCP.settxtDisabledDependentDeduction80DD("10000"); 
        Thread.sleep(2000);

        LPCP.settxtDisability80U("10000");
        Thread.sleep(2000);

        LPCP.settxtDisability80DDB("10000");
        Thread.sleep(2000);

        LPCP.clickbtnCheckNow();
        Thread.sleep(10000);

        WebElement a = driver.findElement(By.xpath("//h2[contains(text(),'Your result has been sent to your mail. Please che')]"));
        
        if(a!= null && driver.getTitle().equals("Mool Finance")) 
        {
            Assert.assertTrue(true);
            logger.info("Landing Page Calculator Test Passed"); 
        }
        else
        {
            Assert.assertTrue(false);
            logger.info("Landing Page Calculator Test Failed");
        }
        
    }
}
