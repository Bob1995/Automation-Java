package com.akshay.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.akshay.automation.config.ConfigProperties;
import com.akshay.automation.setup.BaseClass;

public class LoginPageObject extends BaseClass {

	private ConfigProperties configProperties;

	public LoginPageObject(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void setUserName(String uName) throws Exception {
		configProperties = new ConfigProperties();
		By userName = By.id(configProperties.readFile().getProperty("login.userName"));
		webDriver.findElement(userName).sendKeys(uName);

	}

	public void setPassword(String pwd) throws Exception {
		configProperties = new ConfigProperties();
		By password = By.id(configProperties.readFile().getProperty("login.password"));
		webDriver.findElement(password).sendKeys(pwd);

	}

	public void clickLogin() throws Exception {
		configProperties = new ConfigProperties();
		By loginButton = By.cssSelector(configProperties.readFile().getProperty("login.clickButton"));
		webDriver.findElement(loginButton).click();
	}
}
