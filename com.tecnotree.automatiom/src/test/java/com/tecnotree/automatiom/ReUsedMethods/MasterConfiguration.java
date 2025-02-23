package com.tecnotree.automatiom.ReUsedMethods;

import org.bson.Document;
import org.testng.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.Pojo.FileUpload;
import com.tecnotree.automatiom.Pojo.MasterFiledServiceConfigure;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.MongoConnections;

import io.restassured.response.Response;

public class MasterConfiguration {

	public static void FileUploadService(String serviceName, int serviceId, String protocol, int timeout, String nodeId,
			int timeout1, String sftpPath) throws InterruptedException, JsonProcessingException {

		MongoCollection<Document> DAP_FILE_UPLOAD_CONFIG = MongoConnections.connect(Routers.mongoURL,
				Routers.databasename, "DAP_FILE_UPLOAD_CONFIG");

		MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(serviceName, serviceId, protocol, timeout,
				new FileUpload(nodeId, timeout1, sftpPath));
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = Obj.writeValueAsString(master);
		Response response;
		if (!MongoConnections.documentExists(DAP_FILE_UPLOAD_CONFIG, "serviceName", serviceName)) {
			response = Method.Post(jsonStr, Routers.base_url, Routers.dapFileUploadService, Routers.saveConfiguration);
			resposne(response);
			Assert.assertEquals(response.jsonPath().getString("responseDesc").toString(),
					"Service with name :" + serviceName + " saved successfully");
		} else {
			response = Method.Put(jsonStr, Routers.base_url, Routers.dapFileUploadService, Routers.updateConfiguration);
			resposne(response);
			Assert.assertEquals(response.jsonPath().getString("responseDesc").toString(),
					"Service with name :" + serviceName + " updated successfully");
		}
		MongoConnections.closeConnection();
	}

	public static void resposne(Response response) {
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("responseStatus").toString(), "SUCCESS");

	}
}
