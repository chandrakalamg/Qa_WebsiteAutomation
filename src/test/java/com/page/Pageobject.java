package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobject {
	public static WebDriver driver = null;
	//public String browser;
	
	public Pageobject() {
		
		if (driver == null)
		{
			String path = System.getProperty("user.dir");
			System.out.println(path); 
			System.setProperty("webdriver.chrome.driver",path+"\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}

