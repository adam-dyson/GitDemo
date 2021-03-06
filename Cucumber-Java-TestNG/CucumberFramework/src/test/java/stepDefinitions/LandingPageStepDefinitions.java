package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	TestContextSetup testContext;
	LandingPage landingPage;
	public LandingPageStepDefinitions(TestContextSetup testContext) {
		this.testContext = testContext;
		this.landingPage = testContext.pageObjectManager.getLandingPage();
	}
		
    @Given("^user is on GreenKart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	Assert.assertTrue(testContext.genericUtils.getTitleLandingPage().contains("GreenKart"));
    }

    @When("^user searched for short name (.+) and extracted actual name of product$")
    public void user_searched_for_short_name_something_and_extracted_actual_name_of_product(String searchTerm) throws Throwable {
    	landingPage.searchItem(searchTerm);
    	Thread.sleep(2000);
    	testContext.landingPageProductName = landingPage.getProductName();
    	System.out.printf(" \"%s\" is extracted from product page.", testContext.landingPageProductName);
    }

    @And("^added \"([^\"]*)\" items of the selected product to cart$")
    public void added_something_items_of_the_selected_product_to_cart(int amount) throws Throwable {
    	landingPage.addQuantity(amount);
    	landingPage.openCartAndCheckout();
    }
}
