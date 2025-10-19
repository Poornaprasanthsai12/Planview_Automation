package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;



public class CreateResourcePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	

	private final By select_Resource = By.xpath("//input[@id='ParentCode_selectBox']");
	private final By planView_Value = By.xpath("//a[text()='Planview']");
	private final By Search = By.xpath("//span[@id='ParentCode_linksearch_inner']");
	private final By txtResource = By.xpath("//input[@name='ResourceDesc']");
	private final By txtAssociatedAid = By.xpath("//input[@name='ShortName']");
	
	private final By calender = By.xpath("//select[@name='Calendar']");
	private final By user_search = By.xpath("//input[@id='btnSearch']");
	
	private final By resourceAssociatedUsers = By.xpath("//span[text()='Resources and Associated Users']");
	
	private final By start = By.xpath("//input[@name='EmploymentStart']/following-sibling::a");
	
	private final By save = By.xpath("//input[@id='btnSave']");
	
	
	// 2. public page constr...
	public CreateResourcePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public void resource_Create(String project, String name, String aId, String location) {
		
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(select_Resource,project);
		eleUtil.clickWhenReady(Search,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.waitForElementPresence(planView_Value,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doClick(planView_Value);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
		
		eleUtil.waitForElementPresence(txtResource,AppConstants.DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(txtResource,name);
		eleUtil.doSendKeys(txtAssociatedAid,aId);
		
		eleUtil.doSelectDropDownByValue(calender, location);
		
		eleUtil.doClick(start);
		
		
	}
	
	public void selectdate(String month, String day ) {
		eleUtil.selectDate(month, day);
		eleUtil.doClick(save);
		eleUtil.isPageLoaded(AppConstants.DEFAULT_TIMEOUT);
	}

}
