package com.trainings.store.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.base.components.BaseTest;
import com.training.homepage.HomePage;
import com.training.homepage.SignInPage;
import com.training.homepage.UserHomePage;

public class StoreTest extends BaseTest {

	@Test
    public void test_calendars_view() throws Exception {
                HomePage obj=new HomePage(getWebDriver());
                SignInPage signin=obj.goToSigninPage();
                UserHomePage userHomePage=signin.goToUserHomePage("automation10.shutterfly@gmail.com", "pass1234");
                System.out.println(userHomePage.getWelcomeMsg());
                assertTrue(userHomePage.getWelcomeMsg().trim().contentEquals("Hi"));
    }
}
