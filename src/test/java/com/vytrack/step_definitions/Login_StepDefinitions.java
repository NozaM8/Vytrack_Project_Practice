package com.vytrack.step_definitions;

import com.vytrack.pages.Login_Page;
import com.vytrack.utils.Browser_Utils;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    Login_Page login_page = new Login_Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(Browser_Utils.url);
    }

    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() {
        login_page.login();
        Browser_Utils.wait(1);
    }

    @Then("user should land on the dashboard page")
    public void user_should_land_on_the_dashboard_page() {
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle().trim();

        Assert.assertEquals("Title is incorrect! Verification FAILED!", expectedTitle, actualTitle);
        System.out.println("I see the Dashboard page!");

        Driver.closeDriver();
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String role) {
        login_page.login(role);
    }




}
