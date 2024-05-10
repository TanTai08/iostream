/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btio;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author TAN TAI
 */
public class Btio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập đường dẫn thư mục hoặc tệp tin: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists()) {
            String objectType = file.isDirectory() ? "thư mục" : "tệp tin";

            System.out.print("Bạn có chắc chắn muốn xoá " + objectType + " này? (y/n): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("y")) {
                boolean deleted = deleteFileOrDirectory(file);

                if (deleted) {
                    System.out.println(objectType + " đã được xoá thành công.");
                } else {
                    System.out.println("Không thể xoá " + objectType + ".");
                }
            } else {
                System.out.println("Hủy xoá " + objectType + ".");
            }
        } else {
            System.out.println("Đường dẫn không tồn tại.");
        }
    }
    private static boolean deleteFileOrDirectory(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    deleteFileOrDirectory(child);
                }
            }
        }

        return file.delete();
    }
}

