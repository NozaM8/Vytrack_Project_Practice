package com.vytrack.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

        private static Properties properties = new Properties();

        static{

            try {
                FileInputStream file = new FileInputStream("configuration.properties");
                properties.load(file);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public static String getProperty(String key){
            return properties.getProperty(key);
        }






}
