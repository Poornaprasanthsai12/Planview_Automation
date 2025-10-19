package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.AddUserPage;
import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.UserInformationPage;

public class CreateUserTest extends BaseTest{
	
	
	@Test
	public void login() throws InterruptedException {
		
		  //Login Code
		  HomePage doLogin = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"),prop.getProperty("sandbox"));
		  
		  //Navigate to add user page
		  AddUserPage user = doLogin.addUser();
		  
		  //filling details on the add user page
		  UserInformationPage userDetails = user.addUserDetails(prop.getProperty("userid"),prop.getProperty("fullname"),prop.getProperty("role"),prop.getProperty("userpassword"));
		  
		  //Assiging Permissions
		  
		  userDetails.workPermissions(prop.getProperty("work"),prop.getProperty("access"));
		  userDetails.strategicPermissions(prop.getProperty("strategic"));
		  userDetails.ActiveOutcomes(prop.getProperty("outcomes"));
		  userDetails.updateAssociated(prop.getProperty("userid"));
		}
		

}
