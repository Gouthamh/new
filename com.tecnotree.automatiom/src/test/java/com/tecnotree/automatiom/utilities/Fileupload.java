package com.tecnotree.automatiom.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Fileupload {

    public static String readFileContent(String filename) throws IOException {
        Path filePath = Paths.get(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filename);
        }

        byte[] fileBytes = Files.readAllBytes(filePath);
        return new String(fileBytes);
    }
    
    public static void main(String args[]) throws IOException {
    	
    	Fileupload f= new Fileupload();
    	System.out.println(Fileupload.readFileContent("NotificationRequestBody/TriggerNotification.json"));

    }
}
