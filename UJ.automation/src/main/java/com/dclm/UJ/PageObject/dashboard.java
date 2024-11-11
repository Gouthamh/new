package com.dclm.UJ.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {

	WebDriver driver;

	public dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "inputBaseBar")
	WebElement search;
	
	public void search(String someid) {
		search.sendKeys(someid);
	}

	@FindBy(xpath = "//input[@value='simServices']")
	WebElement simServices;
	
	public void simServices() {
		simServices.click();
	}
	
	@FindBy(xpath = "//input[@value='nonSimServices']")
	WebElement nonSimServices;
	public void nonSimServices() {
		nonSimServices.click();
	}
	
	@FindBy(xpath = "//input[@value='Jordanian']")
	WebElement Jordanian;
	public void Jordanian() {
		Jordanian.click();
	}
	
	@FindBy(xpath = "//input[@value='F']")
	WebElement nonjordamian;
	public void nonjordamin() {
		nonjordamian.click();
	}
	
	
}
