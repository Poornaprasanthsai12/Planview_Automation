package com.qa.opencart.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.AddUserPage;
import com.qa.opencart.pages.CreateResourcePage;
import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.UserInformationPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import static com.qa.opencart.constants.AppConstants.*;

public class CreateResourceTest extends BaseTest{
	
	
	
	@Test(priority=0)
	public void login2() throws InterruptedException {
		
		  //Login Code
		  HomePage doLogin = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"),prop.getProperty("sandbox"));
		  
		  CreateResourcePage resourceAssociated = doLogin.resourceAssociated();
		  
		  
		  resourceAssociated.resource_Create(prop.getProperty("project"),prop.getProperty("userid"),prop.getProperty("fullname"),prop.getProperty("userid"));
		  resourceAssociated.selectdate(prop.getProperty("exp_mont"),prop.getProperty("day"));
		  

		  
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
