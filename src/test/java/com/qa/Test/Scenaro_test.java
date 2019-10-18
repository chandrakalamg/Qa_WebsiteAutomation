package com.qa.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.page.LoginPage;
import com.page.Pageobject;

import org.testng.annotations.AfterMethod;

public class Scenaro_test {

@Test
  public void verifyItemsearch() {
	  //navigate to the url
	  LoginPage Page = new LoginPage();
	//login to the application
	  Page.Login()
	  
	  //click on Item authoring link
	  
	  .NavigatetoItemAuth()
	  
	  .navigatetoitemsearchpage()
	//select Feedback from dropdown 
	//type Test in search window
	  
	  //click on Search button
	  .searchforitem("Test")
	  
	  //verify number of records
	  .verifysearchresults()
	  //User /logout

	  .logout();
	 
	  //click on Item Search link
	 	 
 	  System.out.println("test completed");
}
 	@AfterMethod
 	 public void afterMethod() {
		  Pageobject.driver.quit();
 	}
}