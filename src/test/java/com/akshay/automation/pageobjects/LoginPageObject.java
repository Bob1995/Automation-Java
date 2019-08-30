package com.akshay.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.akshay.automation.setup.BaseClass;

public class LoginPageObject extends BaseClass {

	By userName = By.id("userName");
	By password = By.id("password");
	By loginButton = By.cssSelector("[value='Sign in']");

	public LoginPageObject(WebDriver webDriver) {
		this.webDriver=webDriver;
	}

	public void setUserName(String uName) {
		webDriver.findElement(userName).sendKeys(uName);

	}

	public void setPassword(String pwd) {
		webDriver.findElement(password).sendKeys(pwd);

	}

	public void clickLogin() {

		webDriver.findElement(loginButton).click();
	}
}
