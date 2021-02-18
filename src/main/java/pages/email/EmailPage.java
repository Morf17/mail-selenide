package pages.email;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class EmailPage {

    private By contactsField = By.cssSelector("div[class^='contactsContainer'] input");
    private By emailBodyField = By.cssSelector("div[role='textbox']");
    private By sendButton = By.cssSelector("span[data-title-shortcut='Ctrl+Enter']");

    public EmailPage(){
        $(contactsField).should(visible);
    }

    public EmailPage setContactEmail(String email){
        $(contactsField).setValue(email);
        return this;
    }

    public EmailPage setEmailBody(String emailBody){
        $(emailBodyField).setValue(emailBody);
        return this;
    }

    public EmailsPage clickSendButton(){
        $(sendButton).click();
        return new EmailsPage();
    }
}
