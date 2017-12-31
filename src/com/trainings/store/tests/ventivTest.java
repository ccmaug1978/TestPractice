package com.trainings.store.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.training.base.components.BaseTest;
import com.training.homepage.SignInPage;
import com.training.homepage.UserHomePage;
import com.training.homepage.VentivUserHomePage;
import com.training.homepage.gmailHomePage;
import com.training.homepage.ventivHomePage;
import com.training.homepage.ventivloginPage;

public class ventivTest extends BaseTest {
	@Test
	 public void test_calendars_view() throws Exception {
		ventivHomePage obj=new ventivHomePage(getWebDriver());
		ventivloginPage signin=obj.submit();
		VentivUserHomePage userHomePage=signin.goToUserHomePage("MURALI.CHENNAVERAPPA", "Password!2");
		System.out.println(userHomePage.getWelcomeMsg());
	
	}

}
