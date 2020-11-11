package com.vytrack.step_definitions.fleet;

import com.vytrack.pages.Login_Page;
import com.vytrack.pages.fleet.Fleet_Page;
import com.vytrack.utils.Browser_Utils;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Fleet_StepDefinitions {

    Login_Page login_page = new Login_Page();
    Fleet_Page fleet_page = new Fleet_Page();

    @Given("user has logged into vytrack app")
    public void user_has_logged_into_vytrack_app() {
        Driver.getDriver().get(Browser_Utils.url);
        login_page.login();
    }


    @When("user clicks on {string}")
    public void user_clicks_on(String page) {
        fleet_page.navigateToFleetPage(page);
    }


    @Then("user should land on {string}")
    public void user_should_land_on(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Url doesn't match! Verification FAILED!", expectedUrl, actualUrl);
        System.out.println("I see " + expectedUrl + "! Verification PASSED!");
        Driver.closeDriver();
    }



}
