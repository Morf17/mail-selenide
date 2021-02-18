package pages.login;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class EnterEmailPage {

    private By emailField = By.cssSelector(".email-input");
    private By enterButton = By.cssSelector("button[data-testid='enter-password']");

    public EnterEmailPage() {
        $(emailField).should(visible);
    }

    public EnterEmailPage setEmail(String email) {
        $(emailField).setValue(email);
        return this;
    }

    public EnterPasswordPage clickEnterButton() {
        $(enterButton).click();
        return new EnterPasswordPage();
    }
}
