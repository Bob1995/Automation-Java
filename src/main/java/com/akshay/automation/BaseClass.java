package com.akshay.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver webDriver;
	private static String chromeDriverPath = "src/test/resources/Drivers/chromedriver.exe";

	@BeforeTest
	public void preSetUp() {
		System.out.println("Inside BeforeTest");
		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			webDriver = new ChromeDriver();
			System.out.println("Chrome Driver Instantiated!!!");
		} else {
			System.out.println("chrome driver already instantiated!!");
		}
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Inside AfterTest");
		webDriver.quit();
	}

	@BeforeMethod
	public void validateBeforeMethod() {
		System.out.println(" inside validate before Method");
	}

	@AfterMethod
	public void validateAfterMethod() {
		System.out.println("inside validate after method");
	}
}
