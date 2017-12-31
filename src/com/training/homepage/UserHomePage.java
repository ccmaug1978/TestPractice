package com.training.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.components.UserActions;

public class UserHomePage extends UserActions{

	public UserHomePage(WebDriver driver) {
        super(driver);
        WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("welcomeUserMsg")));
}

private WebElement welcomeMsg=locateElementById("sf3-user-dropdown-trigger");

public String getWelcomeMsg() {
return welcomeMsg.getText();
}
}
