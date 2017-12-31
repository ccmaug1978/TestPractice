package com.training.homepage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.components.UserActions;

public class HomePage extends UserActions {
	public HomePage(WebDriver driver) throws IOException {
        super(driver);
        WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
}

private WebElement getSignInLink() {
        return locateElementByLinkText("Sign in");
        }

public SignInPage goToSigninPage() {
        getSignInLink().click();
        return new SignInPage(getWebDriver());
}

}
