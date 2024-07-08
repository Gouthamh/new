package com.tecnotree.automatiom.Listerns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestNGListernsManagers extends BTest {

	@Test
	public void tesss() {
		
		//ExtentTest test = ExtendManger.getInstance().createTest("first");
		Extent.getTest().generateLog(Status.PASS, "dfgh");
		Extent.getTest().generateLog(Status.INFO, "dfgh1");
		//Extent.getTest().generateLog(Status.FAIL, "dfgh2");
		//Extent.getTest().generateLog(Status.SKIP, "dfgh3");
		//Extent.getTest().generateLog(Status.WARNING, "dfgh4");




		
		
	}


}
