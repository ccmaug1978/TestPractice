package com.training.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.components.UserActions;

public class ventivloginPage extends UserActions {
	
	public ventivloginPage(WebDriver driver)
	{
		super(driver);
        WebDriverWait wait=new WebDriverWait(driver,120);
        driver.switchTo().frame("form-signin");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("uid")));
	}
	
	private WebElement userid=locateElementById("uid");
	private WebElement pwd=locateElementById("pid");
	private WebElement submit=locateElementById("loginButton");
	
	public void enterUsername(String uname) {
        type(userid,uname);
}
	public void enterpassword(String pass) {
        type(pwd,pass);
}

	public VentivUserHomePage goToUserHomePage(String un,String pass) {
        enterUsername(un);
        enterpassword(pass);
        submit.click();
        return new VentivUserHomePage(getWebDriver());
}
	
}
