package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ItemauthoringPage extends Pageobject{
	public ItemSearchPage navigatetoitemsearchpage() {
		
		//click item search link
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		driver.switchTo().frame(driver.findElement(By.id("ItemAuthoringFrame")));
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//a[contains(text(),'Item Search')]")).click();
				
		System.out.println("Click on Item Search link");
				
		return new ItemSearchPage();
	}

}
