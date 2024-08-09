package com.jlr.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jlr.actiondriver.Action;
import com.jlr.base.BaseClassJLR;


public class HomePage extends BaseClassJLR {
	
	@FindBy(xpath = "//div[text() = 'Company']")
	WebElement company;
	
	@FindBy(xpath = "//a[text() = 'Brands']")
	WebElement Brands;
	
	@FindBy(xpath = "//a[text() = 'Investors']")
	WebElement investors;

	@FindBy(xpath = "//a[text() = 'Results Center']")
	WebElement resultsCenter;
	
	@FindBy(xpath = "//a[text() = 'People']")
	WebElement people;
	
	@FindBy(xpath = "//a[text() = 'News']")
	WebElement news;
	
	@FindBy(xpath = "//a[@alt ='Logo']")
	WebElement JLRLogo;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateCompanyMenu() throws Throwable{
		return Action.isDisplayed(driver, company);
	}
	public boolean validateBrandsMenu() throws Throwable{
		return Action.isDisplayed(driver, Brands);
	}
	public boolean validateInvestorsMenu() throws Throwable{
		return Action.isDisplayed(driver, investors);
	}
	
	public boolean validateResultsCenterMenu() throws Throwable{
		return Action.isDisplayed(driver, resultsCenter);
	}
		
	public boolean validatePeopleMenu() throws Throwable{
			return Action.isDisplayed(driver, people);
		}
		
	public boolean validateNewsMenu() throws Throwable{
			return Action.isDisplayed(driver, news);
		}
	
	public boolean validateLogo() {
		return Action.isDisplayed(driver, JLRLogo);
		}
	
	public String getJLRTitle() {
		String JLRTitle = driver.getTitle();
		return JLRTitle;
		
	}
	
}
