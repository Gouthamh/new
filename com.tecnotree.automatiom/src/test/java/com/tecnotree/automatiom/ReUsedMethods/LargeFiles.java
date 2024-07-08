package com.tecnotree.automatiom.ReUsedMethods;

import static org.hamcrest.CoreMatchers.containsString;

import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.Pojo.MasterFiledServiceConfigure;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

public class LargeFiles {
	public static void verifyServiceUpdateAndFileUpload(MasterFiledServiceConfigure master, String sftpHost, int sftpPort,String sftpUserName, String sftpPassword, String sshKey, String sftpPath,String FileName) throws Exception {
		ObjectMapper objMapper = new ObjectMapper();
		String jsonStr = objMapper.writeValueAsString(master);

		Response response = Method.Put(jsonStr, Routers.base_url, Routers.dapFileUploadService,Routers.updateConfiguration);
		assertServiceUpdateResponse(response, master.getServiceName());

		int initialCount = (int) SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftpPath);

		Response uploadResponse = DifferentMethods.PutResquestFile(Routers.base_url, Routers.dapFileUploadServiceUploadFiles,master.getServiceName(), "Documents/"+FileName);
		if(uploadResponse.statusCode()==200) {
		Assert.assertEquals(uploadResponse.statusCode(), 200);
		}
		else if(uploadResponse.statusCode()==413) {
			Assert.assertEquals(uploadResponse.statusCode(), 413);
		}
		else if(uploadResponse.statusCode()==404) {
			Assert.assertEquals(uploadResponse.statusCode(), 404);
		}
		Thread.sleep(1000);

		long finalCount = SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftpPath);
		Assert.assertEquals(initialCount, finalCount);
	}
	
	public static void verifyServiceUpdateAndFileUpload(MasterFiledServiceConfigure master, String sftpHost, int sftpPort,String sftpUserName, String sftpPassword, String sshKey, String sftpPath,String FileName,String SubFolder) throws Exception {
		ObjectMapper objMapper = new ObjectMapper();
		String jsonStr = objMapper.writeValueAsString(master);

		Response response = Method.Put(jsonStr, Routers.base_url, Routers.dapFileUploadService,Routers.updateConfiguration);
		assertServiceUpdateResponse(response, master.getServiceName());

		int initialCount = (int) SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftpPath);

		Response uploadResponse = DifferentMethods.PutResquestFile(Routers.base_url, Routers.dapFileUploadServiceUploadFiles,master.getServiceName(), "Documents/"+FileName,SubFolder);
		if(uploadResponse.statusCode()==200) {
		Assert.assertEquals(uploadResponse.statusCode(), 200);
		}
		else if(uploadResponse.statusCode()==413) {
			Assert.assertEquals(uploadResponse.statusCode(), 413);
		}
		else if(uploadResponse.statusCode()==404) {
			Assert.assertEquals(uploadResponse.statusCode(), 404);
		}
		Thread.sleep(1000);

		long finalCount = SFTP.SFTPCount(sftpHost, sftpPort, sftpUserName, sftpPassword, sshKey, sftpPath);
		Assert.assertEquals(initialCount, finalCount);
	}

	public static void assertServiceUpdateResponse(Response response, String serviceName) {
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("responseStatus"), "SUCCESS");
		Assert.assertEquals(response.jsonPath().getString("responseDesc"),"Service with name :" + serviceName + " updated successfully");
	}

}
