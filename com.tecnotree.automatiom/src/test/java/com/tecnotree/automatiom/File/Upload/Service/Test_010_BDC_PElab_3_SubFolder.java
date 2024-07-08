package com.tecnotree.automatiom.File.Upload.Service;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.Pojo.FileUpload;
import com.tecnotree.automatiom.Pojo.MasterFiledServiceConfigure;
import com.tecnotree.automatiom.ReUsedMethods.DiffsentsFiles;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.SFTP_Info;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.Fileupload;
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

public class Test_010_BDC_PElab_3_SubFolder {
	
	@BeforeClass
	public void masterDataUpdate() throws JsonProcessingException {
		MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.FileUploadSftp,3,"SFTP",5000,new FileUpload("7441",500,"/bulk-store/"));
		
        ObjectMapper Obj = new ObjectMapper();  
        String jsonStr = Obj.writeValueAsString(master);
  
        Response response=Method.Put(jsonStr, Routers.base_url,Routers.dapFileUploadService,Routers.updateConfiguration);
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("responseStatus").toString(), "SUCCESS");
		Assert.assertEquals(response.jsonPath().getString("responseDesc").toString(), "Service with name :"+master.getServiceName()+" updated successfully");


	}

	@BeforeMethod
	public void sftpremove() {
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);

	}
	
@Test(groups = "JSON")
	public void JSON() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("JSON.json",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "SQL")
	public void SQl() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("1-DDL_DML-script+(School+DB).sql",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test	(groups = "TAR")
	public void tar() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("apache-maven-3.9.2-bin.tar",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "BPMN")
	public void BPMN() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("BPMN.bpmn",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "YAML")
	public void YMAL() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("dap-kafka-producer-service.yaml", ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "DMN")
	public void DMN() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("DMN.dmn",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "JPG")
	public void JPG() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("HD-wallpaper-thar-car-wagon-wrangler.jpg",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "HTML")
	public void HTML() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("mongotemplate_1713176840471.html",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "XLX")
	public void XLX() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("oracel54672913644.xls",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "CSV")
	public void CSV() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("oracel83510302348.csv",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "TXT")
	public void TXT() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("oracel901701790.txt",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "JPEG")
	public void JPEG() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("Sample-JPEG-file-download-for-Testing.JPEG",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "PNG")
	public void PNG() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("vi.png",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "ZIP")
	public void ZIP() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("ZIP.zip",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	@Test(groups = "SevenZFile")
	public void SevenZFile() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods("7z.7z",ServiceName.FileUploadSftp,"Automation_dont_delete..!");
	}
	
}
