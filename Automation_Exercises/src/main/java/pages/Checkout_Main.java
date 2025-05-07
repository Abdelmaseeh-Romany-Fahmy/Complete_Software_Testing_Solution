package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout_Main extends PageBase{
    WebDriverWait wait;  

	public Checkout_Main(WebDriver driver) {
		super(driver);
		   wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    PageFactory.initElements(driver, this);	}

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement  Signup_Login;
	public void Click_Signup_Login() {
	   	 wait.until(ExpectedConditions.visibilityOf(Signup_Login)).click();
	}
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
	WebElement homeBtn;
@FindBy(xpath = "//*[@id=\"product-1\"]/td[4]/button")
WebElement num_Quantity;
public void CheakOfQuantity() {
	  JavascriptExecutor js =(JavascriptExecutor) driver;

    int currentQuantity = Integer.parseInt(num_Quantity.getText());

	if(currentQuantity!=1) {
   	 wait.until(ExpectedConditions.visibilityOf(addtoCartBtn)).click();
     Click_Delete();
     homeBtn.click();
     js.executeScript("window.scrollBy(0,500);");
	  addToCartButton();
	  alert_ContinueShopingButton();
	  viewCart();
	  CheckoutBtn();
	  
	}
}
	@FindBy(xpath = "//*[@id=\"empty_cart\"]/p/b")
	WebElement Cart_is_empty;
	public String get_Cart_is_empty() {
		wait.until(ExpectedConditions.visibilityOf(Cart_is_empty));
		return Cart_is_empty.getText();
		
	}

	  @FindBy(xpath = "//*[@id=\"product-1\"]/td[6]/a/i")
	  WebElement Delete;
	  public void Click_Delete() {
		  Actions action = new Actions(driver);
	        action.click(Delete).perform();	  }

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]")
	WebElement login;
	public void get_login() {
		login.sendKeys("malakismailmohamed5@gmail.com");
	}
    @FindBy(name = "password")
    WebElement password;
    public void get_password() {
		password.sendKeys("1234567");
    }
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")
    WebElement loginBtn;
    public void get_loginBtn() {
		loginBtn.click();
    }
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")
	WebElement addToCart;
    public void addToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCart)).click();
    	
    }
    @FindBy(xpath =  "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement alert_ContinueShoping;
     
    public void alert_ContinueShopingButton() {
        wait.until(ExpectedConditions.visibilityOf(alert_ContinueShoping)).click();
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement addtoCartBtn;
     public void viewCart() {
    	 wait.until(ExpectedConditions.visibilityOf(addtoCartBtn)).click();
}

@FindBy(xpath =  "//*[@id=\"do_action\"]/div[1]/div/div/a")
WebElement process_checkoutBtn;
public void CheckoutBtn() {
	wait.until(ExpectedConditions.visibilityOf(process_checkoutBtn)).click();;
}
@FindBy(css = "#cart_items > div > div:nth-child(2) > h2")
WebElement addressDetails;
public String address_details() {
	wait.until(ExpectedConditions.visibilityOf(addressDetails));
	return addressDetails.getText();
}
@FindBy(css = "#address_delivery > li.address_title > h3")
WebElement delivery_address;
public String Delivery_address() {
	wait.until(ExpectedConditions.visibilityOf(delivery_address));
	return delivery_address.getText();
}
@FindBy(css = "#address_invoice > li.address_title > h3")
WebElement biling_address;
public String Biling_address() {
	wait.until(ExpectedConditions.visibilityOf(biling_address));
	return biling_address.getText();
}
@FindBy(id = "address_delivery")
WebElement deliveryBox;
public String deliverybox_Content() {
	wait.until(ExpectedConditions.visibilityOf(deliveryBox));
	return deliveryBox.getText();
}
@FindBy(id = "address_invoice")
WebElement billingBox;
public String billingbox_Content() {
	wait.until(ExpectedConditions.visibilityOf(billingBox));
	return billingBox.getText();
}
@FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[4]/h2")
WebElement reviewOrder;
public String reviewYour_order() {
	wait.until(ExpectedConditions.visibilityOf(reviewOrder));
	return reviewOrder.getText();
}
@FindBy(id = "cart_info")
WebElement order_table;
public boolean isOrder_tableDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(order_table));
	return order_table.isDisplayed();
}
@FindBy(css = "#product-1 > td.cart_description")
WebElement Pname;
public String getPname() {
	wait.until(ExpectedConditions.visibilityOf(Pname));
	return Pname.getText();
}
@FindBy(css = "#product-1 > td.cart_price")
WebElement productPrice;
public String getproduct_Price() {
	wait.until(ExpectedConditions.visibilityOf(productPrice));
	return productPrice.getText();
}
@FindBy(css = "#product-1 > td.cart_quantity")
WebElement Pquantity;
public String getPquantity() {
	wait.until(ExpectedConditions.visibilityOf(Pquantity));
	return Pquantity.getText();
}
@FindBy(css = "#product-1 > td.cart_total")
WebElement Ptotal;
public String getPtotal() {
	wait.until(ExpectedConditions.visibilityOf(Ptotal));
	return Ptotal.getText();
}
@FindBy(css =  "#ordermsg > textarea")
WebElement Addcomment;
public void add_comment() {
	wait.until(ExpectedConditions.visibilityOf(Addcomment)).sendKeys("Kindly deliver the order before wednesday");
}
@FindBy(css = "#cart_items > div > div:nth-child(7) > a")
WebElement orderPlaceBtn;
public void order_PlaceBtn() {
	wait.until(ExpectedConditions.visibilityOf(orderPlaceBtn)).click();
}
@FindBy(css = "#checkoutModal > div > div > div.modal-body > p:nth-child(1)")
WebElement AlertMsg;
public String alert_msg() {
	wait.until(ExpectedConditions.visibilityOf(AlertMsg));
	return AlertMsg.getText();
}
@FindBy(css = "#checkoutModal > div > div > div.modal-body > p:nth-child(2) > a > u")
WebElement loginAlert;
public void loginAlert_Btn() {
	wait.until(ExpectedConditions.visibilityOf(loginAlert)).click();
}
}

