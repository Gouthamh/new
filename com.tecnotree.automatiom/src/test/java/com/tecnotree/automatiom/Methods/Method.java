package com.tecnotree.automatiom.Methods;

import com.tecnotree.automatiom.SS0_aaccess_token.ResponseFromSSO;
import com.tecnotree.automatiom.Specifications.Specifiactions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.File;


public class Method {
	
	public static Response Post(String requestformate,String BaseUrl,String MiddleUrl,String endpoints) {
		Response response =  RestAssured.given(Specifiactions.Requestspeci(BaseUrl,MiddleUrl))
		.body(requestformate)
		.when()
		.post(endpoints)
		.then()
		.spec(Specifiactions.responsespeci())
		.extract()
		.response();
		
		return response;
	}
	
	public static Response Post(String requestformate,String BaseUrl,String MiddleUrl,String endpoints,String Bearer_tocken) {
		Response response =  RestAssured.given(Specifiactions.Requestspeci(BaseUrl,MiddleUrl))
		.body(requestformate)
        .header("Authorization", "Bearer " + Bearer_tocken)
		.when()
		.post(endpoints)
		.then()
		.spec(Specifiactions.responsespeci())
		.extract()
		.response();
		
		return response;
	}
	
	public static Response Get (String BaseUrl,String MiddleUrl,String endpoints) {
		Response response=RestAssured.given(Specifiactions.Requestspeci(BaseUrl,MiddleUrl))
		.when()
		.get(endpoints)
		.then()
		.spec(Specifiactions.responsespeci())
		.extract()
		.response();
		return response;
	}
	public static Response Put(String requestformate,String BaseUrl,String MiddleUrl, String endpoints) {
		Response response=RestAssured.given(Specifiactions.Requestspeci(BaseUrl,MiddleUrl))
		.when()
		.body(requestformate)
		.put(endpoints)
		.then()
		.spec(Specifiactions.responsespeci())
		.extract()
		.response();
		return response;
	}
	public static Response MultiPathData(String BaseUrl,String MiddleUrl,String endponts,String fileNamePath,String subfolder) {
		Response response = RestAssured.given(Specifiactions.Requestspeci(BaseUrl,MiddleUrl))
		.accept(ContentType.JSON)
		.contentType(ContentType.MULTIPART)
		.formParam("subFolder", subfolder)
		.multiPart("files",new File(fileNamePath))
		.when()
		.post(endponts)
		.then()
		.spec(Specifiactions.responsespeci())
		.extract()
		.response();
		return response;
		
	}
	public static Response MultiPathData(String BaseUrl,String MiddleUrl,String endponts,String fileNamePath) {
		Response response = RestAssured.given(Specifiactions.Requestspeci(BaseUrl,MiddleUrl))
		.accept(ContentType.JSON)
		.contentType(ContentType.MULTIPART)
		.multiPart("files",new File(fileNamePath))
		.when()
		.post(endponts)
		.then()
		.spec(Specifiactions.responsespeci())
		.extract()
		.response();
		return response;
		
	}

}
