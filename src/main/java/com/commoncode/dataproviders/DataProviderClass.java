package com.commoncode.dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.commoncode.utility.Constants;
import com.commoncode.utility.ExcelUtils;

public class DataProviderClass {

	@DataProvider(name = "adminlogin")

	public static Object[][] adminlogin() throws IOException {

		return ExcelUtils.getExcelData(Constants.TESTDATAEXCELFILE, "adminLogin");

	}

}
