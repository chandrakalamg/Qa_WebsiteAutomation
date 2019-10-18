package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ItemSearchPage extends Pageobject {
public ItemSearchPage searchforitem(String searchstring) {
		
		//click item search link
	
	//driver.findElement(By.id("fil//input[@id='filterItems']")).sendKeys("abc");
	
	driver.findElement(By.id("filterItems")).sendKeys("a");
	
	//click on search button
	
	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
	
	//wait
	
	return this;
}

public ItemSearchPage verifysearchresults() {
	
	//click item search link
	int cnt = driver.findElement(By.xpath("//div[@class='surpass-table-container']/table")).findElements(By.xpath("//tbody/tr")).size();
	System.out.println("count="+cnt);

	return this;
}

public LoginPage logout() {
	
	//logout code 
	
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector(".dropdown-toggle")).click();
	driver.findElement(By.id("logout")).click();
	return new LoginPage();
}

}
