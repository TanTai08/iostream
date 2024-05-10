/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.btio;

import java.io.File;

/**
 *
 * @author TAN TAI
 */
public class Btio {

    public static void main(String[] args) {
        String filePath = System.console().readLine("Nhập đường dẫn file : ");   
                File file = new File(filePath);
                if (file.exists()) {
            long fileSize = file.length();
            double fileSizeKB = (double) fileSize / 1024;
            double fileSizeMB = fileSizeKB / 1024;
            System.out.println("Độ lớn của file là:");
            System.out.println("Byte: " + fileSize);
            System.out.println("KB: " + fileSizeKB);
            System.out.println("MB: " + fileSizeMB);
        } else {
            System.out.println("File không tồn tại.");
        }
    }
}

