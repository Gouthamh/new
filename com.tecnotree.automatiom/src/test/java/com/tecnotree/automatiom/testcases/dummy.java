package com.tecnotree.automatiom.testcases;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.utilities.Fileupload;


public class dummy {
	
	RequestSpecification requestspecification;
	ResponseSpecification responsespecification;
	Fileupload files= new Fileupload();

	
	@Test
	public void Notification() throws IOException {
    	String endpoints = Routers.notification_bulk_service+"/"+Routers.triggerBulkService;
    	System.out.println(endpoints);
    	Response response =Method.Post(Fileupload.readFileContent("NoitifcationrequestPayload.json"),Routers.base_url,Routers.dapBulkProcess, endpoints);
    	Assert.assertEquals(response.statusCode(), 200);
    	Assert.assertEquals(response.jsonPath().getString("response").toString(), "notification-bulk-service triggered Successfully");
    	
	}
	@Test
	public void getmethod() {
		Response response=Method.Get(Routers.base_url,Routers.dapBulkProcess,"/configure/fetchAllMasterConfiguratoins");
		Assert.assertEquals(response.statusCode(), 200);
	}
	@Test
	public void putmethod() throws IOException {
		Response response=Method.Put(Fileupload.readFileContent("BulkConfigu.json"), Routers.base_url,Routers.dapBulkProcess,"/configure/UpdateBulkMasterConfig");
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("msg").toString(), "Bulk master configuration successfuly updated into DB");
			}
	@Test
	public void form_data() throws IOException{
    	 String endpoints = Routers.notification_bulk_service+"/"+Routers.fileUploadToProcessBulkData;

		Response response =Method.MultiPathData("files.csv", Routers.base_url,Routers.dapBulkProcess,endpoints,"909");
		Assert.assertEquals(response.statusCode(), 200);
		
		
		
	}

}
