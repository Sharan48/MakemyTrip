package com.makemytrip.pageobjectory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.utility.Action;

public class CompleteYourBooking {
	WebDriver driver;
	
	Action action=new Action();
	
	@FindBy(xpath="(//span[@class='outer'])[1]")
	private WebElement securemytrip;
	
	@FindBy(xpath="//button[.='+ ADD NEW ADULT']")
	private WebElement newadult;
	
	@FindBy(xpath="//input[@placeholder='First & Middle Name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@value='MALE']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@placeholder='Mobile No' and @type='text']")
	private WebElement moblieno;
	
	@FindBy(xpath="//input[@placeholder='Email' and @type='text']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Continue']")
	private WebElement contnue;
	
	public CompleteYourBooking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnsecureMyTrip() {
		action.JSClick(driver, securemytrip);
	}
	
	public void clickOnNewAdult() {
		action.JSClick(driver, newadult);
	}
	
	public void enterFirstNameandLastName() {
		action.type(firstname, "Sharanabasappa");
		action.type(lastname, "saradagi");
	}
	
	public void clickOnGender() {
		action.JSClick(driver, gender);
	}
	
	public void enterMobileNumberAndEmail() {
		action.type(moblieno, "7676714748");
		action.type(email, "sharan4748@gmail.com");
	}
	
	public SeatBookPage clickOnContinue() {
		action.JSClick(driver, contnue);
		Alert accept = driver.switchTo().alert();
		accept.accept();
		accept.accept();
		return new SeatBookPage(driver);
	}

}
