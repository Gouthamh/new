package com.tecnotree.automatiom.ReUsedMethods;

import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.ServiceName;

import io.restassured.response.Response;

public class DifferentMethods {
	
	public static Response PutResquestFile(String baseUrl,String dapFileUploadServiceUploadFiles,String ServiceNames,String fileName) {
		Response response =Method.MultiPathData(baseUrl,dapFileUploadServiceUploadFiles,ServiceNames,fileName);
		return response;
	}
	public static Response PutResquestFile(String baseUrl,String dapFileUploadServiceUploadFiles,String ServiceNames,String fileName,String SubFolder) {
		Response response =Method.MultiPathData(baseUrl,dapFileUploadServiceUploadFiles,ServiceNames,fileName,SubFolder);
		return response;
	}

}
