package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{

	 public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	 @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
	   public WebElement addressReview;
	
	@FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[2]/h2")
	 public WebElement address_Details;
	 @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[4]/h2")
     public WebElement review_Order;
    @FindBy(name = "message")
     WebElement messageTxt;
    @FindBy(partialLinkText = "Place")
     WebElement placeOrderBtn;
     public void canCheckoutAndComment(String  message) {
	   messageTxt.sendKeys(message);
	   placeOrderBtn.click();
   }

}
