package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class HomePage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	

	// 1. private By locators: OR
	
	
	private final By menuHeader = By.xpath("//div[@aria-label='Navigation breadcrumb']/button");
	private final By administration = By.xpath("(//ul[@id='pv-menu-list']/li)[10]");
	private final By user_Roles = By.xpath("//span[text()='Users and Roles']");
	private final By configureUsers = By.xpath("//span[text()='Configure Users']");
	private final By addUser = By.xpath("(//ul[@aria-label='Users and Roles']/li)[1]");
	
	private final By txt_input_user = By.xpath("//input[@class='inputBox']");
	private final By user_search = By.xpath("//input[@id='btnSearch']");
	
	private final By resourceAssociatedUsers = By.xpath("//span[text()='Resources and Associated Users']");
	
	//private final WebElement createResource = (WebElement) By.xpath("//a[text()='Create Resource']");
	
	private final By createResource2 = By.xpath("//a[text()='Create Resource']");
	
	
	
	
	
	
	
	
	
	// 2. public page constr...
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		
		
	}
	
	public AddUserPage addUser() {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(menuHeader);
		eleUtil.waitForElementVisible(administration,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(administration);
		eleUtil.waitForElementVisible(user_Roles,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(user_Roles);
		eleUtil.waitForElementVisible(addUser,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(addUser);
		
		return new AddUserPage(driver);
		
	}
	
     public AddUserPage configureUser(String fullName) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(menuHeader);
		eleUtil.waitForElementVisible(administration,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(administration);
		eleUtil.waitForElementVisible(user_Roles,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(user_Roles);
		eleUtil.waitForElementVisible(configureUsers,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(configureUsers);
		
		eleUtil.doSendKeys(txt_input_user,fullName);
		eleUtil.doClick(user_search);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		
		return new AddUserPage(driver);
		
	}
     
     public CreateResourcePage resourceAssociated() {
 		
 		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
 		eleUtil.doClick(menuHeader);
 		eleUtil.waitForElementVisible(administration,AppConstants.DEFAULT_TIMEOUT);
 		eleUtil.doClick(administration);
 		eleUtil.waitForElementVisible(user_Roles,AppConstants.DEFAULT_TIMEOUT);
 		eleUtil.doClick(user_Roles);
 		eleUtil.waitForElementVisible(resourceAssociatedUsers,AppConstants.DEFAULT_TIMEOUT);
 		eleUtil.doClick(resourceAssociatedUsers);
 		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
 		eleUtil.waitForElementVisible(createResource2,AppConstants.DEFAULT_TIMEOUT);
 		eleUtil.doClick(createResource2);
 		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
 		
 		
 		
 		
 		return new CreateResourcePage(driver);
 		
 	}
	
	
	

}
