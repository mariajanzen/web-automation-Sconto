package com.sconto.util;


import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private static final String PROP_FILE = "/test.properties";

    private PropertiesLoader() {

    }

    public static String loadProperty(String name) {
        Properties prop = new Properties();
        try {
            prop.load(PropertiesLoader.class.getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = "";

        if (name != null) {
            value = prop.getProperty(name);
        }
        return value;
    }
}
