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

public class Test_012_FolderDoesntExists {

    @Test
    public void testMasterDataUpdateBulkIP() throws Exception {
        MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.FileUploadSftp, 3, "SFTP",
                5000, new FileUpload("7441", 500, "/bulk-store/Aut"));
        LargeFiles.verifyServiceUpdateAndFileUpload(master, SFTP_Info.sftp_Host_172_20_21_57, SFTP_Info.sftp_Port_31703,SFTP_Info.sftpUserName, SFTP_Info.sftpPasswordName, SFTP_Info.sshKey_172_20_21_57, SFTP_Info.sftppath,"JSON.json","Automation_dont_delete..!");
    }

    @Test
    public void testMasterDataUpdateLocalIPS() throws Exception {
        MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.localHost_22, 8, "SFTP", 5000,
                new FileUpload("9367", 500, "/home/tecnotree/dfssdf/"));

        LargeFiles.verifyServiceUpdateAndFileUpload(master, SFTP_Info.sftpHost_172_20_21_227, SFTP_Info.sftpPort_22,
                SFTP_Info.sftpUserName_172_20_21_227, SFTP_Info.sftpPassword_172_20_21_227, SFTP_Info.sshKey_172_20_21_227,
                SFTP_Info.sftppath_172_20_21_227,"JSON.json","BulkStorage");
    }

    @Test
    public void testMasterDataUpdateLocalIPAndPort() throws Exception {
        MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.localHost22, 7, "SFTP",
                5000, new FileUpload("3067", 500, "/home/tecnotreexx/"));

        LargeFiles.verifyServiceUpdateAndFileUpload(master, SFTP_Info.sftpHost_10_4_3_95, SFTP_Info.sftpPort_22,
                SFTP_Info.sftpUserName_10_4_3_95_22, SFTP_Info.sftpPassword10_4_3_95_22, SFTP_Info.sshKey_10_4_3_95,
                SFTP_Info.sftppath_10_4_3_95,"JSON.json","bulk-store");
    }


}
