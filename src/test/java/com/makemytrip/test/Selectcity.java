package com.makemytrip.test;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.makemytrip.utility.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectcity {
	public static void main(String[] args) throws InterruptedException {
		Action action=new Action();
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String title=driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip");

		//Enter From city name
		WebElement ele = driver.findElement(By.xpath("//span[.='From']"));
		action.JSClick(driver, ele);
		driver.findElement(By.xpath("//p[.='Mumbai, India']/..")).click();

		//Enter to city name
		WebElement ele2 = driver.findElement(By.xpath("//span[.='To']"));
		action.JSClick(driver, ele2);
		driver.findElement(By.xpath("//p[.='New Delhi, India']/..")).click();
		//Select date
		driver.findElement(By.xpath("//span[.='DEPARTURE']/../..")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri Sep 23 2022']")).click();
		//Submit details
		WebElement ele3 = driver.findElement(By.xpath("//p[@data-cy=\"submit\"]/a"));
		action.JSClick(driver, ele3);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='OKAY, GOT IT!']")).click();

		//Select airline and book
		WebElement ele4 = driver.findElement(By.xpath("(//span[.='View Prices'])[1]"));
		action.JSClick(driver, ele4);

		WebElement ele5 = driver.findElement(By.xpath("(//button[.='Book Now'])[1]"));
		action.JSClick(driver, ele5);

		//Handle window
		Set<String> window = driver.getWindowHandles();

		ArrayList<String> windowlists=new ArrayList<String>(window);
		String firstwindow = windowlists.get(1);
		driver.switchTo().window(firstwindow);
		String windowtitle = driver.getTitle();

		//Put assertion for selected window confirmation 
		Assert.assertEquals(windowtitle, "MakeMyTrip");
		System.out.println("New Window Title :" + windowtitle);

		WebElement ele6 = driver.findElement(By.xpath("(//div[@class='insBottomSection']/div/label/span/span)[1]"));
		action.waitAndClick(ele6);

		//Add the personal details
		WebElement ele7 = driver.findElement(By.xpath("//button[.='+ ADD NEW ADULT']"));
		action.scrollByVisibilityOfElement(driver, ele7);
		action.JSClick(driver, ele7);


		WebElement ele9 = driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']"));
		action.JSClick(driver, ele9);
		action.type(ele9, "Sharanabasappa");

		WebElement lastele = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		action.JSClick(driver, lastele);
		action.type(lastele, "Saradagi");
		WebElement ele10 = driver.findElement(By.xpath("//input[@value='MALE']"));
		action.JSClick(driver, ele10);
		

		WebElement ele12 = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
		action.type(ele12, "7676714748");

		WebElement ele13 = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		action.type(ele13, "sharan4748@gmail.com");
		
		WebElement ele14 = driver.findElement(By.xpath("//button[.='Continue']"));
		Actions doubleclick=new Actions(driver);
		doubleclick.doubleClick(ele14).build().perform();
		
		WebElement ele15 = driver.findElement(By.xpath("//button[.='CONFIRM']"));
		action.JSClick(driver, ele15);
		
		WebElement ele16 = driver.findElement(By.xpath("//button[.='Yes, Please']"));
		action.JSClick(driver, ele16);

		//Select seat
		WebElement ele17 = driver.findElement(By.xpath("//div[@class='flightSeatMatrix']/div/div[9]/div[3]"));
		action.JSClick(driver, ele17);
		
		WebElement ele18 = driver.findElement(By.xpath("//button[.='Continue']"));
		action.JSClick(driver, ele18);
		
		WebElement ele19 = driver.findElement(By.xpath("//button[.='Continue']"));
		action.JSClick(driver, ele19);
		
		WebElement ele20 = driver.findElement(By.xpath("//button[.='CONTINUE ANYWAY']"));
		action.JSClick(driver, ele20);
		

		WebElement ele21 = driver.findElement(By.xpath("//button[.='Proceed to pay']"));
		action.JSClick(driver, ele21);

		 driver.quit();
	}

}
