package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravelsHomePage;
import com.crowdar.examples.pages.PhpTravelsBlogPage;
import com.crowdar.phpTravels.pages.PhpTravelsFlightsCheckoutPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class PhpTravelsSteps extends PageSteps {

    @Given("The user is in home page")
    public void home() {
        Injector._page(PhpTravelsHomePage.class).go();
    }

    @When("The user go to Blog page (.*)")
    public void searchBlog(String blog_name) {
        Injector._page(PhpTravelsHomePage.class).goToBlogPage(blog_name);
    }

    @Then("The Blog page is displayed")
    public void pageVerfication() {
        Assert.assertTrue(!Injector._page(PhpTravelsBlogPage.class).validatePageTitle());
    }

    @Given("The user is in Flight page")
    public void goToFlightPage() {
        Injector._page(PhpTravelsFlightsCheckoutPage.class).go();
    }

    @When("The user complete a flight form")
    public void completeFlightForm(ExamplesTable table) {
        Injector._page(PhpTravelsFlightsCheckoutPage.class).fillInputByName(table);
    }
}