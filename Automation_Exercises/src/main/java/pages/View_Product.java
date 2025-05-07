package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class View_Product extends PageBase{

	public View_Product(WebDriver driver) {
		super(driver);
		
	}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.choose > ul > li > a")
	WebElement ViewProduct;
	public void view_button() {
		wait.until(ExpectedConditions.visibilityOf(ViewProduct)).click();
		
	}
	
	@FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.category-tab.shop-details-tab > div.col-sm-12 > ul > li > a")
	WebElement WriteYourReview;
	public String get_your_review() {
	    wait.until(ExpectedConditions.visibilityOf(WriteYourReview));
	    return WriteYourReview.getText();
	}
	
	@FindBy(id = "name")
	WebElement Name;
	public void get_name() {
	    wait.until(ExpectedConditions.visibilityOf(Name));
		Name.sendKeys("Ammar");
	}
	
	@FindBy(id = "email")
	WebElement Email;
	public void get_email() {
	    wait.until(ExpectedConditions.visibilityOf(Email));
		Email.sendKeys("ammarsabbah1@gmail.com");
	}
	
	@FindBy(id = "review")
	WebElement Review;
	public void get_review() {
	    wait.until(ExpectedConditions.visibilityOf(Review));
		Review.sendKeys("Nice clothes I liked it very much!");
	}
	
	@FindBy(id = "button-review")
	WebElement SubmitReview;
	public void click_submit_button() {
	    wait.until(ExpectedConditions.elementToBeClickable(SubmitReview)).click();
	}
	
	@FindBy(id = "quantity")
	WebElement QuantityBox;
	public void set_quantity(String quantity) {
	    wait.until(ExpectedConditions.visibilityOf(QuantityBox));
	    QuantityBox.clear();
	    QuantityBox.sendKeys(quantity); 
	}

	@FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > button")
	WebElement AddToCartButton;
	public void click_add_to_cart() {
		wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton)).click();
		}

	@FindBy(css = "#cartModal > div > div > div.modal-footer > button")
	WebElement ContinueShoppingButton;
	public void click_continue_shopping() {
	    wait.until(ExpectedConditions.visibilityOf(ContinueShoppingButton)).click();

	}
	

}
