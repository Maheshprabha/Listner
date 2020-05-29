package com.atmecs.swaglabs.testsuite;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import com.atmecs.swaglabs.filepath.FilePath;
import com.atmecs.swaglabs.utils.LocationReader;

public class BaseClass {
	Properties property;
	public WebDriver driver;

	@BeforeTest
	public void invokeBrowser() throws Exception {
		property = LocationReader.readLocation(FilePath.Config_Path);
		System.setProperty("webdriver.chrome.driver", FilePath.Driver_Path);
		driver = new ChromeDriver();
		// CommonHelpers.implicitWait(driver);
		String baseUrl = property.getProperty("Url");
		System.out.println(baseUrl);
		driver.get(baseUrl);
		// CommonHelpers.implicitWait(driver);
		driver.manage().window().maximize();
	}
}
