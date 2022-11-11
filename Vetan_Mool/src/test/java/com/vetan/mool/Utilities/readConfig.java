package com.vetan.mool.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	
	public readConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}
	
	public String getvetanURL()
	{
		String url = pro.getProperty("vetanURL");
		return url;
	}

	public String getstageURL()
	{
		String url = pro.getProperty("vetanURL");
		return url;
	}

	public String getlandingPageURL()
	{
		String url = pro.getProperty("landingPageURL");
		return url;
	}

	public String getdevURL()
	{
		String url = pro.getProperty("devURL");
		return url;
	}
	

	public String getuserName()
	{
		String uname = pro.getProperty("userName");
		return uname;
	}
	
	public String getpassword()
	{
		String pass = pro.getProperty("password");
		return pass;
	}
	
	public String getchromepath() 
	{
		String cpath = pro.getProperty("chromepath");
		return cpath;
	}
}
