package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page extends PageBase{
    WebDriverWait wait;  


	public Home_Page(WebDriver driver) {
		super(driver);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    PageFactory.initElements(driver, this);
	}

	@FindBy(id = "subscribe")
	WebElement subscribe_Enter;
	@FindBy(id = "susbscribe_email")
	WebElement susbscribe_email;
	public void send_Key_susbscribe_email(String Susbscribe_email_Txt) {
		
		susbscribe_email.sendKeys(Susbscribe_email_Txt);	
		subscribe_Enter.click();
		
	
	
	}
	
	
	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Biba_Products_Massage;
	public String get_Brand_Biba_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Biba_Products_Massage));
	    return Brand_Biba_Products_Massage.getText();

	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Kookie_Kids_Products_Massage;
	public String get_Brand_Kookie_Kids_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Kookie_Kids_Products_Massage));
	    return Brand_Kookie_Kids_Products_Massage.getText();

	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Allen_Solly_Junior_Products_Massage;
	public String get_Brand_Allen_Solly_Junior_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Allen_Solly_Junior_Products_Massage));
	    return Brand_Allen_Solly_Junior_Products_Massage.getText();

	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Babyhug_Products_Massage;
	public String get_Brand_Babyhug_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Babyhug_Products_Massage));
	    return Brand_Babyhug_Products_Massage.getText();

	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Mast_And_Harbour_Products_Massage;
	public String get_Brand_Mast_And_Harbour_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Mast_And_Harbour_Products_Massage));
	    return Brand_Mast_And_Harbour_Products_Massage.getText();

	}


	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Madame_Products_Massage;
	public String get_Brand_Madame_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Madame_Products_Massage));
	    return Brand_Madame_Products_Massage.getText();

	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_H_And_M_Products_Massage;
	public String get_Brand_H_And_M_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_H_And_M_Products_Massage));
	    return Brand_H_And_M_Products_Massage.getText();

	}
	 @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Polo_Products_Massage;
	public String get_Brand_Polo_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Brand_Polo_Products_Massage));
	    return Brand_Polo_Products_Massage.getText();

	}
	//Kads_Massage
	 @FindBy(css  = "body > section > div > div.breadcrumbs > ol > li.active")
		WebElement Kids_Dress_Massage;
		public String get_Kids_Dress_Massage() {
		    wait.until(ExpectedConditions.elementToBeClickable(Kids_Dress_Massage));
		    return Kids_Dress_Massage.getText();

		}
	 @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Kids_Tops_And_Shirts_Products;
	public String get_Kids_Tops_And_Shirts_Products() {
	    wait.until(ExpectedConditions.visibilityOf(Kids_Tops_And_Shirts_Products));
	    return Kids_Tops_And_Shirts_Products.getText();

	}
	//Man_Massege
	@FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
	WebElement Men_Tshirts_Products_Massage;
	public String get_Men_Tshirts_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Men_Tshirts_Products_Massage));
	    return Men_Tshirts_Products_Massage.getText();

	}
	 @FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
		WebElement JeansMassage ;
		public String get_Men_JeansMassage() {
		    wait.until(ExpectedConditions.elementToBeClickable(JeansMassage));
		    return JeansMassage.getText();

		}
	
	//Woman_Massage
		
		 @FindBy(xpath =  "/html/body/section/div/div[1]/ol/li[2]")
			WebElement  SareeMassage ;
			public String get_SareeMassage() {
			    wait.until(ExpectedConditions.elementToBeClickable(SareeMassage));
			    return SareeMassage.getText();

			}
			@FindBy(xpath = "/html/body/section/div/div[1]/ol/li[2]")
			WebElement  DressMassage ;
			public String get_DressMassage() {
			    wait.until(ExpectedConditions.elementToBeClickable(DressMassage));
			    return DressMassage.getText();

			}	
	 @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Women_Tops_Products_Massage;
	public String get_Women_Tops_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(Women_Tops_Products_Massage));
	    return Women_Tops_Products_Massage.getText();

	}
	
	
	
     @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")
    public WebElement HomeButton;
	@FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > a")
	WebElement addToCart;
	@FindBy(css = "body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.choose > ul > li > a")
	WebElement viewProduct;
	
	public void viewProductButton() {
		viewProduct.click();
	}
	
	
public void addToCartButton() {
    wait.until(ExpectedConditions.visibilityOf(addToCart)).click();;
	
}

//Alart
@FindBy(css = "#cartModal > div > div > div.modal-footer > button")
WebElement alert_ContinueShoping;

public void alert_ContinueShopingButton() {
    wait.until(ExpectedConditions.visibilityOf(alert_ContinueShoping)).click();;
}

	//Category

	@FindBy(xpath =  "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")
	WebElement women;
	
	@FindBy(xpath =  "//*[@id=\"Women\"]/div/ul/li[1]/a")
	WebElement dress;
	@FindBy(xpath =  "//*[@id=\"Women\"]/div/ul/li[2]/a")
	WebElement tops;
	@FindBy(xpath =  "//*[@id=\"Women\"]/div/ul/li[3]/a")
	WebElement Saree;
	
	public void Category_Women_dress() {
		driver.navigate().refresh();

	    
	    wait.until(ExpectedConditions.elementToBeClickable(women)).click(); 

	    wait.until(ExpectedConditions.elementToBeClickable(dress)).click(); 
	}

	
	public void Category_Women_tops() {
		driver.navigate().refresh();

	  wait.until(ExpectedConditions.visibilityOf(women)).click(); 

	    wait.until(ExpectedConditions.visibilityOf(tops)).click(); 
	}
	public void Category_Women_Saree() {
		driver.navigate().refresh();

	    wait.until(ExpectedConditions.visibilityOf(women)).click(); 

	    wait.until(ExpectedConditions.visibilityOf(Saree)).click(); 
	}
	
	@FindBy(xpath =  "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")
	WebElement men;
	
	
	@FindBy(xpath =  "//*[@id=\"Men\"]/div/ul/li[1]/a")
	WebElement Tshirts;
	@FindBy(xpath =  "//*[@id=\"Men\"]/div/ul/li[2]/a")
	WebElement Jeans;
	
	public void Category_men_Tshirts() {
		driver.navigate().refresh();

	    wait.until(ExpectedConditions.visibilityOf(men)).click(); 

	    wait.until(ExpectedConditions.visibilityOf(Tshirts)).click(); 
	    
	}
	
	public void Category_men_Jeans() {
		driver.navigate().refresh();


	    wait.until(ExpectedConditions.visibilityOf(men)).click(); 

	    wait.until(ExpectedConditions.visibilityOf(Jeans)).click(); 
	    
	}
	
	
	
	@FindBy(xpath =  "//*[@id=\"accordian\"]/div[3]/div[1]/h4/a")
	WebElement Kids;
	
	@FindBy(xpath =  "//*[@id=\"Kids\"]/div/ul/li[1]/a")
	WebElement Dress;
	
	@FindBy(xpath = "//*[@id=\"Kids\"]/div/ul/li[2]/a")
	WebElement Tops_AND_Shirts;
	
	public void Category_Kids_Dress() {
		driver.navigate().refresh();


	    wait.until(ExpectedConditions.visibilityOf(Kids)).click(); 

	    wait.until(ExpectedConditions.visibilityOf(Dress)).click(); 
	}
	
	public void Category_Kids_Tops_AND_Shirts() {
		driver.navigate().refresh();


	    wait.until(ExpectedConditions.visibilityOf(Kids)).click(); 

	    wait.until(ExpectedConditions.visibilityOf(Tops_AND_Shirts)).click(); 
	}
	
	//Brands
	@FindBy(css  = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(1) > a")
	WebElement polo;
	public void Brands_Polo() {
	    wait.until(ExpectedConditions.visibilityOf(polo)).click(); 

	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(2) > a")
	WebElement h_And_M;
	public void Brands_h_And_M() {

	    wait.until(ExpectedConditions.visibilityOf(h_And_M)).click(); 

	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(3) > a")
	WebElement Madame;
	public void Brands_Madame() {
		
	    wait.until(ExpectedConditions.visibilityOf(Madame)).click(); 
	}
	@FindBy(css =   "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(4) > a")
	WebElement Mast_And_Harbour;
	public void Brands_Mast_And_Harbour() {
	    wait.until(ExpectedConditions.visibilityOf(Mast_And_Harbour)).click(); 

	}
	@FindBy(css =   "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(5) > a")
	WebElement Babyhug;
	public void Brands_Babyhug() {
	    wait.until(ExpectedConditions.visibilityOf(Babyhug)).click(); 

	}
	@FindBy(css =   "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(6) > a")
	WebElement AllenSollyJunior;
	public void Brands_AllenSollyJunior() {
	    wait.until(ExpectedConditions.visibilityOf(AllenSollyJunior)).click(); 

	}
	@FindBy(css =   "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(7) > a")
	WebElement KookieKids;
	public void Brands_KookieKids() {
	    wait.until(ExpectedConditions.visibilityOf(KookieKids)).click(); 

	}
	@FindBy(css =   "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(8) > a")
	WebElement Biba;
	public void Brands_Biba() {
	    wait.until(ExpectedConditions.visibilityOf(Biba)).click(); 

	}
	public void Back() {
		driver.navigate().back();
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
