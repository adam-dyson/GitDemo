package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OffersPage {
	public WebDriver driver;
	public ExpectedConditions ec;
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("tr td:nth-child(1)");

	public void searchItem(String searchTerm) {
		driver.findElement(search).sendKeys(searchTerm);
	}
	
	public String getProductName() {
		ec.visibilityOf(driver.findElement(productName));
		return driver.findElement(productName).getText();
	}
}
