package com.tecnotree.automatiom.Listerns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listeners implements ITestListener {
	int counter = 0;
	int retryLimit = 4;
	ExtentReports extent = ExtendManger.getInstance();
	private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<>();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String[] groups = result.getMethod().getGroups();
		String groupName;
		ExtentTest child;
		if (groups.length > 0) {
			 child = parentTest.get().createNode(result.getMethod().getMethodName()).assignCategory(groups[0])
					.assignAuthor("Puneeth Raj KR");
		} else {
			 child = parentTest.get().createNode(result.getMethod().getMethodName())
					.assignAuthor("Puneeth Raj KR");
		}
		

		
		test.set(child);

	}

//  @Override
//  public void onTestStart(ITestResult result) {
//      String[] groups = result.getMethod().getGroups();
//      for (String groupName : groups) {
//          ExtentTest child = parentTest.get().createNode(result.getMethod().getMethodName()).assignCategory(groupName).assignAuthor("Puneeth Raj KR");
//          test.set(child);
//      }
//  }

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------");
		test.get()
				.pass("Test passed" + TimeUnit.MILLISECONDS.toMinutes(result.getStartMillis() - result.getEndMillis()));
		// test.get().pass(MarkupHelper.createLabel("test passed",ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.get().fail(MarkupHelper.createLabel("test failed", ExtentColor.RED));
		test.get().fail(MarkupHelper.createCodeBlock(result.getThrowable().getMessage()));
		test.get().fail(MarkupHelper.createCodeBlock(result.getThrowable().getLocalizedMessage()));

		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.get().fail(MarkupHelper.createLabel("test skiped", ExtentColor.YELLOW));

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

//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		System.out.println("===============");
//        List<XmlClass> classes = context.getCurrentXmlTest().getClasses();
//        if(!classes.isEmpty()) {
//        	
//        	 String fullClassName = classes.get(0).getName();
//             String className = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
//             System.out.println("className "+className);
//             ExtentTest parent = extent.createTest(className);
//           parentTest.set(parent);
//        }
//		ITestListener.super.onStart(context);
//	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("===============");
		List<XmlClass> classes = context.getCurrentXmlTest().getClasses();
		if (!classes.isEmpty()) {
			String fullClassName = classes.get(0).getName();
			String className = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
			System.out.println("className " + className);
			ExtentTest parent = extent.createTest(className);
			parentTest.set(parent);

			// Initialize test here
			test.set(parent); // or any other initialization logic you require
		}
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		ITestListener.super.onFinish(context);
	}

}
