package com.commoncode.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ACreateMenuPage {

	public ACreateMenuPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WebDriver driver;

	@FindBy(how = How.LINK_TEXT, using = "Menus")
	public WebElement toolbarMenu;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Manage')])[2]")
	public WebElement manageMenu;

	@FindBy(how = How.LINK_TEXT, using = "Menu Items")
	public WebElement selectMenuItems;

	@FindBy(how = How.XPATH, using = "//button[@onclick=\"Joomla.submitbutton('item.add');\"]")
	public WebElement createNewMenuItem;

	@FindBy(how = How.ID, using = "jform_title")
	public WebElement menuTitle;

	@FindBy(how = How.XPATH, using = "//button[@type='button']")
	public WebElement selectMenuType;

	@FindBy(how = How.ID, using = "jform_menutype_chzn")
	public WebElement menuType;

	@FindBy(how = How.ID, using = "jform_access_chzn")
	public WebElement menuAccess;

	@FindBy(how = How.XPATH, using = "//button[@onclick=\"Joomla.submitbutton('item.save');\"]")
	public WebElement btnSaveAndClose;

	@FindBy(how = How.XPATH, using = "//a[@onclick=\"setmenutype('eyJpZCI6MCwidGl0bGUiOiJDT01USkxNU19NRU5VU19DT1VSU0VTIiwicmVxdWVzdCI6eyJvcHRpb24iOiJjb21fdGpsbXMiLCJ2aWV3IjoiY291cnNlcyJ9fQ==')\"]")
	public WebElement coursesMenu;

	@FindBy(how = How.XPATH, using = "//a[@onclick=\"setmenutype('eyJpZCI6MCwidGl0bGUiOiJDT01fSlRJQ0tFVElOR19USVRMRV9PUkRFUlNfQUxMIiwicmVxdWVzdCI6eyJvcHRpb24iOiJjb21fanRpY2tldGluZyIsInZpZXciOiJvcmRlcnMiLCJsYXlvdXQiOiJkZWZhdWx0In19')\"]")
	public WebElement eventAllOrders;
}
