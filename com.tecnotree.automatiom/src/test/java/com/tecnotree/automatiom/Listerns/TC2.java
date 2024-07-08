package com.tecnotree.automatiom.Listerns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class TC2 implements ITestListener{

@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	ExtentTest test = ExtendManger.getInstance().createTest(result.getMethod().getMethodName());
	Extent.setTest(test);
	System.out.println("-----------------------------");
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------");

		Extent.getTest().log(Status.PASS,result.getMethod().getMethodName());
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Extent.getTest().log(Status.FAIL,result.getMethod().getMethodName());

		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Extent.getTest().log(Status.SKIP,result.getMethod().getMethodName());

		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ExtendManger.getInstance().flush();
		ITestListener.super.onFinish(context);
	}

@Test
	public void test4() {
		System.out.println("---------------------");
	}
}
