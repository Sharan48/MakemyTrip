package com.makemytrip.pageobjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.utility.Action;

public class Homepage {
	WebDriver driver;
	
	Action action=new Action();
	
	@FindBy(xpath="//span[.='From']")
	private WebElement from;
	
	@FindBy(xpath="//p[.='Mumbai, India']/..")
	private WebElement fromcity;
	
	@FindBy (xpath="//span[.='To']")
	private WebElement to;
	
	@FindBy(xpath="//p[.='New Delhi, India']/..")
	private WebElement tocity;
	
	@FindBy(xpath="//span[.='DEPARTURE']/../..")
	private WebElement departure;
	
	@FindBy(xpath="//div[@aria-label='Fri Sep 23 2022']")
	private WebElement date;
	
	@FindBy(xpath ="//p[@data-cy=\\\"submit\\\"]/a")
	private WebElement search;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getMakeMyTripTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void enterFromCityName() throws InterruptedException {
		action.waitAndClick(from);
		fromcity.click();
		
	}
	
	public void enterToCityName() throws InterruptedException {
		action.waitAndClick(to);
		tocity.click();
	}
	
	public void clickOnDeparture() {
		departure.click();
	}
	
	public void clickOnDate() {
		date.click();
	}
	
	public FlightsFromNewDehliToBengaluruPage clickOnSearch() throws InterruptedException{
		action.waitAndClick(search);
		return new FlightsFromNewDehliToBengaluruPage(driver);
	}

}
