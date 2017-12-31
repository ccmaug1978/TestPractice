package com.qtpselenium.facebook.pages.login;


import org.testng.Assert;

import com.qtpselenium.facebook.base.Page;
import com.qtpselenium.facebook.pages.inbox.LandingPage;
import com.qtpselenium.facebook.pages.inbox.TopMenu;



public class LoginPage extends Page {
	
	// null - if login is not success
	// LandingPage - if login is success
	public LandingPage doLogin(String userName,String password){
		try{
			Assert.assertEquals("XXXWelcome to Facebook ó Log in, sign up or learn more", driver.getTitle());
			}catch(Throwable t){
		 Page.takeScreenshot("Login.jpg");
			}
		driver.get(CONFIG.getProperty("URL"));
		System.out.println(isElementPresent("//*[@id='email']"));
		input("EMAIL",userName);
		input("PASS",password);
		click("SUBMIT");
		if(isElementPresent("go_to_profile"))
			return new LandingPage();
		else 
			return null;
	}
	// default - correct , username password
	public LandingPage doLogin(){
		
		return doLogin(CONFIG.getProperty("defaultUserName"),CONFIG.getProperty("defaultPassword"));
	}
	
	
	public void doRegister(){
		
	}
}
