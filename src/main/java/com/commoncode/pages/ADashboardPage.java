package com.commoncode.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.commoncode.testbase.TestBase;

public class ADashboardPage extends TestBase {

	WebDriver driver;

	public ADashboardPage(WebDriver driver) {

		System.out.println("You're on Dashboard!!!");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'User Menu')]")
	public WebElement userMenu;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public WebElement btnLogout;

	public ALoginPage logout() {

		userMenu.click();
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.visibilityOf(btnLogout));
		btnLogout.click();
		return new ALoginPage(driver);
	}
}
