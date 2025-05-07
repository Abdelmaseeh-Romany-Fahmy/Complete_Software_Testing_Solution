package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Proceed To Checkout")
	WebElement ProceedBtn;
	@FindBy(linkText = "Signup / Login")
	WebElement signUpBtn;
	
	@FindBy(linkText = "Home")
	public WebElement homeLink;
	
	@FindBy(linkText = "Contact us")
	WebElement contactUsBtn;
	@FindBy(linkText = "Add to cart")
	List<WebElement> addToCart;
	@FindBy(linkText = "Cart")
	WebElement cartLink;
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]")
	WebElement cartHoverTarget;
	
	public void openRegisterationPage() {
		signUpBtn.click();
	}
	
	public void openLoginPage() {
		signUpBtn.click();
	}
	
	public void openContactPage() {
		contactUsBtn.click();
	}
	public void AddtoCart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0, 500);");
		   Actions actions = new Actions(driver);
		    actions.moveToElement(cartHoverTarget).perform();
             
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    
		    wait.until(ExpectedConditions.elementToBeClickable(addToCart.get(2))).click();
		    wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
		 Thread.sleep(3000);
		 ProceedBtn.click();
		 
	}
}
