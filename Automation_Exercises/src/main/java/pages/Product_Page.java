package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Page extends HomePage{

    WebDriverWait wait;  
	public Product_Page(WebDriver driver) {
		super(driver);
		    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    PageFactory.initElements(driver, this);

	}

	@FindBy(id = "submit_search")
	WebElement SearchButton;
	@FindBy(id = "search_product")
	WebElement Search_product;
	public void get_Search_product(String productName) {
		Search_product.sendKeys(productName);
		SearchButton.click();
		
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_BibaProducts_Massage;
	public String get_Brand_BibaProducts_Massagee() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOf(Brand_BibaProducts_Massage));
		    return Brand_BibaProducts_Massage.getText();
	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Kooki_Kids_Products_Massage;
	public String get_Brand_Kooki_Kids_Products_Massage() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOf(Brand_Kooki_Kids_Products_Massage));
		    return Brand_Kooki_Kids_Products_Massage.getText();
	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Allen_Solly_Junior_Products_Massage;
	public String get_Brand_Allen_Solly_Junior_Products_Massage() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOf(Brand_Allen_Solly_Junior_Products_Massage));
		    return Brand_Allen_Solly_Junior_Products_Massage.getText();
	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Babyhug_Products_Massage;
	public String get_Brand_Babyhug_Products_Massage() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOf(Brand_Babyhug_Products_Massage));
		    return Brand_Babyhug_Products_Massage.getText();
	}
	
	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Brand_Mast_And_Harbour_Products_Massage;
	public String get_Brand_Mast_And_Harbour_Products_Massage() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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
	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Kids_Tops_And_Shirts_Products;
	public String get_Kids_Tops_And_Shirts_Products() {
		    wait.until(ExpectedConditions.visibilityOf(Kids_Tops_And_Shirts_Products));
		    
		    return Kids_Tops_And_Shirts_Products.getText();
	}
	@FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
	WebElement Kids_Dress_Products_Massage;
	public String get_Kids_Dress_Products_Massage() {
		    wait.until(ExpectedConditions.visibilityOf(Kids_Dress_Products_Massage));
		    return Kids_Dress_Products_Massage.getText();
	}
	@FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
	WebElement Men_Jeans_Products_Massage;
	public String get_Men_Jeans_Products_Massage() {
		    wait.until(ExpectedConditions.visibilityOf(Men_Jeans_Products_Massage));
		    return Men_Jeans_Products_Massage.getText();
	}
 
	@FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
	WebElement Men_Tshirts_Products_Massage;
	public String get_Men_Tshirts_Products_Massage() {
		    wait.until(ExpectedConditions.visibilityOf(Men_Tshirts_Products_Massage));
		    return Men_Tshirts_Products_Massage.getText();
	}


	@FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
	WebElement Women_Saree_Products_Massage;
	public String get_Women_Saree_Products_Massage() {
		    wait.until(ExpectedConditions.visibilityOf(Women_Saree_Products_Massage));
		    return Women_Saree_Products_Massage.getText();
	}

	@FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
	WebElement Women_Tops_Products_Massage;
	public String get_Women_Tops_Products_Massage() {
		    wait.until(ExpectedConditions.visibilityOf(Women_Tops_Products_Massage));
		    return Women_Tops_Products_Massage.getText();
	}
	@FindBy(css = "body > section > div > div.breadcrumbs > ol > li.active")
	WebElement Women_Dress_Products_Massage;
	public String get_Women_Dress_Products_Massage() {
		    wait.until(ExpectedConditions.visibilityOf(Women_Dress_Products_Massage));
		    return Women_Dress_Products_Massage.getText();
	}

	 @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
	WebElement All_Products_Massage;
	public String get_All_Products_Massage() {
	    wait.until(ExpectedConditions.visibilityOf(All_Products_Massage));
	    return All_Products_Massage.getText();

	}
	 @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > a")
	WebElement add_To_Card;
	 @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.choose > ul > li > a")
	WebElement view_Product;
	 @FindBy(css = "#cartModal > div > div > div.modal-footer > button")
	 WebElement Continue_Shoping;
	 
	 @FindBy(css = "#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u")
	 WebElement veiw_Cart;
	 @FindBy(css = "#cartModal > div > div > div.modal-header > h4")
	 WebElement Added_massage;
	public String get_Added_Message() {
	    wait.until(ExpectedConditions.visibilityOf(Added_massage));
	    return Added_massage.getText();


	}
	
	 @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")
	WebElement Products_Bottun;
	public void clic_on_ProductBottun() {
		Products_Bottun.click();
	}

	 
	public void addToCard() {
		add_To_Card.click();
	}
	public void veiwProduct() {
		add_To_Card.click();
	}
	public void alartContinue_Shoping() {
		Continue_Shoping.click();
	}
	
	public void alartVeiwCard() {
		veiw_Cart.click();
	}
	public void Back() {
		driver.navigate().back();
	}
	// Category
	//Waman
	@FindBy(css = "#accordian > div:nth-child(1) > div.panel-heading > h4 > a")
	WebElement Woman;
	@FindBy(css = "#Women > div > ul > li:nth-child(1) > a")
	WebElement Woman_Dress;
    public void Category_Woman_dress() {
    	driver.navigate().refresh();
	    wait.until(ExpectedConditions.visibilityOf(Woman)).click();;
	    wait.until(ExpectedConditions.elementToBeClickable(Woman_Dress)).click();;

	}
	@FindBy(css="#Women > div > ul > li:nth-child(2) > a")
	WebElement Woman_Tops;
	  public void Category_Woman_Tops() {
		  driver.navigate().refresh();
		    wait.until(ExpectedConditions.visibilityOf(Woman)).click();;
		    wait.until(ExpectedConditions.visibilityOf(Woman_Tops)).click();;

		}
	@FindBy(css = "#Women > div > ul > li:nth-child(3) > a")
	WebElement Woman_Saree;
	public void Category_Woman_saree() {
		driver.navigate().refresh();
	    wait.until(ExpectedConditions.visibilityOf(Woman)).click();;
	    wait.until(ExpectedConditions.elementToBeClickable(Woman_Saree)).click();;

	}
	//Man
	@FindBy(css = "#accordian > div:nth-child(2) > div.panel-heading > h4 > a")
	WebElement Man;
	
	@FindBy(css = "#Men > div > ul > li:nth-child(1) > a")
	WebElement Man_Tshirts;
	public void Category_Man_Tshirts() {
		driver.navigate().refresh();
	    wait.until(ExpectedConditions.visibilityOf(Man)).click();;
	    wait.until(ExpectedConditions.visibilityOf(Man_Tshirts)).click();;

	}
	
	@FindBy(css = "#Men > div > ul > li:nth-child(2) > a")
	WebElement Man_Jeans;
	public void Category_Man_Jeans() {
		driver.navigate().refresh();
	    wait.until(ExpectedConditions.visibilityOf(Man)).click();;
	    wait.until(ExpectedConditions.elementToBeClickable(Man_Jeans)).click();;

	}
	//Kids
	@FindBy(css = "#accordian > div:nth-child(3) > div.panel-heading > h4 > a")
	WebElement Kids;
	@FindBy(css = "#Kids > div > ul > li:nth-child(1) > a")
	WebElement  kids_dress;
	public void Category_kids_dress() {
		driver.navigate().refresh();

	    wait.until(ExpectedConditions.visibilityOf(Kids)).click();;
	    wait.until(ExpectedConditions.elementToBeClickable(kids_dress)).click();;

	}
	@FindBy(css = "#Kids > div > ul > li:nth-child(2) > a")
	WebElement Kids_Tops_And_Shirts;
	public void Category_Kids_Tops_And_Shirts() {
		driver.navigate().refresh();

	    wait.until(ExpectedConditions.visibilityOf(Kids)).click();;
	    wait.until(ExpectedConditions.visibilityOf(Kids_Tops_And_Shirts)).click();;

	}
//Brands
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(1) > a")
	WebElement Polo;
	public void Brands_Polo() {
	    wait.until(ExpectedConditions.visibilityOf(Polo)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(2) > a")
	WebElement H_And_M;
	public void Brands_H_And_M() {
	    wait.until(ExpectedConditions.visibilityOf(H_And_M)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(3) > a")
	WebElement Madame;
	public void Brands_Madame() {
	    wait.until(ExpectedConditions.visibilityOf(Madame)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(4) > a")
	WebElement Mast_And_Harbour;
	public void Brands_Mast_And_Harbour() {
	    wait.until(ExpectedConditions.visibilityOf(Mast_And_Harbour)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(5) > a")
	WebElement Babyhug;
	public void Brands_Babyhug() {
	    wait.until(ExpectedConditions.visibilityOf(Babyhug)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(6) > a")
	WebElement Allen_Solly_Junior;
	public void Brands_Allen_Solly_Junior() {
	    wait.until(ExpectedConditions.visibilityOf(Allen_Solly_Junior)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(7) > a")
	WebElement Kookie_Kids;
	public void Brands_Kookie_Kids() {
	    wait.until(ExpectedConditions.visibilityOf(Kookie_Kids)).click();;
	}
	@FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > div.brands_products > div > ul > li:nth-child(8) > a")
	WebElement Biba;
	public void Brands_Biba() {
	    wait.until(ExpectedConditions.visibilityOf(Biba)).click();;
	}



	

}
