package com.dclm.UJ.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	WebDriver driver;
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement username;
	public void username(String user) {
		username.sendKeys(user);
		
	}
	
	@FindBy(id = "password")
	WebElement password;
	public void password(String pass) {
		password.sendKeys(pass);
		
	}

	@FindBy(id = "submit")
	WebElement submit;
	public void submit() {
		submit.click();
	}
}
