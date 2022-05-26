package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage {
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By promoField = By.className("promoCode");
	private By promoButton = By.className("promoBtn");
	private By placeOrder = By.xpath("//button[text()='Place Order']");
	
	public Boolean verifyPromoBtn() {
		return driver.findElement(promoButton).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
