import com.codeborne.selenide.Selenide;
import config.TestConfig;
import config.WebDriverConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setUp() {
        WebDriverConfig.configure();
    }

    @BeforeMethod
    public void openUrl() {
        Selenide.open(TestConfig.ENVIRONMENT_URL);
    }

    @AfterMethod
    public void clear() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    @AfterTest
    public void close() {
        Selenide.closeWebDriver();
    }
}
