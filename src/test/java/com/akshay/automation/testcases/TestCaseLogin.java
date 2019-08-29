package com.akshay.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.akshay.automation.pageobjects.LoginPage;
import com.akshay.automation.setup.BaseClass;

import junit.framework.Assert;

public class TestCaseLogin extends BaseClass {

	private LoginPage loginPage = new LoginPage(webDriver);

	@Test
	public void tc01_validateLogin() throws Exception {
		System.out.println("Inside Tc02");
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.id("landingLogin")).click();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void tc03() throws Exception {
		webDriver.findElement(By.id("userName")).sendKeys("s_bhagyalj");
		webDriver.findElement(By.id("password")).sendKeys("Password1!");
		webDriver.findElement(By.cssSelector("[value='Sign in']")).click();
		Thread.sleep(10000);
	}

	@Test
	public void tc04() throws Exception {
		loginPage.setUserName("s_bhagyalj");
		loginPage.setPassword("Password1!");
		loginPage.clickLogin();
		Thread.sleep(10000);
		Assert.assertEquals("Citrix Education", webDriver.getTitle());
	}

}
