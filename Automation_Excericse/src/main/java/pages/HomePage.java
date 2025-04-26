package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Signup / Login")
	WebElement signUpBtn;
	
	@FindBy(linkText = "Home")
	public WebElement homeLink;
	
	@FindBy(linkText = "Contact us")
	WebElement contactUsBtn;
	
	public void openRegisterationPage() {
		signUpBtn.click();
	}
	
	public void openLoginPage() {
		signUpBtn.click();
	}
	
	public void openContactPage() {
		contactUsBtn.click();
	}
}
