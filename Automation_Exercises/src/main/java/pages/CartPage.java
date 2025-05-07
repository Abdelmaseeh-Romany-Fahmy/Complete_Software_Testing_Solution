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

public class CartPage extends PageBase {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "here")
    WebElement LinkProducts;
    
    @FindBy(id = "cart_info_table")
    WebElement tapleProducts;

    @FindBy(tagName = "tr")
    public List<WebElement> tapleRows;
    
    
    @FindBy(xpath = "//*[@id=\"product-4\"]/td[2]")
    public WebElement DescriptionProduct4;
    
    @FindBy(xpath = "//*[@id=\"product-4\"]/td[3]")
    public WebElement PriceProduct4;
    
    @FindBy(xpath = "//*[@id=\"product-4\"]/td[4]")
    public WebElement QuantityProduct4;
    
    @FindBy(xpath = "//*[@id=\"product-4\"]/td[5]")
    public WebElement TotalProduct4;
    
    @FindBy(xpath = "//*[@id=\"product-4\"]/td[6]/a")
    public WebElement DeleteProduct4Btn;
    
    @FindBy(xpath = "//*[@id=\"product-1\"]/td[2]")
    public WebElement DescriptionProduct1;
    
    @FindBy(xpath = "//*[@id=\"product-1\"]/td[3]")
    public WebElement PriceProduct1;
    
    @FindBy(xpath = "//*[@id=\"product-1\"]/td[4]")
    public WebElement QuantityProduct1;
    
    @FindBy(xpath = "//*[@id=\"product-1\"]/td[5]")
    public WebElement TotalProduct1;
    
    @FindBy(xpath = "//*[@id=\"product-1\"]/td[6]/a")
    public WebElement DeleteProduct1Btn;
    
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[2]")
    public WebElement DescriptionProduct2;
    
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[3]")
    public WebElement PriceProduct2;
    
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[4]")
    public WebElement QuantityProduct2;
    
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[5]")
    public WebElement TotalProduct2;
    
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[6]/a")
    public WebElement DeleteProduct2Btn;
    
    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    public WebElement ContinueShoppingBtn;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
    WebElement ViewCartBtn;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")
    public WebElement product1Btn;
	
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]")
    public WebElement product1;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/ul/li/a")
    WebElement product2Btn;
    
    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    WebElement AddToCart2;
    
    @FindBy(id = "quantity")
    WebElement QuantityTxt;
    
    @FindBy(linkText = "Home")
	public WebElement homeLink;
	
	@FindBy(linkText = "Cart")
	public WebElement cartBtn;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	public WebElement productsBtn;
	
	@FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")
	public WebElement AddToCartBtnHome;
    
    public void hoverProduct1() {
    	Actions action = new Actions(driver);
        action.moveToElement(product1).perform();
        
    }
    
    public void addProduct1() {
    	Actions action = new Actions(driver);
        action.click(product1Btn).perform();
        
    }
    
    public void clickViewProduct2() {
    	Actions action = new Actions(driver);
        action.click(product2Btn).perform();
        
    }
    
    public void clickContinueShoping() {
    	ContinueShoppingBtn.click();
    }
    
    public void clickViewCart() {
    	ViewCartBtn.click();
    }
    
    public void clickAddToCart() {
    	AddToCart2.click();
    }
    
    
    
	public void scrollToProduct1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("let text = document.evaluate(\"/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;\r\n"
        		+ "text.scrollIntoView(\r\n"
        		+ "    {\r\n"
        		+ "        behaviour : \"smooth\"\r\n"
        		+ "    }\r\n"
        		+ "    );");
    }
	
	public void addQuantity(String Q) {
		QuantityTxt.clear();
		QuantityTxt.sendKeys(Q);
	}

    public void navigateToProducts() {
        LinkProducts.click();
    }
    
    public void DeleteProduct1() {
    	Actions action = new Actions(driver);
        action.click(DeleteProduct1Btn).perform();
    }
    
    public void DeleteProduct2() {
    	Actions action = new Actions(driver);
        action.click(DeleteProduct2Btn).perform();
    }
    
    public void DeleteProduct4() {
    	Actions action = new Actions(driver);
        action.click(DeleteProduct4Btn).perform();
    }
    
    public void openCartPage() {
		cartBtn.click();
	}
	
	public void scrollToText() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("let text = document.evaluate(\"/html/body/section[2]/div/div/div[2]/div[2]/h2\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;\r\n"
        		+ "text.scrollIntoView(\r\n"
        		+ "    {\r\n"
        		+ "        behaviour : \"smooth\"\r\n"
        		+ "    }\r\n"
        		+ "    );");
    }
	
	public void scrollBackToCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-11000);");
    }
	
	public void clickAddToCartHome() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(AddToCartBtnHome));
		AddToCartBtnHome.click();
	}
	
}
