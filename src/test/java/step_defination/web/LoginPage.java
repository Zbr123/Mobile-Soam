package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class LoginPage extends Page {
    @When("[Login Page] User enters email {string}")
    public void enterEmailAddress(String email) {
        getLoginPage().getEmail().sendKeys(email);
    }

    @When("[Login Page] User enters password (.*)$")
    public void enterPassword(String password) {
        getLoginPage().getPassword().sendKeys(password);
    }

    @When("[Login Page] User click on login button")
    public void clickOnLoginButton()  {
        getLoginPage().getLoginButton().click();
    }
}