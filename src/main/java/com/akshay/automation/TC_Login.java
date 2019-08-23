package com.akshay.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_Login extends BaseClass {

	@Test
	public void tc01() {
		System.out.println("Inside Tc01");
		webDriver.get("https://learning-qa.citrix.com/#/learning/landing");
	}

	@Test
	public void tc02() throws Exception {
		System.out.println("Inside Tc02");
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.id("landingLogin")).click();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.id("userName")).sendKeys("s_bhagyalj");
		webDriver.findElement(By.id("password")).sendKeys("Password1!");
		webDriver.findElement(By.cssSelector("[value='Sign in']")).click();

		Thread.sleep(10000);

		System.out.println(webDriver.getTitle());
		Assert.assertEquals("Citrix Education", webDriver.getTitle());
		System.out.println(webDriver.getCurrentUrl());
	
	}

}
