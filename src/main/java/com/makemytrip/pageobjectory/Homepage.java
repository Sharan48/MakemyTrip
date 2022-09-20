package com.makemytrip.pageobjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.utility.Action;

public class Homepage {
	WebDriver driver;
	
	Action action=new Action();
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement from;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement to;
	
	@FindBy(xpath="//span[.='DEPARTURE']")
	private WebElement departure;
	
	@FindBy(xpath="//div[@aria-label='Wed Sep 21 2022']")
	private WebElement date;
	
	@FindBy(xpath ="//a[.='Search']")
	private WebElement search;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFromCityName() {
		action.type(from, "New Dehli");
		
	}
	
	public void enterToCityName() {
		action.type(to, "Bengaluru");
	}
	
	public void clickOnDeparture() {
		action.JSClick(driver, departure);
	}
	
	public void clickOnDate() {
		action.JSClick(driver, date);
	}
	
	public FlightsFromNewDehliToBengaluruPage clickOnSearch() {
		action.JSClick(driver, search);
		return new FlightsFromNewDehliToBengaluruPage();
	}

}
