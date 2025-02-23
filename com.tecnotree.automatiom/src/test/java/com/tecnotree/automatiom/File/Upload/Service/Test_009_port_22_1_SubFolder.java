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
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

public class Test_009_port_22_1_SubFolder {
	
	@BeforeClass
	public void masterDataUpdate() throws JsonProcessingException {
		MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.localHost22,7,"SFTP",5000,new FileUpload("3067",500,"/home/tecnotree/"));
		
        ObjectMapper Obj = new ObjectMapper();  
        String jsonStr = Obj.writeValueAsString(master);
  
        Response response=Method.Put(jsonStr, Routers.base_url,Routers.dapFileUploadService,Routers.updateConfiguration);
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("responseStatus").toString(), "SUCCESS");
		Assert.assertEquals(response.jsonPath().getString("responseDesc").toString(), "Service with name :"+ServiceName.localHost22+" updated successfully");


	}

	@BeforeMethod
	public void sftpremove() {
		SFTP.sftpremove(SFTP_Info.sftpHost_10_4_3_95, SFTP_Info.sftpPort_22, SFTP_Info.sftpUserName_10_4_3_95_22, SFTP_Info.sftpPassword10_4_3_95_22,SFTP_Info.sshKey_10_4_3_95, SFTP_Info.sftppath_10_4_3_95);

	}
	
@Test(groups = "JSON")
	public void JSON() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("JSON.json",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "SQL")
	public void SQl() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("1-DDL_DML-script+(School+DB).sql",ServiceName.localHost22,"bulk-store");
	}
	@Test	(groups = "TAR")
	public void tar() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("apache-maven-3.9.2-bin.tar",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "BPMN")
	public void BPMN() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("BPMN.bpmn",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "YMAL")
	public void YMAL() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("dap-kafka-producer-service.yaml", ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "DMN")
	public void DMN() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("DMN.dmn",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "JPG")
	public void JPG() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("HD-wallpaper-thar-car-wagon-wrangler.jpg",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "HTML")
	public void HTML() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("mongotemplate_1713176840471.html",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "XLX")
	public void XLX() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("oracel54672913644.xls",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "CSV")
	public void CSV() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("oracel83510302348.csv",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "TXT")
	public void TXT() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("oracel901701790.txt",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "JPEG")
	public void JPEG() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("Sample-JPEG-file-download-for-Testing.JPEG",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "PNG")
	public void PNG() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("vi.png",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "ZIP")
	public void ZIP() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("ZIP.zip",ServiceName.localHost22,"bulk-store");
	}
	@Test(groups = "SevenZFile")
	public void SevenZFile() throws InterruptedException, IOException {
		DiffsentsFiles.differentMethods2("7z.7z",ServiceName.localHost22,"bulk-store");
	}
}
