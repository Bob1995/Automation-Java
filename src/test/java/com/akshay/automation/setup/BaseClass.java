package com.akshay.automation.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver webDriver;
	private static String chromeDriverPath = "src/test/resources/Drivers/chromedriver.exe";
	public ExtentHtmlReporter extentHtmlReporter;
	public ExtentReports extentReports;
	public ExtentTest extentTest;

	@BeforeTest
	public void preSetUp() {
		extentHtmlReporter = new ExtentHtmlReporter("src/test/resources/Reports/loginreport.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentTest = extentReports.createTest("Citrix Login");

		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			webDriver = new ChromeDriver();
			extentTest.log(Status.PASS, "Chrome Driver Instantiated");

		} else {
			System.out.println("chrome driver already instantiated!!");

		}

		System.out.println("Inside Tc01");
		webDriver.get("https://learning-qa.citrix.com/#/learning/landing");

	}

	@AfterTest
	public void tearDown() {
		System.out.println("Inside AfterTest");
		extentReports.flush();
		webDriver.quit();
	}

	@BeforeMethod
	public void validateBeforeMethod() {
		System.out.println("inside validate before Method");
	}

	@AfterMethod
	public void validateAfterMethod() {
		System.out.println("inside validate after method");
	}

	@BeforeMethod
	public void validateBeforeClass() {
		System.out.println("inside validate before class");
	}

	@AfterClass
	public void validateAfterClass() {
		System.out.println("Inside validate after class");
	}

}
