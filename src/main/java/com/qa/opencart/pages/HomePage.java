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
	private final By controlsapp = By.xpath("//span[@aria-label='Issues']");
	private final By ellipses = By.xpath("(//div[@class='tb-btn ' and @data-icon-pos='right'])[3]");
	private final By newrecordcreation = By.xpath("//div[text()='New Record']");
	private final By issuename = By.xpath("//input[@id='master_DefaultContent_rts_s1274_f2670c']");
	private final By issuedescription = By.xpath("//div[@id='master_DefaultContent_rts_s1274_f2265c_text']");
	private final By sourceoverride_dropdown = By.xpath("//div[@id='master_DefaultContent_rts_s1274_f7068c_ddl']");
	private final By sourceoverride_value = By.xpath("//span[text()='SLOD - Testing']");
	private final By sltLeader = By.xpath("(//td[@class='ActivatorCell'])[6]");
	private final By iframe = By.id("aspiframe-1026-iframeEl");
	private final By iframe_search = By.xpath("//input[@id='txtBox']");
	private final By slt_iiframe = By.xpath("//iframe[@name='lookupWindow']");
	private final By slltuser = By.xpath("//a[text()='User, SLT']");
	private final By iframe_glass = By.xpath("//a[@id='srchBtn']");
	private final By okbutton = By.xpath("//a[text()='OK']");
	private final By save = By.xpath("(//div[@class='tb-btn '])[2]");
	private final By saveifrmae = By.id("advsearchreport-1430-iframeEl");
	
	
	
	
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
		eleUtil.waitForFrameAndSwitchToIt(iframe,AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.waitForAllElementsVisible(ellipses, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(ellipses);
		eleUtil.waitForAllElementsVisible(newrecordcreation, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(newrecordcreation);
		eleUtil.isPageLoaded(AppConstants.LONG_DEFAULT_TIMEOUT);
		
		
	}
	
	
	public void issueCreation(String issuename, String Issue_description) {
		//eleUtil.waitForFrameAndSwitchToIt(iframe,AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.waitForElementPresence(this.issuename, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doSendKeys(this.issuename, issuename);
		eleUtil.clickWithWait(this.issuedescription, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(issuedescription);
		eleUtil.doSendKeys(this.issuedescription, Issue_description);
		
	}
	
	public void dropdown_Sourceoverride() {
		eleUtil.doClick(sourceoverride_dropdown);
		eleUtil.doClick(sourceoverride_value);
	}
	
	public void sltLeader() {
		eleUtil.doClick(sltLeader);
		//eleUtil.returback_fromifrmae();
	}
	
	public void switchtoiframe(String Sltleader) {
		//eleUtil.waitForFrameAndSwitchToIt(iframe,AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.waitForFrameAndSwitchToIt(slt_iiframe, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.clickWhenReady(iframe_search, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(iframe_search);
		eleUtil.doSendKeys(iframe_search, Sltleader);
		eleUtil.doClick(iframe_glass);
		eleUtil.waitForElementPresence(slltuser, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(slltuser);
		eleUtil.doClick(okbutton);
	}
	
	public void saveIssue() {
		eleUtil.returback_fromifrmae();
		eleUtil.waitForFrameAndSwitchToIt(iframe, AppConstants.LONG_DEFAULT_TIMEOUT);
		eleUtil.doClick(save);
		
	}

}
