package com.tecnotree.automatiom.Listerns;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;

public class Extent {
	

	private static final ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	
	public static ExtentTest getTest() {
		return extentTest.get();
	}

	public static void setTest(ExtentTest test) {
		//Extent.test = test;
		extentTest.set(test);;
	}

	

}
