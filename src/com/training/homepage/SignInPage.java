package com.training.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.components.UserActions;

public class SignInPage extends UserActions {
	
	public SignInPage(WebDriver driver) {
        super(driver);
        WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
}

private WebElement un=locateElementById("userName");
private WebElement pwd=locateElementById("password");
private WebElement signinBtn=locateElementById("signInButton");

public void enterUsername(String uname) {
        type(un,uname);
}

public void enterPassword(String pass) {
        type(pwd,pass);
}

public UserHomePage goToUserHomePage(String un,String pass) {
        enterUsername(un);
        enterPassword(pass);
        signinBtn.click();
        return new UserHomePage(getWebDriver());
}


}
