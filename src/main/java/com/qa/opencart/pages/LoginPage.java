package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

import static com.qa.opencart.constants.AppConstants.*;

public class LoginPage {
	private WebDriver driver;
	private ElementUtil eleUtil;

	// 1. private By locators: OR
	
	
	private final By username = By.id("Username");
	private final By password = By.id("UserPass");
	
	private final By sandBoxDropDown = By.xpath("//select[@name='DSN']");
	private final By btnSignIn = By.xpath("//button[@title=' Sign In ']");

	// 2. public page constr...
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

//	// 3. public page actions/methods
//	@Step("getting login page title")
//	public String getLoginPageTitle() {
//		String title = eleUtil.waitFotTitleIs(LOGIN_PAGE_TITLE, DEFAULT_TIMEOUT);
//		System.out.println("login page title: " + title);
//		return title;
//	}
//
//	@Step("getting login page url")
//	public String getLoginPageURL() {
//		String url = eleUtil.waitForURLContains(LOGIN_PAGE_FRACTION_URL, DEFAULT_TIMEOUT);
//		System.out.println("login page url: " + url);
//		return url;
//	}
	
	
	public HomePage doLogin(String uname, String Password, String Sandbox) throws InterruptedException {
		
		//eleUtil.doClick(sandBoxDropDown);
		eleUtil.doSelectDropDownByValue(sandBoxDropDown, Sandbox);
		
		
		
		eleUtil.doSendKeys(username, uname);
		
		eleUtil.doSendKeys(password, Password);
		eleUtil.doClick(btnSignIn);
		
		return new HomePage(driver);
		
	}

	


	
	
	
	
	
}
