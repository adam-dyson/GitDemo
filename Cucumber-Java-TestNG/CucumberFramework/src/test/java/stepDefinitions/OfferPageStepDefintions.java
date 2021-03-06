package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefintions {
	TestContextSetup testContext;
	PageObjectManager pageObjectManager;
	public OfferPageStepDefintions(TestContextSetup testContext) {
		this.testContext = testContext;
	}
	
    @Then("^user searched for (.+) short name in offers page$")
    public void user_searched_for_something_short_name_in_offers_page(String searchTerm) throws Throwable {
    	switchToOffersPage();
    	OffersPage offersPage = testContext.pageObjectManager.getOffersPage();
    	offersPage.searchItem(searchTerm);
    	testContext.offerPageProductName = offersPage.getProductName();
    }

    @And("^validate product name in offers page matches with Landing page$")
    public void validate_product_name_in_offers_page_matches_with_landing_page() throws Throwable {
    	Assert.assertEquals(testContext.offerPageProductName, testContext.landingPageProductName);
    }
    
    public void switchToOffersPage() {
    	LandingPage landingPage = testContext.pageObjectManager.getLandingPage();
    	landingPage.selectTopDeals();
    	testContext.genericUtils.switchToChild();
    }
}
