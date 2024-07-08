package com.tecnotree.automatiom.File.Upload.Service;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.DocumentToBase64;
import com.tecnotree.automatiom.utilities.File_upload_services;
import com.tecnotree.automatiom.utilities.SFTP;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.SFTP_Info;

import io.restassured.response.Response;

public class Test_0001_File_Upload_Service {
	
	
	
	public static void JPEG() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/Sample-JPEG-file-download-for-Testing.JPEG");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "Sample-JPEG-file-download-for-Testing.JPEG");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "Sample-JPEG-file-download-for-Testing.JPEG");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/Sample-JPEG-file-download-for-Testing.JPEG"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void JPG() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/JPG.jpg");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "JPG.jpg");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "JPG.jpg");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JPG.jpg"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void JSON() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/JSON.json");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "JSON.json");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "JSON.json");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void sevenZfile() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/7z.7z");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "7z.7z");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "7z.7z");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	
	public static void BPMN() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/BPMN.bpmn");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "BPMN.bpmn");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "BPMN.bpmn");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void ZIP() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/ZIP.zip");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "ZIP.zip");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "ZIP.zip");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void DMN() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/DMN.dmn");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "DMN.dmn");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "DMN.dmn");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void PNG() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/vi.png");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "vi.png");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "vi.png");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void SQL() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/1-DDL_DML-script+(School+DB).sql");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "1-DDL_DML-script+(School+DB).sql");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "1-DDL_DML-script+(School+DB).sql");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void TAR() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/apache-maven-3.9.2-bin.tar");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "apache-maven-3.9.2-bin.tar");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "apache-maven-3.9.2-bin.tar");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	
	public static void YAML() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/dap-kafka-producer-service.yaml");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "dap-kafka-producer-service.yaml");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "dap-kafka-producer-service.yaml");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void HTML() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/mongotemplate_1713176840471.html");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "mongotemplate_1713176840471.html");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "mongotemplate_1713176840471.html");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void TXT() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/oracel901701790.txt");
		Assert.assertEquals(response.statusCode(), 200);
		
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "oracel901701790.txt");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "oracel901701790.txt");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void CSV() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/oracel83510302348.csv");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "oracel83510302348.csv");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "oracel83510302348.csv");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void XLS() throws IOException, InterruptedException{
		SFTP.sftpremove(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName,SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		int IntialCount = (int) SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		System.out.println("IntialCount--->"+IntialCount);
		
		
		Response response =Method.MultiPathData(Routers.base_url,Routers.dapFileUploadServiceUploadFiles,ServiceName.FileUploadSftp,"Documents/oracel54672913644.xls");
		Assert.assertEquals(response.statusCode(), 200);
		Thread.sleep(1000);
		
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), "oracel54672913644.xls");
		long FinalCount = SFTP.SFTPCount(SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath);
		Assert.assertEquals(IntialCount+1, FinalCount);		
		Assert.assertEquals(File_upload_services.SFTPFileName(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath), "oracel54672913644.xls");
		//Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/JSON.json"), File_upload_services.SFTPFilePath(SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath));
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//JPEG();
		//PEG();
		//JSON();
		//sevenZfile();
		BPMN();
		

}

}
