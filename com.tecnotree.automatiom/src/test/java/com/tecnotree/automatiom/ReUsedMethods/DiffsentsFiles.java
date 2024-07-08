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

public class DiffsentsFiles {

	public static void differentMethods(String fileName, String ServiceName) throws InterruptedException, IOException {

		DiffsernetsSFTPS.DiffSftp(fileName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703,SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath,ServiceName);

	}

	public static void differentMethods(String fileName, String ServiceName, String SubFolder)throws InterruptedException, IOException {

		DiffsernetsSFTPS.DiffSftp(fileName, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703,SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath,ServiceName, SubFolder);

	}

	public static void differentMethods1(String fileName, String ServiceName) throws InterruptedException, IOException {

		DiffsernetsSFTPS.DiffSftp(fileName, SFTP_Info.sftpHost_172_20_21_227, SFTP_Info.sftpPort_22,SFTP_Info.sftpUserName_172_20_21_227, SFTP_Info.sftpPassword_172_20_21_227,SFTP_Info.sshKey_172_20_21_227, SFTP_Info.sftppath_172_20_21_227, ServiceName);

	}

	public static void differentMethods1(String fileName, String ServiceName, String SubFolder)throws InterruptedException, IOException {

		DiffsernetsSFTPS.DiffSftp(fileName, SFTP_Info.sftpHost_172_20_21_227, SFTP_Info.sftpPort_22,SFTP_Info.sftpUserName_172_20_21_227, SFTP_Info.sftpPassword_172_20_21_227,SFTP_Info.sshKey_172_20_21_227, SFTP_Info.sftppath_172_20_21_227, ServiceName, SubFolder);

	}

	public static void differentMethods2(String fileName, String ServiceName) throws InterruptedException, IOException {

		DiffsernetsSFTPS.DiffSftp(fileName, SFTP_Info.sftpHost_10_4_3_95, SFTP_Info.sftpPort_22,SFTP_Info.sftpUserName_10_4_3_95_22, SFTP_Info.sftpPassword10_4_3_95_22, SFTP_Info.sshKey_10_4_3_95,SFTP_Info.sftppath_10_4_3_95, ServiceName);

	}

	public static void differentMethods2(String fileName, String ServiceName, String SubFolder)throws InterruptedException, IOException {

		DiffsernetsSFTPS.DiffSftp(fileName, SFTP_Info.sftpHost_10_4_3_95, SFTP_Info.sftpPort_22,SFTP_Info.sftpUserName_10_4_3_95_22, SFTP_Info.sftpPassword10_4_3_95_22, SFTP_Info.sshKey_10_4_3_95,SFTP_Info.sftppath_10_4_3_95, ServiceName, SubFolder);

	}

}
