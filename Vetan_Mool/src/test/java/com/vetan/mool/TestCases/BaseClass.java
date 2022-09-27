package com.vetan.mool.TestCases;

import java.io.File;  
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.vetan.mool.Utilities.readConfig;

public class BaseClass {
	
	readConfig readconfig = new readConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String userName = readconfig.getuserName();
	public String password = readconfig.getpassword();
	public static WebDriver driver; 
	
	public static Logger logger;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver(); 
		}else if(br.equals("safari"))
		{
			driver = new SafariDriver();
		}
		
		driver.get(baseURL);
		
		
		logger  =  Logger.getLogger("Vetan_Mool");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	//ScreenShots
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshot"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	
	
	
	
	
	//Random Generations
	public String randomPanalpha()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomPannumeric()
	{
		String generatedString = RandomStringUtils.randomNumeric(4);
		return generatedString;
	}
	
	//Phone
	public String randomPhone()
	{
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	//Email
	public String randomEmail()
	{
		String generatedString = RandomStringUtils.randomAlphanumeric(7);
		return generatedString;
	}
	
	//Name
	public String randomFName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomLName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
	public String randomEmpid()
	{
		String generatedString = RandomStringUtils.randomAlphanumeric(5);
		return generatedString;
	}	
	
	public String randomCtc()
	{
		String generatedString = RandomStringUtils.randomNumeric(5);
		return generatedString;
	}	
	
	public String randomUserName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomOrgname()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
		
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
