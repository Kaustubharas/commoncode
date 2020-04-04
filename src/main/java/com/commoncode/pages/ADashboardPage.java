package com.commoncode.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ADashboardPage {

	WebDriver driver;

	public ADashboardPage(WebDriver driver) {

		System.out.println("You're on Dashboard!!!");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
