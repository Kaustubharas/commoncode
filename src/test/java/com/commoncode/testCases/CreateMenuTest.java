package com.commoncode.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.commoncode.pages.ACreateMenuPage;
import com.commoncode.testbase.TestBase;
import com.commoncode.utility.Constants;

public class CreateMenuTest extends TestBase {

	@Test
	public void menuCreation() {

		ACreateMenuPage menu = new ACreateMenuPage(driver);
		menu.toolbarMenu.click();
		menu.manageMenu.click();
		menu.selectMenuItems.click();
		menu.createNewMenuItem.click();
		menu.menuTitle.sendKeys(Constants.MENUTITLE);
		menu.selectMenuType.click();
		driver.switchTo().frame("Menu Item Type");
		driver.findElement(By.linkText(Constants.SELECTCOMPONENET)).click();
		if (Constants.SELECTCOMPONENET.equalsIgnoreCase("Shika")) {
			menu.coursesMenu.click();
			driver.findElement(By.xpath("//div[@id='jform_request_courses_to_show_chzn']/a/span")).click();
			driver.findElement(By.xpath("//div[@id='jform_request_courses_to_show_chzn']/div/ul/li[3]")).click();
		} else if (Constants.SELECTCOMPONENET.equalsIgnoreCase("JTicketing")) {
			menu.eventAllOrders.click();
		}
		driver.findElement(By.xpath("//div[@id='jform_menutype_chzn']/a/span")).click();
		driver.findElement(By.xpath("//div[@id='jform_menutype_chzn']/div/ul/li[3]")).click();
		driver.findElement(By.xpath("//div[@id='jform_access_chzn']/a/span")).click();
		driver.findElement(By.xpath("//div[@id='jform_access_chzn']/div/ul/li[7]")).click();
		menu.btnSaveAndClose.click();
	}
}
