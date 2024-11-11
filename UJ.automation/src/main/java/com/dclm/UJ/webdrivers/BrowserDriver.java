package com.dclm.UJ.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface BrowserDriver {
	
	  // Method to initialize the browser driver
//    WebDriver initDriver();
    WebDriver ChromeDriver(String URL);
    WebDriver FirefoxDriver(String URL);
    WebDriver EdgeDriver(String URL);
    void quitDriver();
    
    // Method to setup common properties for the driver
//    WebDriver setupDriver();
//
//    // Method to clear browser cache
//    void clearBrowserCache(WebDriver driver);
//    
//    // Method to wait for an element to be clickable
//    void waitForElementToBeClickable(WebElement element, long timeoutInSeconds);
//    
//    // Method to quit the driver
//    void quitDriver();

}
