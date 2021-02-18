package config;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.testng.Assert.fail;

public class PropertiesConfig {

    private static Properties properties;

    public static String get(String key) {
        if (properties == null) {
            init();
        }
        return properties.getProperty(key);
    }

    private static void init() {
        File globalConfigFile = new File("src/main/resources/config.properties");
        File localConfigFile = new File("src/main/resources/local.properties");
        Properties globalProperties = new Properties();
        Properties localProperties = new Properties();

        try {
            globalProperties.load(new FileInputStream(globalConfigFile));
            properties = new Properties();
            properties.putAll(globalProperties);
            if (localConfigFile.exists()) {
                localProperties.load(new FileInputStream(localConfigFile));
                properties.putAll(localProperties);
            }
        } catch (IOException e) {
            fail("Error open config file: " + e.getMessage());
        }
    }
}
