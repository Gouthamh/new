package com.tecnotree.automatiom.Specifications;

import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.tecnotree.automatiom.Listerns.Extent;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifiactions {
	
	public static RequestSpecification Requestspeci(String BaseUrl,String MiddleUrl) {
		RequestSpecBuilder requestSpecBulider = new RequestSpecBuilder()
				.setBaseUri(BaseUrl)
				.setBasePath(MiddleUrl)
				.setContentType(ContentType.JSON)
				.log(LogDetail.ALL);
		
		return requestSpecBulider.build();
		
	}

	public static ResponseSpecification responsespeci() {
		ResponseSpecBuilder responseSpecBuilder =  new ResponseSpecBuilder()
				//.expectContentType(ContentType.JSON)

				.log(LogDetail.ALL);
		Reporter.log(LogDetail.ALL.toString());
		
		return responseSpecBuilder.build();
		
	}
}
