package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class HomePage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;

	// 1. private By locators: OR
	
	
	private final By searchbarapplications = By.xpath("//input[@placeholder='Filter']");
	private final By controlsapp = By.xpath("//span[@aria-label='Controls']");
	private final By newRecord = By.xpath("//div[@data-icon-pos='right' and @class='tb-btn ' and @data-icon='']");
	private final By loginMethodDropDown = By.xpath("//div[ @class='mdc-select__anchor mdc-ripple-upgraded' and @role='button']");
	private final By loginMethodSelect = By.xpath("//li[@data-value='ArcherManualLogin']");

	// 2. public page constr...
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public void searchBar(String applicationName) {
		
		eleUtil.isPageLoaded(AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.waitForAllElementsVisible(searchbarapplications, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(searchbarapplications);
		eleUtil.doSendKeys(searchbarapplications, applicationName);
		eleUtil.doClick(controlsapp);
		eleUtil.waitForAllElementsVisible(controlsapp, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.isPageLoaded(AppConstants.LONG_DEFAULT_TIMEOUT);
		
	}
	
	public void controlsNewRecordCreation() {
		eleUtil.waitForAllElementsVisible(newRecord, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(newRecord);
		
		
	}

}
