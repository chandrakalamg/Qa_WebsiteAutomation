package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Pageobject {
	public ItemauthoringPage NavigatetoItemAuth() {
		
		//click item authoring ink
		WebDriverWait wait=new WebDriverWait(driver, 100);
		
		driver.findElement(By.xpath("//a[contains(text(),'Item Authoring')]")).click();
		
		System.out.println("Click on Item Authoring link");
		
		
		return new ItemauthoringPage();
	}

}
