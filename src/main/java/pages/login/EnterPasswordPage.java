package pages.login;

import org.openqa.selenium.By;
import pages.email.EmailsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class EnterPasswordPage {

    private By passwordField = By.name("password");
    private By enterButton = By.cssSelector("button[data-testid='login-to-mail']");

    public EnterPasswordPage(){
        $(passwordField).should(visible);
    }

    public EnterPasswordPage setPassword(String password){
        $(passwordField).setValue(password);
        return this;
    }

    public EmailsPage clickEnterButton(){
        $(enterButton).click();
        return new EmailsPage();
    }
}
