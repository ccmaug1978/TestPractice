package com.trainings.store.tests;

import org.junit.Test;

import com.training.base.components.BaseTest;

import com.training.homepage.gmailHomePage;

public class gmailTest extends BaseTest{
	@Test
	 public void test_calendars_view() throws Exception {
	gmailHomePage obj=new gmailHomePage(getWebDriver());
	}
}
