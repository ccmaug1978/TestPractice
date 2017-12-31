package com.training.base.components;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {

	@Before
    public void startUp() throws Exception {
           browseUrl();
    }
   
    private WebDriver driver;
    Properties p;

    public Properties getEnvProperties() throws IOException {
           p=new Properties();
           File f=new File("resources/driver/servers/env.properties");
           FileInputStream fi=new FileInputStream(f.getAbsolutePath());
           p.load(fi);
           return p;
    }
    public WebDriver getDriver() throws IOException {
           p=getEnvProperties();
           String BrowserType=p.getProperty("browser");
           if(BrowserType.contentEquals("firefox")) {
                  driver =new FirefoxDriver();
           } else {
                  if(BrowserType.contentEquals("iehta")) {
                        System.setProperty("webdriver.ie.driver", "driver\\servers\\IEDriverServer.exe");
                        driver=new InternetExplorerDriver();
                  } else {
                        if(BrowserType.contentEquals("chrome")) {
                               System.setProperty("webdriver.chrome.driver", "/Users/muralic/Documents/workspace/Test/Util/chromedriver 2");
                               driver=new ChromeDriver();
                        } else {
                               if(BrowserType.contentEquals("html")) {
                                      driver=new HtmlUnitDriver();
                               } else {
                                      driver=new FirefoxDriver();
                               }
                        }
                  }
           }
           return driver;
    }

    public void browseUrl() throws Exception {
           p=getEnvProperties();
           getDriver().get(p.getProperty("url"));
    }
   
    public WebDriver getWebDriver() {
           return driver;
    }
   
    @After
    public void tearDown() {
           getWebDriver().quit();
    }
}
