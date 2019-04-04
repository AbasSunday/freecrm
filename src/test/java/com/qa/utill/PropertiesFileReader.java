package com.qa.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    Properties properties;
    private final String CONFIG_PATH ="/Users/abas/Documents/freecrm/";

    public PropertiesFileReader() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(CONFIG_PATH +"config.properties");
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
