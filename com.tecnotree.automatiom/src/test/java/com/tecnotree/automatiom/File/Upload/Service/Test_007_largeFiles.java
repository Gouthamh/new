package com.tecnotree.automatiom.File.Upload.Service;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.Pojo.FileUpload;
import com.tecnotree.automatiom.Pojo.MasterFiledServiceConfigure;
import com.tecnotree.automatiom.ReUsedMethods.LargeFiles;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.SFTP_Info;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

public class Test_007_largeFiles {

    @Test
    public void testMasterDataUpdateBulkIP() throws Exception {
        MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.FileUploadSftp, 3, "SFTP",
                5000, new FileUpload("7441", 500, SFTP_Info.sftppath));

        LargeFiles.verifyServiceUpdateAndFileUpload(master, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703,SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath,"Large_file.exe");
    }

    @Test
    public void testMasterDataUpdateLocalIPS() throws Exception {
        MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.localHost_22, 7, "SFTP", 5000,
                new FileUpload("9367", 500, "/home/tecnotree/BulkStorage/"));

        LargeFiles.verifyServiceUpdateAndFileUpload(master, SFTP_Info.sftpHost_172_20_21_227, SFTP_Info.sftpPort_22,
                SFTP_Info.sftpUserName_172_20_21_227, SFTP_Info.sftpPassword_172_20_21_227, SFTP_Info.sshKey_172_20_21_227,
                SFTP_Info.sftppath_172_20_21_227,"Large_file.exe");
    }

    @Test
    public void testMasterDataUpdateLocalIPAndPort() throws Exception {
        MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.FileUploadSftp, 3, "SFTP",
                5000, new FileUpload("7441", 500, "/home/tecnotree/bulk-store/"));

        LargeFiles.verifyServiceUpdateAndFileUpload(master, SFTP_Info.sftpHost_10_4_3_95, SFTP_Info.sftpPort_22,
                SFTP_Info.sftpUserName_10_4_3_95_22, SFTP_Info.sftpPassword10_4_3_95_22, SFTP_Info.sshKey_10_4_3_95,
                SFTP_Info.sftppath_10_4_3_95,"Large_file.exe");
    }


}
