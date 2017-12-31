package com.training.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.components.UserActions;

public class ventivHomePage extends UserActions {

	public ventivHomePage(WebDriver driver) {
		super(driver);
		WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@title,'Ventiv')]")));
	}
        public ventivloginPage submit()
        {
        	
        	return new ventivloginPage(getWebDriver());
        	
        }
	}
	
	


