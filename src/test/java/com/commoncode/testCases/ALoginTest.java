package com.commoncode.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.lang.reflect.Method;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.commoncode.dataproviders.DataProviderClass;
import com.commoncode.pages.ALoginPage;
import com.commoncode.testbase.TestBase;
import com.commoncode.utility.Constants;

public class ALoginTest extends TestBase {

	@Test(dataProvider = "adminlogin", dataProviderClass = DataProviderClass.class)

	public void adminLogin(String testDesc, String un, String pw, String expMessage, Method method) {
		
		logger = extent.createTest(method.getName().toString());

		ALoginPage login = new ALoginPage(driver);

		driver.get(Constants.SITEURL + properties.getProperty("admin"));

		if (!testDesc.equals("valid")) {

			login.submitLoginExpectingFailure(un, pw);

			AssertJUnit.assertEquals(login.invalidUsername(), expMessage);

		} else if (testDesc.equals("valid")) {

			login.loginAs(un, pw);

		}

	}

}