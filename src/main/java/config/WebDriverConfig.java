package config;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverConfig {

    public static void configure(){
        switch (TestConfig.BROWSER){
            case "chrome":
                chrome();
                break;
            case "firefox":
                firefox();
                break;
            case "opera":
                opera();
                break;
        }
    }

    private static void chrome(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        setCommonSettings();
    }

    private static void firefox(){
        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "firefox";
        setCommonSettings();
    }

    private static void opera(){
        WebDriverManager.operadriver().setup();
        Configuration.browser = "opera";
        setCommonSettings();
    }

    private static void setCommonSettings(){
        Configuration.pollingInterval = TestConfig.POOLING_INTERVAL_IN_MILLISECONDS;
        Configuration.timeout = TestConfig.IMPLICITLY_WAIT_IN_MILLISECONDS;
        Configuration.startMaximized = true;
    }
}
