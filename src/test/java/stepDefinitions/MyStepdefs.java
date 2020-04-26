package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import sun.rmi.runtime.Log;

public class MyStepdefs {
    @Given("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String arg1) throws Throwable {

        Hooks.driver.get(arg1);
        PageFactory.initElements(Hooks.driver, LoginPage.class);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {

        LoginPage.loginBtn.click();

    }

    @Given("^I enter \"([^\"]*)\" into input field having id \"([^\"]*)\"$")
    public void i_enter_into_input_field_having_id(String arg1, String arg2) throws Throwable {
        LoginPage.userName.sendKeys(arg1);

    }

    @When("^I enter \"([^\"]*)\" into input field having passowrd$")
    public void i_click_on_element_having_class(String arg1) throws Throwable {

        LoginPage.passWord.sendKeys(arg1);

    }

    @Then("^I click on element having button Login$")
    public void i_wait_seconds_for_element_having_css_to_display() throws Throwable {

        LoginPage.submit.click();
    }


    @Then("User should be able to logged in successfully")
    public void userShouldBeAbleToLoggedInSuccessfully() {

        Assert.assertEquals("Howdy, imaurya8",LoginPage.usernameValid.getText());
    }
}
