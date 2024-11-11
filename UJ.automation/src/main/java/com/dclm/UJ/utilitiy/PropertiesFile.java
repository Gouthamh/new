package com.dclm.UJ.utilitiy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropertiesFile {
	
	
	private static FileInputStream fis;
	private static Properties prop = null;

	public static String getProperty(String property) {		

		try {
			fis = new FileInputStream(new File("src/test/resources/config.properties"));
			prop = new Properties();
			prop.load(fis);
		} catch(FileNotFoundException fnfe) {
			new Throwable("Properties File Not Found", fnfe);
		} catch(IOException ioe) {
			new Throwable("IO Exception while loading Properties File", ioe);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				new Throwable("IO Exception while closing file input stream", e);
			}
		}
		return prop.getProperty(property).trim();
	}
	
	public static void main(String[] args) {
		
		//String relativePath = "/com.Selenium/src/test/resources/config.properties";
		//System.out.println(System.getProperty("user.dir")+relativePath);
		String url = getProperty("BaseUrl");
		System.out.println("---------"+url);
		
	}
}