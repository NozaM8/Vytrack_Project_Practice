package com.vytrack.utils;

public class Browser_Utils {

    public static String url = Configuration_Reader.getProperty("url");

    public static void wait(int seconds) {

        try {
            Thread.sleep(seconds*1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void waitInMills (int mills) {

        try {
            Thread.sleep(mills);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }



}
