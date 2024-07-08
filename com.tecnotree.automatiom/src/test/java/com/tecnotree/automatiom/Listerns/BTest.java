package com.tecnotree.automatiom.Listerns;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

public class BTest {
	

	public void setUp(ITestResult result) {
		ExtentTest test = ExtendManger.getInstance().createTest("sdsf");
		System.out.println("----------------->"+test.getStatus());
		Extent.setTest(test);
	}
	

	public void tearDown() {
		ExtendManger.getInstance().flush();
	}

}
