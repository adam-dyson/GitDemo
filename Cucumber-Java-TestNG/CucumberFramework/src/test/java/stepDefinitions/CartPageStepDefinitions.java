package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CartPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class CartPageStepDefinitions {
	TestContextSetup testContext;
	PageObjectManager pageObjectManager;
	public CartPage cartPage;
	public CartPageStepDefinitions(TestContextSetup testContext) {
		this.testContext = testContext;
    	this.cartPage = testContext.pageObjectManager.getCartPage();
	}

    @Then("^user proceeds to Checkout and validate the (.+) items in checkout page$")
    public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable {
    	Assert.assertTrue(cartPage.verifyPromoBtn());
    	Assert.assertTrue(cartPage.verifyPlaceOrder());
    }

    @And("^verify user has ability to enter promo code and place the order$")
    public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {
    }
}
