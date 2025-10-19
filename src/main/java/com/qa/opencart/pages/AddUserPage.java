package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class AddUserPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;

	// 1. private By locators: OR
	
	
	private final By txtUserID = By.xpath("//input[@name='UserID']");
	private final By txtFullName = By.xpath("//input[@name='FullName']");
	private final By txtRole = By.xpath("//input[@id='RoleCode_selectBox']");
	private final By btnRoleSearch = By.xpath("//span[@id='RoleCode_linksearch_inner']");
	private final By timeReporter = By.xpath("//a[text()='Time Reporter']");
	
	private final By txtNewPassword = By.xpath("//input[@name='NewPassword']");
	private final By txtVerifyPassword = By.xpath("//input[@name='VerifyPassword']");
	
	private final By nextLoginCheckBox = By.xpath("//input[@name='MustChangePassword']");
	
	private final By btnSave = By.xpath("//input[@name='Save']");
	
	
	
	
	
	// 2. public page constr...
	public AddUserPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public UserInformationPage addUserDetails(String userID,String fullName, String Role,String Password) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		
		eleUtil.doSendKeys(txtUserID,userID);
		eleUtil.doSendKeys(txtFullName,fullName);
		eleUtil.doSendKeys(txtRole,Role);
		eleUtil.doClick(btnRoleSearch);
		eleUtil.waitForElementPresence(timeReporter, AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(timeReporter);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(txtNewPassword,Password);
		eleUtil.doSendKeys(txtVerifyPassword,Password);
		eleUtil.doClick(nextLoginCheckBox);
		eleUtil.doClick(btnSave);
		
		
		return new UserInformationPage(driver);
		
		
		
	}
	

}
