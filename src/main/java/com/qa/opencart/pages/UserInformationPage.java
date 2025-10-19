package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class UserInformationPage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;

		
	//workpermissions
	private final By btnAddWork = By.xpath("(//a[text()='Add'])[1]");
	private final By txtWork = By.xpath("//input[@id='Code_selectBox']");
	private final By btnSearch = By.xpath("//span[@id='Code_linksearch_inner']");
	private final By activeEnterprise = By.xpath("//a[text()='Active Enterprise Area']");
	private final By accessDropDown = By.xpath("//select[@class='selectBox']");
	private final By checkBoxRestrict = By.xpath("//input[@name='RF']");
	private final By btnSave = By.xpath("//input[@id='btnSave']");
	
	
	
	
	
	//strategic permissions
	
	private final By btnAddStrategic = By.xpath("(//a[text()='Add'])[4]");
	private final By breadGoals = By.xpath("//a[text()='Bread Financials Goals']");
	
	
	//outcomePermissions
	
	private final By btnAddOutcomes = By.xpath("(//a[text()='Add'])[5]");
	private final By activeOutcomes = By.xpath("//a[text()='Active Outcomes']");
	
	
			
	private final By updateRe = By.xpath("(//a[text()='Update'])[6]");
		
	private final By txtexistingResource = By.xpath("//input[@id='ResourceCodeSelf_selectBox']");
	private final By associatedSearch = By.xpath("//span[@id='ResourceCodeSelf_linksearch_inner']");
	private final By resultsdropdown = By.xpath("//a[@id='searchAnchor_0']");
	
	
	
	
	
	
	// 2. public page constr...
	public UserInformationPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public void workPermissions(String work,String value) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		
		eleUtil.doClick(btnAddWork);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(txtWork,work);
		eleUtil.clickWhenReady(btnSearch,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.waitForElementPresence(activeEnterprise,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(activeEnterprise);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.clickWhenReady(accessDropDown,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSelectDropDownByValue(accessDropDown, value);
		eleUtil.doClick(checkBoxRestrict);
		eleUtil.doClick(btnSave);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		
		
		
		
	}
	
	public void strategicPermissions(String value1) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(btnAddStrategic);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(txtWork,value1);
		eleUtil.clickWhenReady(btnSearch,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.waitForElementPresence(breadGoals,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(breadGoals);
		eleUtil.doClick(btnSave);

		
	}
	
	public void ActiveOutcomes(String value2) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(btnAddOutcomes);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(txtWork,value2);
		eleUtil.clickWhenReady(btnSearch,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.waitForElementPresence(activeOutcomes,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(activeOutcomes);
		eleUtil.doClick(btnSave);

		
	}
	public void updateAssociated(String value3) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(updateRe);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(txtexistingResource,value3);
		eleUtil.clickWhenReady(associatedSearch,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.waitForElementPresence(resultsdropdown,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(resultsdropdown);
		eleUtil.doClick(btnSave);

		
	}

}
