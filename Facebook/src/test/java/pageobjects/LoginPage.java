package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.FBRunner;

public class LoginPage extends FBRunner {

    private String url = "https://facebook.com";

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(), 'doesn't match any account')]")
    private WebElement alertMessage;

    public void navigateToLoginPage() {
        driver.get(url);
    }

    public void enterEmail(String email) {
        this.emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        this.passwordField.sendKeys(password);
    }

    public void logIn() {
        this.loginButton.click();
    }

    public boolean isAlertMessageDisplayed() {
        return this.alertMessage.isDisplayed();
    }
}
