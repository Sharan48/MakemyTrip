package com.makemytrip.utility;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {


	public void JSClick(WebDriver driver, WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	

	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);	
	}
	
	
	public void JsSendvalue(WebDriver driver, WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementById(id').value='someValue';");
	}
	public void waitforElement(WebDriver driver,WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean type(WebElement ele, String text) {
		boolean flag=false;
		try {
			flag=ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}
	public void waitAndClick(WebElement element) throws InterruptedException{
		int i=0;
		while(i<5)
		{
			try{
				element.click();
				break;
			}catch (Exception e) {
				Thread.sleep(2000);
				i++;
			}
		}
	}
}