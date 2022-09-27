package com.vetan.mool.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeProfilePage {
	
	WebDriver ldriver;
	
	public EmployeeProfilePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//img[@alt='Employees'])[1]")
	@CacheLookup
	WebElement btnEmployee;
	
	public void clickbtnEmployee() 
	{
		btnEmployee.click();
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/main/div/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[11]/div/div/div/img")
	@CacheLookup
	WebElement btnEmployeeOptionBtn;
	
	public void clickbtnEmployeeOptionBtn()
	{
		btnEmployeeOptionBtn.click();
	}
	
	
	
	//Update Pay Structure
	@FindBy(xpath = "(//span[normalize-space()='Update Pay Structure'])[1]")
	@CacheLookup
	WebElement btnUpdatePayStucture;
	
	public void clickbtnUpdatePayStructure()
	{
		btnUpdatePayStucture.click(); 
	}
	 
	@FindBy(xpath = "(//input[@value='40'])[1]")
	@CacheLookup
	WebElement txtPerBasic;
	
	public void clicktxtPerBasic()
	{
		txtPerBasic.click();
	}
	
	public void cleartxtPerBasic()
	{
		txtPerBasic.sendKeys(Keys.COMMAND + "a");
		txtPerBasic.sendKeys(Keys.BACK_SPACE);
	}
	
	public void settxtPerBasic(String pCtc)
	{ 
		txtPerBasic.sendKeys(pCtc);
	}
	
	@FindBy(xpath = "(//input[@value='15'])[1]")
	@CacheLookup
	WebElement txtPerHra;
	
	public void cleartxtPerHra()
	{
		txtPerBasic.sendKeys(Keys.CONTROL,"a");
		txtPerHra.sendKeys(Keys.DELETE);
	}
	
	public void settxtPerHra(String pHra)
	{
		txtPerHra.sendKeys(pHra);
	}
	
	@FindBy(xpath = "(//input[@value='15'])[2]")
	@CacheLookup
	WebElement txtFoodPMonth;
	
	public void cleartxtFoodPMonth()
	{
		txtFoodPMonth.clear();
	}
	
	public void settxtFoodPMonth(String fMonth)
	{
		txtFoodPMonth.sendKeys(fMonth);
	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[18]")
	@CacheLookup
	WebElement btnFoodAmountCheckBox;
	
	public void clickbtnFoodAmountCheckBox()
	{
		btnFoodAmountCheckBox.click();
	}
	
	@FindBy(xpath = "(//input[@value='0'])[1]")
	@CacheLookup
	WebElement txtMobilePMonth;
	
	public void cleartxtMobilePMonth()
	{
		txtMobilePMonth.clear();
	}
	
	public void settxtMobilePMonth(String mMonth)
	{
		txtMobilePMonth.sendKeys(mMonth);
	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[19]")
	@CacheLookup
	WebElement btnMobileAmountCheckBox;
	
	public void clickbtnMobileAmountCheckBox()
	{
		btnMobileAmountCheckBox.click();
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Update')])[1]")
	@CacheLookup
	WebElement btnSubmitPayStructure;
	
	public void clickbtnSubmitPayStructure()
	{
		btnSubmitPayStructure.click();
	}
	

	//Edit Credentials
	
	@FindBy(xpath = "(//button[contains(@class,'button-lib button-type-12')])[2]")
	@CacheLookup
	WebElement btnEditCredentials;
	
	public void clickbtnEditCredentials()
	{
		btnEditCredentials.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder='Employee PAN Number'])[1]")
	@CacheLookup
	WebElement txtECPan;
	
	public void cleartxtECPan()
	{
		txtECPan.sendKeys(Keys.BACK_SPACE);
	}
	
	public void settxtECPan(String eCpan)
	{
		txtECPan.sendKeys(eCpan);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Employee 10 Digit Phone Number'])[1]")
	@CacheLookup
	WebElement txtECPhone;
	
	public void cleartxtECPhone()
	{
		txtECPhone.sendKeys(Keys.BACK_SPACE);
	}
	
	public void settxtECPhone(String eCphone)
	{
		txtECPhone.sendKeys(eCphone);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Employee Email'])[1]")
	@CacheLookup
	WebElement txtECEmail;
	
	public void cleartxtECEmail()
	{
		txtECEmail.sendKeys(Keys.BACK_SPACE);
	}
	
	public void settxttxtECEmail(String eCemail)
	{
		txtECEmail.sendKeys(eCemail);
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Update')])[1]")
	@CacheLookup
	WebElement btnECUpdate;
	
	public void clickbtnECUpdate()
	{
		btnECUpdate.click();
	}
	
	//Change Password
	
	@FindBy(xpath = "(//div[contains(text(),'Change Password')])[1]")
	@CacheLookup
	WebElement btnChangePassword;
	
	public void clickbtnChangePassword()
	{
		btnChangePassword.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder='Employee Password'])[1]")
	@CacheLookup
	WebElement txtPassword;
	
	public void settxtPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	
	@FindBy(xpath = "(//*[name()='path'])[3]")				
	@CacheLookup
	WebElement btnEyeBtn;
	
	public void clickbtnEyeBtn()
	{
		btnEyeBtn.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder='Employee Confirm Password'])[1]")
	@CacheLookup
	WebElement txtConfirmPassword;
	
	public void settxtConfirmPassword(String cpass)
	{
		txtConfirmPassword.sendKeys(cpass);
	}
	
	@FindBy(xpath = "(//*[name()='svg'])[4]")
	@CacheLookup
	WebElement btnEyeBtn1;
	
	public void clickbtnEyeBtn1()
	{
		btnEyeBtn1.click();
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Update'])[1]")
	@CacheLookup
	WebElement btnPassSubmit;
	
	public void clickbtnPassSubmit()
	{
		btnPassSubmit.click();	
	}
	
	
	//View
	
	@FindBy(xpath = "(//div[contains(text(),'View')])[1]")
	@CacheLookup
	WebElement btnView;
	
	public void clickbtnView()
	{
		btnView.click();
	}
	
	@FindBy(xpath = "(//img[@alt='pri-icon'])[2]")
	@CacheLookup
	WebElement btnPersonalInfoEdit;
	
	public void clickbtnPersonalInfoEdit()
	{
		btnPersonalInfoEdit.click();
	}
	
	@FindBy(xpath = "(//input[@name='phoneNumber'])[1]")
	@CacheLookup
	WebElement txtPhoneNumber;
	
	public void cleartxtPhoneNumber()
	{
		txtPhoneNumber.clear();
	}
	
	public void settxtPhoneNumber(String pNumber)
	{
		txtPhoneNumber.sendKeys(pNumber);
	}
	
	@FindBy(xpath = "(//input[@title='2022-09-09'])[1]")
	@CacheLookup
	WebElement btnDateOfBirth;
	
	public void clickbtnDAteOfBirth()
	{
		btnDateOfBirth.click();
	}
	
	@FindBy(xpath = "(//button[normalize-space()='2022'])[1]")
	@CacheLookup
	WebElement btnCalYear;
	
	public void clickbtnCalYear()
	{
		btnCalYear.click();
	}
	
	@FindBy(xpath = "(//span[@class='ant-picker-super-prev-icon'])[1]")
	@CacheLookup
	WebElement btnCalBackward;
	
	public void clickbtnCalBackward()
	{
		btnCalBackward.click();
	}
	
	@FindBy(xpath = "(//div[normalize-space()='1990'])[1]")
	@CacheLookup
	WebElement btnCal1990;
	
	public void clickbtnCal1990()
	{
		btnCal1990.click();
	}
	
	@FindBy(xpath = "(//div[normalize-space()='Mar'])[1]")
	@CacheLookup
	WebElement btnCalMarch;
	
	public void clickbtnCalMarch()
	{
		btnCalMarch.click();
	}
	
	
	@FindBy(xpath = "//td[contains(@title,'1990-03-05')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='5']")
	@CacheLookup
	WebElement btnCal05;
	
	public void clickbtnCal05()
	{
		btnCal05.click();
	}
	
	@FindBy(xpath = "(//span[@title='Male'])[1]")
	@CacheLookup
	WebElement btnGender;
	
	public void clickbtnGender()
	{
		btnGender.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Male')])[1]")
	@CacheLookup
	WebElement btnMaleGender;
	
	public void clickbtnMaleGender()
	{
		btnMaleGender.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Female')])[1]")
	@CacheLookup
	WebElement btnOtherGender;
	
	public void clickbtnOtherGender()
	{
		btnOtherGender.click();
	}
	
	@FindBy(xpath = "(//span[@title='1'])[1]")
	@CacheLookup
	WebElement btnRelationshipStatus;
	
	public void clickbtnRelationshipstatus()
	{
		btnRelationshipStatus.click();
	}
	
	@FindBy(xpath = "//div[contains(text(),'Married')]")
	@CacheLookup
	WebElement btnMarriedRelationShip;
	
	public void clickbtnMarriedRealationShip()
	{
		btnMarriedRelationShip.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Unmarried')])[1]")
	@CacheLookup
	WebElement btnUnmarriedRelationShip;
	
	public void clickbtnUnmarriedRelationShip()
	{
		btnUnmarriedRelationShip.click();
	}
	
	@FindBy(xpath = "(//input[@name='present'])[1]")
	@CacheLookup
	WebElement txtPAddressOne;
	
	public void cleartxtPAddressOne()
	{
		txtPAddressOne.click();
	}
	
	public void setbtnPAddressOne(String pAddOne)
	{
		txtPAddressOne.sendKeys(pAddOne);
	}
	
	@FindBy(xpath = "(//input[@name='present'])[2]")
	@CacheLookup
	WebElement txtPAddressTwo;
	
	public void cleartxtPAddressTwo()
	{
		txtPAddressTwo.click();
	}
	
	public void settxtPAddressTwo(String pAddTwo)
	{
		txtPAddressTwo.sendKeys(pAddTwo);
	}
	
	@FindBy(xpath = "(//input[@name='present'])[3]")
	@CacheLookup
	WebElement txtPin;
	
	public void cleartxtPin()
	{
		txtPin.clear();
	}
	
	public void settxtPin(String pin)
	{
		txtPin.sendKeys(pin);
	}
	
	@FindBy(xpath = "(//input[@name='present'])[4]")
	@CacheLookup
	WebElement txtLandmark;
	
	public void cleartxtLandMark()
	{
		txtLandmark.clear();
	}
	
	public void settxtLandmark(String landMark)
	{
		txtLandmark.sendKeys(landMark);
	}
	
	@FindBy(xpath = "(//input[@name='present'])[5]")
	@CacheLookup
	WebElement txtCity;
	
	public void cleartxtCity()
	{
		txtCity.clear();
	}
	
	public void settxtCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	@FindBy(xpath = "(//span[@title='CG'][normalize-space()='CG'])[1]")
	@CacheLookup
	WebElement btnState;
	
	public void clickbtnState()
	{
		btnState.click();
	}
	
	public void goDownState()
	{
		btnState.sendKeys(Keys.ARROW_DOWN);
	}
	
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[1]")
	@CacheLookup
	WebElement divDropdown;
	
	public void getdivDropdown() throws InterruptedException
	{
		divDropdown.wait(5000);
	}
	
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Chandigarh'])[1]")
	@CacheLookup
	WebElement btnStateChandighar;
	
	public void clickbtnStateChandighar()
	{
		btnStateChandighar.click();
	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement btnPermanentAddress;
	
	public void clickbtnPermanentAddress()
	{
		btnPermanentAddress.click();
	}
	
	@FindBy(xpath = "(//input[@name='currentAddress'])[1]")
	@CacheLookup
	WebElement txtDegree;
	
	public void cleartxtDegree()
	{
		txtDegree.clear();
	}
	
	public void settxtDegree(String degree)
	{
		txtDegree.sendKeys(degree);
	}
	
	@FindBy(xpath = "(//input[contains(@placeholder,'')])[13]")
	@CacheLookup
	WebElement txtCollegeName;
	
	public void cleartxtCollegeName()
	{
		txtCollegeName.clear();
	}
	
	public void settxtCollegeName(String cName)
	{
		txtCollegeName.sendKeys(cName);
	}
	
	@FindBy(xpath = "(//input[contains(@placeholder,'')])[14]")
	@CacheLookup
	WebElement txtUniversity;
	
	public void cleartxtUniversity()
	{
		txtUniversity.clear();
	}
	
	public void settxtUniversity(String usity)
	{
		txtUniversity.sendKeys(usity);
	}
	
	@FindBy(xpath = "(//input[@value='Bhubaneswar'])[1]")
	@CacheLookup
	WebElement txtEAddress;
	
	public void cleartxtEAddress()
	{
		txtEAddress.clear();
	}
	
	public void settxtEAddress(String eAdd)
	{
		txtEAddress.sendKeys(eAdd);
	}
	
	@FindBy(xpath = "(//input[@title='2011-06-09'])[1]")
	@CacheLookup
	WebElement btnEStartDate;
	
	public void clickbtnEStartDate()
	{
		btnEStartDate.click();
	}
	
	@FindBy(xpath = "(//input[@title='2015-06-17'])[1]")
	@CacheLookup
	WebElement btnEEndDate;
	
	public void clickbtnEEndDate()
	{
		btnEEndDate.click();
	}
	
	//Emergency Contact

	@FindBy(xpath = "(//input[@name='emergencyName'])[1]")
	@CacheLookup
	WebElement txtECFName;
	
	public void cleartxtECFName()
	{
		txtECFName.clear();
	}
	
	public void settxtECFName(String eName)
	{
		txtECFName.sendKeys(eName);
	}
	
	@FindBy(xpath = "(//input[@name='relationship'])[1]")
	@CacheLookup
	WebElement txtECRelationShip;
	
	public void cleartxtECRelationShip()
	{
		txtECRelationShip.clear();
	}
	
	public void settxtECrelationShip(String mName)
	{
		txtECRelationShip.sendKeys(mName);
	}
	
	@FindBy(xpath = "(//input[@name='Address'])[1]")
	@CacheLookup
	WebElement txtECAddress;
	
	public void cleartxtECAddress()
	{
		txtECAddress.clear();
	}
	
	public void settxtECAddress(String address)
	{
		txtECAddress.sendKeys(address);
	}
	
	@FindBy(xpath = "(//input[@name='contactNumbmer'])[1]")
	@CacheLookup
	WebElement txtECContactNumber;
	
	public void CleartxtECContactNumber()
	{
		txtECContactNumber.clear();
	}
	
	public void settxtECContactNumber(String cNumber)
	{
		txtECContactNumber.sendKeys(cNumber);
	}
	
	
	//Nominee One
	
	@FindBy(xpath = "(//input[@value='Vijay DevarKondr'])[1]")
	@CacheLookup
	WebElement txtNOFName;
	
	public void cleartxtNOFName()
	{
		txtNOFName.clear();
	}
	
	public void settxtNOFName(String fName)
	{
		txtNOFName.sendKeys(fName);
	}
	
	@FindBy(xpath = "(//input[@value='Kuch Nahii'])[1]")
	@CacheLookup
	WebElement txtNORelationship;
	
	public void cleartxtNORelationship()
	{
		txtNORelationship.clear();
	}
	
	public void settxtNORelationship(String oRel)
	{
		txtNORelationship.sendKeys(oRel);
	}
	
	@FindBy(xpath = "(//input[contains(@placeholder,'')])[26]")
	@CacheLookup
	WebElement txtNOAadharNumber;
	
	public void cleartxtNOAadharNumber()
	{
		txtNOAadharNumber.clear();
	}
	
	public void settxtNOAadharNumber(String oAadhar)
	{
		txtNOAadharNumber.sendKeys(oAadhar);
	}
	
	//Nominee Two
	
	@FindBy(xpath = "(//input[@value='Nagarjunaa'])[1]")
	@CacheLookup
	WebElement txtNTFName;
	
	public void cleartxtNTFName()
	{
		txtNTFName.clear();
	}
	
	public void settxtNTFName(String fName)
	{
		txtNTFName.sendKeys(fName);
	}
	
	@FindBy(xpath = "(//input[@value='Fana'])[1]")
	@CacheLookup
	WebElement txtNTRelationship;
	
	public void cleartxtNTRelationship()
	{
		txtNTRelationship.clear();
	}
	
	public void settxtNTRelationship(String tRel)
	{
		txtNTRelationship.sendKeys(tRel);
	}
	
	@FindBy(xpath = "(//input[@value='Big Fana'])[1]")
	@CacheLookup
	WebElement txtNTORelationship;
	
	public void cleartxtNTORelationship()
	{
		txtNTORelationship.clear();
	}
	
	public void settxtNTORelationship(String oRel)
	{
		txtNTORelationship.sendKeys(oRel);
	}
	
	@FindBy(xpath = "(//input[contains(@title,'2022-08-02')])[2]")
	@CacheLookup
	WebElement txtNTDateOFBirth;
	
	public void clicktxtNTDateOFBirth()
	{
		txtNTDateOFBirth.click();
	}
	
	@FindBy(xpath = "(//input[contains(@placeholder,'')])[31]")
	@CacheLookup
	WebElement txtNTAadharNumber;
	
	public void cleartxtNTAadharNumber()
	{
		txtNTAadharNumber.clear();
	}
	
	public void settxtNTAadharNumber(String aNum)
	{
		txtNTAadharNumber.sendKeys(aNum);
	}
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[37]")
	@CacheLookup
	WebElement txtN3FullName;
	
	public void cleartxtN3FullName()
	{
		txtN3FullName.clear();
	}
	
	public void settxtN3FullName(String fName)
	{
		txtN3FullName.sendKeys(fName);
	}
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[38]")
	@CacheLookup
	WebElement txtN3Relation;
	
	public void cleartxtN3Relation()
	{
		txtN3Relation.clear();
	}
	
	public void settxtN3Relation(String rel)
	{
		txtN3Relation.sendKeys(rel);
	}
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[39]")
	@CacheLookup
	WebElement txtN3ORelationship;
	
	public void cleartxtN3ORelationship()
	{
		txtN3ORelationship.clear();
	}
	
	public void settxtN3ORelationship(String oRel)
	{
		txtN3ORelationship.sendKeys(oRel);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Select date'])[6]")
	@CacheLookup
	WebElement txtN3DateOfBirth;
	
	public void cleartxtN3DateOfBirth()
	{
		txtN3DateOfBirth.clear();
	}
	
	public void settxtN3DateOfBirth(String dOb)
	{
		txtN3DateOfBirth.sendKeys(dOb);
	}
	
	@FindBy(xpath = "(//input[@value='111'])[1]")
	@CacheLookup
	WebElement txtN3AadharNumber;
	
	public void cleartxtN3AadharNumber()
	{
		txtN3AadharNumber.clear();
	}
	
	public void settxtN3AadharNumber(String aNumber)
	{
		txtN3AadharNumber.sendKeys(aNumber);
	}
	
	//Parent Information
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[42]")
	@CacheLookup
	WebElement txtPiFatherName;
	
	public void cleartxtPiFatherName()
	{
		txtPiFatherName.clear();
	}
	
	public void settxtPiFatherName(String fName)
	{
		txtPiFatherName.sendKeys(fName);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Select date'])[7]")
	@CacheLookup
	WebElement txtfDateOfBirth;
	
	public void cleartxtfDateOfBirth()
	{
		txtfDateOfBirth.clear();
	}
	
	public void settxtfDateOfBirth(String fDob)
	{
		txtfDateOfBirth.sendKeys(fDob);
	}
	
	@FindBy(xpath = "(//input[@value='true'])[1]")
	@CacheLookup
	WebElement btnYesFatherDisable;
	
	public void clickbtnYesFatherDisable()
	{
		btnYesFatherDisable.click();
	}
	
	@FindBy(xpath = "(//input[@value='false'])[1]")
	@CacheLookup
	WebElement btnNoFatherDisable;
	
	public void clickbtnNoFatherDisable()
	{
		btnNoFatherDisable.click();
	}
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[44]")
	@CacheLookup
	WebElement txtPiMotherName;
	
	public void cleartxtPiMotherName()
	{
		txtPiMotherName.clear();
	}
	
	public void settxtPiMotherName(String mName)
	{
		txtPiMotherName.sendKeys(mName);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Select date'])[8]")
	@CacheLookup
	WebElement txtmDateOfBirth;
	
	public void cleartxtmDateOfBirth()
	{
		txtmDateOfBirth.clear();
	}
	
	public void settxtmDateOfBirth(String mDob)
	{
		txtmDateOfBirth.sendKeys(mDob);
	}
	
	@FindBy(xpath = "(//input[@value='true'])[2]")
	@CacheLookup
	WebElement btnYesMotherDisable;
	
	public void clickbtnYesMotherDisable()
	{
		btnYesMotherDisable.click();
	}
	
	@FindBy(xpath = "(//input[@value='false'])[2]")
	@CacheLookup
	WebElement btnNoMotherDisable;
	
	public void clickbtnNoMotherDisable()
	{
		btnNoMotherDisable.click();
	}
}
