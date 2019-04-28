package com.sparta.spacexapi.propertysetup;

import java.io.FileReader;
import java.io.IOException;

public class Properties {

    private static final String BASEURL = "base_url";
    private static final String CAPSULES = "capsules";
    private static final String UPCOMING = "upcoming_capsules";
    private static final String PASTCAPSULES = "past_capsules";
    private static final String INFO = "info";

    private static String capsules;
    private static String upcoming;
    private static String pastCapsules;
    private static String baseURL;
    private static String info;

    private Properties() {
    }

    public static String getCapsules() {
        if (capsules == null){
            setup();
        }
        return capsules;
    }

    public static String getUpcoming() {
        if (upcoming == null){
            setup();
        }
        return upcoming;
    }

    public static String getBaseurl() {
        if (baseURL == null){
            setup();
        }
        return baseURL;
    }

    public static String getPastCapsules() {
        if (pastCapsules == null){
            setup();
        }
        return pastCapsules;
    }

    public static String getInfo() {
        if (info == null){
            setup();
        }
        return info;
    }

    public static void setup(){

        java.util.Properties appproperties = new java.util.Properties();
        try {
            appproperties.load(new FileReader("app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        capsules = appproperties.getProperty(CAPSULES);
        baseURL = appproperties.getProperty(BASEURL);
        upcoming = appproperties.getProperty(UPCOMING);
        pastCapsules = appproperties.getProperty(PASTCAPSULES);
        info = appproperties.getProperty(INFO);
    }
}
