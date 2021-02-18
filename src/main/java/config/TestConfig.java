package config;

public final class TestConfig {

    public static final long IMPLICITLY_WAIT_IN_MILLISECONDS;
    public static final long POOLING_INTERVAL_IN_MILLISECONDS;
    public static final String BROWSER;
    public static final String ENVIRONMENT_URL;
    public static final String EMAIL_PREFIX;
    public static final String EMAIL_PASSWORD;

    static {
        IMPLICITLY_WAIT_IN_MILLISECONDS = Long.parseLong(PropertiesConfig.get("IMPLICITLY_WAIT_IN_MILLISECONDS"));
        POOLING_INTERVAL_IN_MILLISECONDS = Long.parseLong(PropertiesConfig.get("POOLING_INTERVAL_IN_MILLISECONDS"));
        BROWSER = PropertiesConfig.get("BROWSER").toLowerCase();
        ENVIRONMENT_URL = PropertiesConfig.get("ENVIRONMENT_URL");
        EMAIL_PREFIX = PropertiesConfig.get("EMAIL_PREFIX");
        EMAIL_PASSWORD = PropertiesConfig.get("EMAIL_PASSWORD");
    }
}
