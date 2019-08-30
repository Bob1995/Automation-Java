package com.akshay.automation.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.akshay.automation.setup.BaseClass;

public class LoginPageFactory extends BaseClass {

	@FindBy(id = "userName")
	WebElement userName_pageFactory;

	@FindBy(id = "password")
	WebElement password_pageFactory;

	@FindBy(css = "[value='Sign in']")
	WebElement loginButton_pageFactory;

	public LoginPageFactory(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void setUserName_pageFactory(String uName) {
		userName_pageFactory.sendKeys(uName);
	}

	public void setPassword_pageFactory(String pwd) {

		password_pageFactory.sendKeys(pwd);
	}

	public void clickLogin_pageFactory() {

		loginButton_pageFactory.click();
	}
}
