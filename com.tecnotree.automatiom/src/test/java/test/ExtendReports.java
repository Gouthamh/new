package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.Pojo.FileUpload;
import com.tecnotree.automatiom.Pojo.MasterFiledServiceConfigure;
import com.tecnotree.automatiom.ReUsedMethods.DiffsentsFiles;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.SFTP_Info;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

public class ExtendReports {
	ExtentReports extent ;
    ExtentSparkReporter spark ;
	@Test
	public void tess() {


	    
	     extent = new ExtentReports();
	     spark = new ExtentSparkReporter("spark.html")
	    		 
	    		  .viewConfigurer()
	    		  
	    		    .viewOrder()
	    		    .as(new ViewName[] { 
	    			   ViewName.DASHBOARD, 
	    			   ViewName.TEST, 
	    			   ViewName.AUTHOR, 
	    			   ViewName.DEVICE, 
	    			   ViewName.EXCEPTION, 
	    			   ViewName.LOG 
	    			})
	    		  .apply();       
	    extent.attachReporter(spark);
	    
	}

//	@BeforeClass
//	public void masterDataUpdate() throws JsonProcessingException {
//		MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.FileUploadSftp, 3, "SFTP",
//				5000, new FileUpload("7441", 500, SFTP_Info.sftppath));
//
//		ObjectMapper Obj = new ObjectMapper();
//		String jsonStr = Obj.writeValueAsString(master);
//
//		Response response = Method.Put(jsonStr, Routers.base_url, Routers.dapFileUploadService,
//				Routers.updateConfiguration);
//		Assert.assertEquals(response.statusCode(), 200);
//		Assert.assertEquals(response.jsonPath().getString("responseStatus").toString(), "SUCCESS");
//		Assert.assertEquals(response.jsonPath().getString("responseDesc").toString(),
//				"Service with name :" + master.getServiceName() + " updated successfully");
//
//	}
//
//	@BeforeMethod
//	public void sftpremove() {
//		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName,
//				SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
//
//	}
//
//	@Test
//	public void JSON() throws InterruptedException, IOException {
//		DiffsentsFiles.differentMethods("JSON.json", ServiceName.FileUploadSftp);
//
//		 extent.createTest("LogLevels")
//	        .pass("This test is created as a toggle as part of a child test of 'ParentWithChild'");
//
//
//	}
	
	@AfterMethod
	public void fleash() {
        extent.flush();
	}
}
