package com.dclm.UJ.webdrivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver implements BrowserDriver {

	WebDriver driver;

	public WebDriver ChromeDriver(String URL) {
		ChromeOptions options = new ChromeOptions();
		BrowserOptions(options);
		WebDriver driver = new ChromeDriver(options);
		driver = setDriver(URL, driver);
		clearBrowserCache(driver);
		return setDriver(URL, driver);

	}

	public void BrowserOptions(ChromeOptions options) {
		options.setCapability("acceptInsecureCerts", true);
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
	}

	public WebDriver setDriver(String URL, WebDriver driver) {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;

	}

	public void clearBrowserCache(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.localStorage.clear();");
		js.executeScript("window.sessionStorage.clear();");
		js.executeScript("caches.keys().then(function(names) { for (let name of names) { caches.delete(name); } });");
	}

	public WebDriver FirefoxDriver(String URL) {
		FirefoxOptions options = new FirefoxOptions();
		BrowserOptions(options);
//		options.setCapability("acceptInsecureCerts", true);
//		options.addArguments("disable-infobars");
//		options.addArguments("start-maximized");
		driver = new org.openqa.selenium.firefox.FirefoxDriver(options);
//		driver.get(URL);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return setDriver(URL, driver);

	}

	public void BrowserOptions(FirefoxOptions options) {
		options.setCapability("acceptInsecureCerts", true);
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
	}

	public WebDriver EdgeDriver(String URL) {

		EdgeOptions options = new EdgeOptions();
//		options.setCapability("acceptInsecureCerts", true);
//		options.addArguments("disable-infobars");
//		options.addArguments("start-maximized");
		BrowserOptions(options);

		WebDriver driver = new EdgeDriver(options);

		return setDriver(URL, driver);
	}

	public void BrowserOptions(EdgeOptions options) {
		options.setCapability("acceptInsecureCerts", true);
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
	}

	public void quitDriver() {
		if (driver != null) {
			try {
				driver.close();
				driver.quit(); // fails in current geckodriver! TODO: Fixme
			} catch (NoSuchMethodError nsme) { // in case quit fails
			} catch (NoSuchSessionException nsse) { // in case close fails
			} catch (SessionNotCreatedException snce) {
			} // in case close fails
			driver = null;
		}

	}

}
