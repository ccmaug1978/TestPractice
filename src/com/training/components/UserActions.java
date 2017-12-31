package com.training.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserActions {
	private WebDriver driver;
    
    public UserActions(WebDriver driver) {
           this.driver=driver;
    }
   
    public WebDriver getWebDriver() {
           return driver;
    }
   
    public WebElement locateElementById(String id) {
           return getWebDriver().findElement(By.id(id));
    }
   
    public WebElement locateElementByName(String name) {
           return getWebDriver().findElement(By.name(name));
    }
   
    public WebElement locateElementByLinkText(String linkText) {
           return getWebDriver().findElement(By.linkText(linkText));
    }
   
    public WebElement locateElementByPartialLinkText(String partialLinkText) {
           return getWebDriver().findElement(By.partialLinkText(partialLinkText));
    }
   
    public WebElement locateElementByClassName(String className) {
           return getWebDriver().findElement(By.className(className));
    }
   
    public WebElement locateElementByTagName(String tagName) {
           return getWebDriver().findElement(By.tagName(tagName));
    }
   
    public WebElement locateElementByXpath(String xpathExpression) {
           return getWebDriver().findElement(By.xpath(xpathExpression));
    }
   
    public WebElement locateElementByCssSelector(String CssSelector) {
           return getWebDriver().findElement(By.cssSelector(CssSelector));
    }
   
    public void type(WebElement ele,String chars) {
           ele.clear();
           ele.sendKeys(chars);
    }
}
