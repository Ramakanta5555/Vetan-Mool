package com.vetan.mool.PageObjects;

import org.checkerframework.checker.units.qual.Acceleration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayoutsPage {
    
    WebDriver ldriver;
    public PayoutsPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "(//img[@alt='Payout'])[1]")
    @CacheLookup
    WebElement btnPayout;

    public void clickbtnPayout()
    {
        btnPayout.click();
    }

    @FindBy(xpath = "(//a[@href='/org/payout/beneficiary'])[1]")
    @CacheLookup
    WebElement btnBeneficiary;

    public void clickbtnBeneficiary()
    {
        btnBeneficiary.click();
    }

    @FindBy(xpath = "(//a[@href='/org/payout/test_payouts'])[1]")
    @CacheLookup
    WebElement btnTestPayout;

    public void clickbtnTestPayout()
    {
        btnTestPayout.click();
    }

    @FindBy(xpath = "(//a[@href='/org/payout/transactions'])[1]")
    @CacheLookup
    WebElement btnTransactionHistory;

    public void clickbtnTransactionHistory()
    {
        btnTransactionHistory.click();
    }
}
