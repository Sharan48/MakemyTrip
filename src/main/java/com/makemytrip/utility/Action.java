package com.makemytrip.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {

	
	public void JSClick(WebDriver driver, WebElement ele) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
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
}