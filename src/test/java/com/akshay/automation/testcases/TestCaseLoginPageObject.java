package com.akshay.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.akshay.automation.pageobjects.LoginPage;
import com.akshay.automation.setup.BaseClass;

import junit.framework.Assert;

public class TestCaseLoginPageObject extends BaseClass {

	private LoginPage loginPage ;

	
	@Test
	public void tc01() throws Exception {
		System.out.println("Inside Tc02");
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.id("landingLogin")).click();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void tc02() throws Exception {
		System.out.println("Inside Pageobject");
		loginPage = new LoginPage(webDriver);
		loginPage.setUserName("s_bhagyalj");
		loginPage.setPassword("Password1!");
		loginPage.clickLogin();
		Thread.sleep(1000);
		Assert.assertEquals("Citrix Education", webDriver.getTitle());
	}

	
}
