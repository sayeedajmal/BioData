package com.biodata;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.home") + File.separator + "Desktop";
        path += File.separator + "Test.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println(file + " already exists");
        } else if (file.createNewFile()) {
            System.out.println(file + " was created");
        } else {
            System.out.println(file + " was not created");
        }
    }

}