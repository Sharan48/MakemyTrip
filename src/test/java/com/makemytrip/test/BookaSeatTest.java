package com.makemytrip.test;

import org.testng.annotations.Test;

import com.makemytrip.baseclass.BaseClass;
import com.makemytrip.pageobjectory.CompleteYourBooking;
import com.makemytrip.pageobjectory.FlightsFromNewDehliToBengaluruPage;
import com.makemytrip.pageobjectory.Homepage;
import com.makemytrip.pageobjectory.SeatBookPage;

public class BookaSeatTest extends BaseClass {
	Homepage homepage;
	FlightsFromNewDehliToBengaluruPage flightpage;
	CompleteYourBooking completebookingpage;
	SeatBookPage seatbookpage;
	
	@Test
	public void bookAseatfromNewDehliToBengalur() {
		homepage=new Homepage();
		homepage.enterFromCityName();
		homepage.enterToCityName();
		homepage.clickOnDeparture();
		homepage.clickOnDate();
		flightpage=homepage.clickOnSearch();
		flightpage.clickOnViewPrice();
		completebookingpage=flightpage.clickOnBooknow();
		completebookingpage.clickOnsecureMyTrip();
		completebookingpage.clickOnNewAdult();
		completebookingpage.enterFirstNameandLastName();
		completebookingpage.clickOnGender();
		completebookingpage.enterMobileNumberAndEmail();
		seatbookpage=completebookingpage.clickOnContinue();
		seatbookpage.clickOnSeat();
		seatbookpage.clickOnContinue();
		
	}

}
