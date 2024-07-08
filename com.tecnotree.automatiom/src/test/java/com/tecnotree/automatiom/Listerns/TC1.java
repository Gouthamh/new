package com.tecnotree.automatiom.Listerns;

import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
@Listeners(com.tecnotree.automatiom.Listerns.Listeners.class)
public class TC1 {
	
	@Test(groups = "name")
	public void one() {

		System.out.println("-----------------");
	}
	
	@Test
	public void two() {

		System.out.println("-----------------");
	}

}
