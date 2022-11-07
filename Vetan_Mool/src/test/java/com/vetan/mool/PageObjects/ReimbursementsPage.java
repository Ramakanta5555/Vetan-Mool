package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReimbursementsPage {
	
WebDriver ldriver;
	
	public ReimbursementsPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
}
