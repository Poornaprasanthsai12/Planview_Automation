package com.qa.opencart.tests;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import static com.qa.opencart.constants.AppConstants.*;

public class LoginPageTest extends BaseTest{
	
//	@Test
//	public void loginPageTitleTest() {
//		String actTitle = loginPage.getLoginPageTitle();
//		ChainTestListener.log("checking login page title: "+ actTitle);
//		AssertJUnit.assertEquals(actTitle, LOGIN_PAGE_TITLE);
//	}
//	
//	
//	@Test
//	public void loginPageURLTest() {
//		String actURL = loginPage.getLoginPageURL();
//		AssertJUnit.assertTrue(actURL.contains(LOGIN_PAGE_FRACTION_URL));
//	}
	
	@Test
	public void login() {
		
	  loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	
	
	
	
	
	
	

}
