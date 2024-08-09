package com.jlr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jlr.base.BaseClassJLR;
import com.jlr.pageobjects.HomePage;
import com.jlr.utility.Log;

public class JLRHomeTest extends BaseClassJLR {
	
	 HomePage  homePage; 
	 
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void verifyHomePageTest() throws Throwable
	{
		homePage = new HomePage();
		
//		Log.startTestCase("verifyLogo");
//		boolean result  = homePage.validateLogo();
//		Assert.assertTrue(result);
//		Log.endTestCase("verified Logo Successfully");
		
		Log.startTestCase("verifyTitle");
		String title = homePage.getJLRTitle();
		Assert.assertEquals(title, "JLR Corporate Website");
		Log.endTestCase("verified Title Successfully");
		
		Log.startTestCase("verifyHomePageTest");
		Thread.sleep(1000);
		boolean result1 = homePage.validateCompanyMenu();
		Assert.assertTrue(result1);
		boolean result2 = homePage.validateBrandsMenu();
		Assert.assertTrue(result2);
		boolean result3 = homePage.validateInvestorsMenu();
		Assert.assertTrue(result3);
		boolean result4 = homePage.validateResultsCenterMenu();
		Assert.assertTrue(result4);
		boolean result5 = homePage.validatePeopleMenu();
		Assert.assertTrue(result5);
		boolean result6 = homePage.validateNewsMenu();
		Assert.assertTrue(result6);
		Log.endTestCase("verified HomePageTest Successfully");
		
	}

}
