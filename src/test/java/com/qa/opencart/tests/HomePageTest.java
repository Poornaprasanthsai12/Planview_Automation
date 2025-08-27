package com.qa.opencart.tests;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.HomePage;

public class HomePageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void login() {
		
		homepage = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		homepage.searchBar("issues");
		homepage.controlsNewRecordCreation();
		homepage.issueCreation("test1", "test2");
		homepage.dropdown_Sourceoverride();
		homepage.sltLeader();
		homepage.switchtoiframe("slt");
		homepage.saveIssue();
	}
	
	

}
