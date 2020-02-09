package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.LoginPage;
import runner.FBRunner;

public class LoginSteps extends FBRunner {

    @Given("user navigates to facebook home page")
    public void userNavigatesToFacebookHomePage() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.navigateToLoginPage();
    }

    @And("user enters invalid email")
    public void userEntersInvalidEmail() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterEmail("abc123");
    }

    @And("an invalid password")
    public void anInvalidPassword() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterPassword("abc123");
    }

    @When("user clicks on log in button")
    public void userClicksOnLogInButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.logIn();
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Assert.assertEquals(loginPage.isAlertMessageDisplayed(), true);
    }
}
