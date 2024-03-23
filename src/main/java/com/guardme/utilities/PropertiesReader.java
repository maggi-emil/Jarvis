package com.guardme.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    private static final String filePath = "src/test/resources/Configs/guardme.properties";

 public static String readProperty(String name){

     String property = "";
     try (InputStream input = new FileInputStream(filePath)) {
         Properties prop = new Properties();
         prop.load(input);
         property = prop.getProperty(name);}

     catch (IOException ex){
         ex.printStackTrace();}

     return property;
 }
}
