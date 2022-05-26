package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.linkText("Top Deals");
	private By increment = By.className("increment");
	private By addToCart = By.xpath("//button[text()='ADD TO CART']");
	private By cart = By.className("cart-icon");
	private By proceedToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public void searchItem(String searchTerm) {
    	driver.findElement(search).sendKeys(searchTerm);
	}
	
	public String getProductName() {
    	return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void selectTopDeals() {
		driver.findElement(topDeals).click();
	}
	
	public void addQuantity(int amount) {
		for(int i = 1; i <= amount; i++) {
			driver.findElement(increment).click();
		}
		
		driver.findElement(addToCart).click();
	}
	
	public void openCartAndCheckout() {
		driver.findElement(cart).click();
		driver.findElement(proceedToCheckout).click();
	}
}
