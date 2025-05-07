package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment_Page extends HomePage {

	public Payment_Page(WebDriver driver) {
		super(driver);
	}
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(css  = "#form > div > div > div > div > a")
    WebElement continue_Button;
    public void Payment_continue_Button() {
	    wait.until(ExpectedConditions.visibilityOf(continue_Button)).click();
	}
    
    @FindBy(css = "#form > div > div > div > h2 > b")
    WebElement Order_Placed_massage;
    public String get_Order_Placed_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Order_Placed_massage));
	    return Order_Placed_massage.getText();


	}

    @FindBy(id = "submit")
    WebElement Pay_and_Confirm_Order_Bottun;
    @FindBy(name  =  "expiry_year")
    WebElement yearTxt;
    @FindBy(name  = "expiry_month")
    WebElement monthTxt;
    @FindBy(name  = "cvc")
    WebElement CVCTxt;
    
    @FindBy(name  = "card_number")
    WebElement Card_NumberTxt;

    @FindBy(name  = "name_on_card")
    WebElement Name_on_CardTxt;

    public void Payment_information(String Name_on_Card,String Card_Number,String CVC,String month,String year ) {
    	Name_on_CardTxt.sendKeys(Name_on_Card);
    	Card_NumberTxt.sendKeys(Card_Number);
    	CVCTxt.sendKeys(CVC);
    	monthTxt.sendKeys(month);
    	yearTxt.sendKeys(year);
	    wait.until(ExpectedConditions.visibilityOf(Pay_and_Confirm_Order_Bottun)).click();

    }
	@FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a")
	WebElement CardBottun;
	@FindBy(css = "#do_action > div.container > div > div > a")
	WebElement Proceed_To_Checkout_Bottun;
	
	@FindBy(css = "#cart_items > div > div:nth-child(7) > a")
	WebElement Place_Order_Bottun;
	public void Payment_Page_Move() throws InterruptedException {
	    wait.until(ExpectedConditions.visibilityOf(CardBottun)).click();
	    Thread.sleep(3000);
	    wait.until(ExpectedConditions.visibilityOf(Proceed_To_Checkout_Bottun)).click();
		  Thread.sleep(3000);
	    wait.until(ExpectedConditions.visibilityOf(Place_Order_Bottun)).click();
	}
	@FindBy(css = "#cart_items > div > div.breadcrumbs > ol > li.active")
	WebElement payment_Massage;
	public String get_payment_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(payment_Massage));
	    return payment_Massage.getText();


	}

}
