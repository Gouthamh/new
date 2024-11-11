package com.dclm.UJ.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dclm.UJ.PageObject.dashboard;
import com.dclm.UJ.PageObject.login;
import com.dclm.UJ.webdrivers.BrowserType;
import com.dclm.UJ.webdrivers.WebDrivers;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        WebDrivers webdrivers = new WebDrivers();
        WebDriver driver = webdrivers.setDriver(BrowserType.CHROME, "https://fit.pe-lab4.bdc-rancher.tecnotree.com/dclm-web-ui/dashboard");
        String title = driver.getTitle();
        System.out.println(title);
        login log = new login(driver);
        log.username("professor");
        log.password("Tecnotree@123");
        log.submit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='nonSimServices']"))).click();

        
        //webdrivers.quitDriver();
    }
    
}
