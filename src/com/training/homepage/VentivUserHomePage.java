package com.training.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.components.UserActions;

public class VentivUserHomePage extends UserActions {
	public VentivUserHomePage(WebDriver driver) {
        super(driver);
        WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//id[contains(text(),'My')]")));
}
	private WebElement welcomeMsg=locateElementByXpath(".//id[contains(text(),'My')]");

	public String getWelcomeMsg() {
	return welcomeMsg.getText();
	}

}
