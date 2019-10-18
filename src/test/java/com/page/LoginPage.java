package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Pageobject {

	public HomePage Login() {
		//driver.get("https://regression.surpass-preview.com");
		String url = "https://regression.surpass-preview.com/Login?ReturnUrl=%2f";
		//Launch website
		driver.get(url);
		driver.manage().window().maximize();
		//wait for 
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		//Enter username
		driver.findElement(By.id("UserName")).sendKeys("AutomationCandidate");
		
		//Enter password
		
		driver.findElement(By.id("Password")).sendKeys("Password!01");
		
		//Login button
		
		driver.findElement(By.xpath("//input[@class='btn btn-large btn-primary']")).click();
			
		return new HomePage();
	}
}
