package com.makemytrip.pageobjectory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.utility.Action;

public class SeatBookPage {
	
	Action action=new Action();
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='DEL$BLR$2022-09-21 06:05$SG-191_3B']/div")
	private WebElement seat;
	
	@FindBy(xpath="//button[.='Continue']")
	private WebElement continuebutton;
	
	public SeatBookPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSeat() {
		action.JSClick(driver, seat);
		
	}

	public void clickOnContinue() {
		action.JSClick(driver, continuebutton);
		Alert accept = driver.switchTo().alert();
		accept.accept();
	}
}
