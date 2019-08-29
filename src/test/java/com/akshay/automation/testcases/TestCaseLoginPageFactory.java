package com.akshay.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.akshay.automation.pagefactory.LoginPageFactory;
import com.akshay.automation.setup.BaseClass;

import junit.framework.Assert;

public class TestCaseLoginPageFactory extends BaseClass {

	private LoginPageFactory loginPageFactory;

	@Test
	public void tc03() throws Exception {
		System.out.println("Inside Tc01");
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.id("landingLogin")).click();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void tc04() throws Exception {
		System.out.println("Inside Pagefactory");
		loginPageFactory = new LoginPageFactory(webDriver);
		Thread.sleep(10000);
		loginPageFactory.setUserName_pageFactory("s_bhagyalj");
		loginPageFactory.setPassword_pageFactory("Password1!");
		loginPageFactory.clickLogin_pageFactory();
		Thread.sleep(1000);
		Assert.assertEquals("Citrix Education", webDriver.getTitle());
	}

	
}
