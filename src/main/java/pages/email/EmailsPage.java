package pages.email;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class EmailsPage {

    private By composeButton = By.cssSelector(".compose-button__txt");
    private By layerSent = By.cssSelector(".layer-sent-page");

    public EmailsPage(){
        $(composeButton).should(visible);
    }

    public EmailPage clickComposeButton(){
        $(composeButton).click();
        return new EmailPage();
    }

    public void waitForSentEmail(){
        $(layerSent).should(visible);
    }
}
