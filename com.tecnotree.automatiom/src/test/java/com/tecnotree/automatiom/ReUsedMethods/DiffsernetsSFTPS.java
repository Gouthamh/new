package com.tecnotree.automatiom.ReUsedMethods;

import java.io.IOException;

import org.testng.Assert;

import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.SFTP_Info;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.DocumentToBase64;
import com.tecnotree.automatiom.utilities.File_upload_services;
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

public class DiffsernetsSFTPS {

	public static void DiffSftp(String fileName, String sftpHost, int sftpPort, String sftpUserName,String sftpPassword, String sshKey, String sftppath,String ServiceName) throws InterruptedException, IOException {

		int IntialCount = (int) SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftppath);
		System.out.println("IntialCount--->" + IntialCount);

		Response response = Method.MultiPathData(Routers.base_url, Routers.dapFileUploadServiceUploadFiles,ServiceName, "Documents/" + fileName);
		Thread.sleep(1000);
		if (response.statusCode() == 200) {
			Assert.assertEquals(response.statusCode(), 200);
			handleSuccessResponse(response,fileName,sftpHost,sftpPort, sftpUserName, sftpPassword, sshKey, sftppath,IntialCount);
		} else if (response.statusCode() == 404) {

			 handleNotFoundResponse_404(response,fileName,sftpHost,sftpPort, sftpUserName, sftpPassword, sshKey, sftppath, IntialCount) ;			
		}
		else if (response.statusCode() == 413) {
			 handleNotFoundResponse_413(response,fileName,sftpHost,sftpPort, sftpUserName, sftpPassword, sshKey, sftppath, IntialCount) ;			
		}
	}
	
	public static void DiffSftp(String fileName, String sftpHost, int sftpPort, String sftpUserName,String sftpPassword, String sshKey, String sftppath,String ServiceName,String SubFolder) throws InterruptedException, IOException {

		int IntialCount = (int) SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftppath);
		System.out.println("IntialCount--->" + IntialCount);

		Response response = Method.MultiPathData(Routers.base_url, Routers.dapFileUploadServiceUploadFiles,ServiceName, "Documents/" + fileName,SubFolder);
		Thread.sleep(1000);
		if (response.statusCode() == 200) {
			Assert.assertEquals(response.statusCode(), 200);
			handleSuccessResponse(response,fileName,sftpHost,sftpPort, sftpUserName, sftpPassword, sshKey, sftppath,IntialCount);
		} else if (response.statusCode() == 404) {

			 handleNotFoundResponse_404(response,fileName,sftpHost,sftpPort, sftpUserName, sftpPassword, sshKey, sftppath, IntialCount) ;			
		}
		else if (response.statusCode() == 413) {
			 handleNotFoundResponse_413(response,fileName,sftpHost,sftpPort, sftpUserName, sftpPassword, sshKey, sftppath, IntialCount) ;			
		}
		
	}
	
	
	public static void handleSuccessResponse(Response response,String fileName,String sftpHost,int sftpPort,String sftpUserName,String sftpPassword,String sshKey,String sftppath,int IntialCount) throws IOException {
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("successFilesList[0]").toString(), fileName);
		long FinalCount = SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftppath);
		Assert.assertEquals(IntialCount + 1, FinalCount, "SFTP File Count Validation");
		
		Assert.assertEquals(File_upload_services.SFTPFileName(sftpUserName, sftpPassword, sftpHost, sftpPort, sshKey, sftppath),fileName, "FileName validation");
		Assert.assertEquals(DocumentToBase64.converterToBase64("Documents/" + fileName),File_upload_services.SFTPFileSftpbase64conversion(sftpUserName, sftpPassword, sftpHost, sftpPort, sshKey, sftppath),"File content by using base64 validation");
		
	}
	public static void handleNotFoundResponse_404(Response response,String fileName,String sftpHost,int sftpPort,String sftpUserName,String sftpPassword,String sshKey,String sftppath,int IntialCount) {
		Assert.assertEquals(response.jsonPath().getString("Status").toString(), "FAILURE");
		
		long FinalCount = SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftppath);
		Assert.assertEquals(IntialCount, FinalCount, "SFTP File Count Validation");
	}
	public static void handleNotFoundResponse_413(Response response,String fileName,String sftpHost,int sftpPort,String sftpUserName,String sftpPassword,String sshKey,String sftppath,int IntialCount) {
		Assert.assertEquals(response.statusCode(), 413);
		
		long FinalCount = SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftppath);
		Assert.assertEquals(IntialCount, FinalCount, "SFTP File Count Validation");
	}

}
