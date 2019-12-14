package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.HomePage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_Amazon extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName="Login Logout (POM)";
		testcaseDec = "Login and Logout to Leaftaps";
		author="Balaji";
		category="smoke";
		
	}
	
	@Test()
	public void runTC001() {
		new HomePage().search()
		.addtoCart()
		.Verify()
		.login();
		

	}

}
