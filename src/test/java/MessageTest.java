import config.TestConfig;
import org.testng.annotations.Test;
import pages.login.EnterEmailPage;

import java.util.UUID;

public class MessageTest extends BaseTest {

    @Test
    public void sendMessage(){
        new EnterEmailPage()
                .setEmail(TestConfig.EMAIL_PREFIX)
                .clickEnterButton()
                .setPassword(TestConfig.EMAIL_PASSWORD)
                .clickEnterButton()
                .clickComposeButton()
                .setContactEmail("test@test.ru")
                .setEmailBody("Message_" + UUID.randomUUID().toString())
                .clickSendButton()
                .waitForSentEmail();
    }
}
