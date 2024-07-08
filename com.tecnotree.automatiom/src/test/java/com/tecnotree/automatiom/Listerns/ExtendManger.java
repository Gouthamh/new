package com.tecnotree.automatiom.Listerns;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendManger {
	static ExtentReports report;

	public static ExtentReports getInstance() {

		if (report == null) {
			ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
			report = new ExtentReports();
			spark.config().setTheme(Theme.DARK);
			spark.config().setTimeStampFormat("MMM d, yyyy hh:mm:ss a");
			spark.config().setDocumentTitle("FileUploadServiceAutomationTestDocument");
			spark.config().setEncoding("UTF-8");
			report.attachReporter(spark);
		}
		return report;

}
}
