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
	
	public SeatBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSeat() throws InterruptedException {
		action.waitAndClick(seat);
		
	}

	public void clickOnContinue() throws InterruptedException {
		action.waitAndClick(continuebutton);
		Alert accept = driver.switchTo().alert();
		accept.accept();
	}
}
