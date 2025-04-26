package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPageWithDirectWay extends PageBase {

	public ContactUsPageWithDirectWay(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="name")
	WebElement nameTxt;
	
	@FindBy(name="email")
	WebElement emailTxt;
	
	@FindBy(name="subject")
	WebElement subjectTxt;
	
	@FindBy(name="message")
	WebElement messageTxt;
	
	@FindBy(name="upload_file")
	WebElement uploadFileBtn;
	
	@FindBy(xpath="//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")
	public WebElement contactUsMessage;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public void userCanContactUs(String name,String email,String subject,String message)
	{
		nameTxt.sendKeys(name);
		emailTxt.sendKeys(email);
		
		subjectTxt.sendKeys(subject);
		messageTxt.sendKeys(message);
		
		////// upload file
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\images\\messi.jpg.jpg";
		
		uploadFileBtn.sendKeys(filePath);
		
		submitBtn.click();
	}
	
	
	

	
}
