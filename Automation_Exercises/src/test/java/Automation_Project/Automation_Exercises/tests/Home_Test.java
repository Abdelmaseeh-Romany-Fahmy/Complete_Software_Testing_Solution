package Automation_Project.Automation_Exercises.tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Home_Page;

public class Home_Test extends TestBase {
	HomePage home_Object= new HomePage(driver);
	Home_Page home = new Home_Page(driver);
	String WomenTopsProducts="Women - Tops Products".toUpperCase();
	String MenTshirtsProducts="Men > Tshirts";
	String KidsTopsShirtsProducts="Kids - Tops & Shirts Products".toUpperCase();
	String BrandPoloProducts="Brand - Polo Products".toUpperCase();
	String BrandHMProducts="Brand - H&M Products".toUpperCase();
	String  Dress_Woman="Women > Dress";
	String Dress_kads ="Kids > Dress";
	String  Saree ="Women > Saree";
	String Jeans ="Men > Jeans";
	String BrandMadameProducts ="Brand - Madame Products".toUpperCase();
	String BrandMast_And_HarbourProducts ="Brand - Mast & Harbour Products".toUpperCase();
	String BrandBabyhugProducts ="Brand - Babyhug Products".toUpperCase();
	String BrandAllenSollyJuniorProducts ="Brand - Allen Solly Junior Products".toUpperCase();
	String BrandKookieKidsProducts ="Brand - Kookie Kids Products".toUpperCase();
	String BrandBibaProducts ="Brand - Biba Products".toUpperCase();











  @Test
  public void Home_Senario() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500);");
	    Thread.sleep(3000);

home.viewProductButton();
Assert.assertEquals("rgba(255, 165, 0, 1)", home.HomeButton.getCssValue("color"));
home.Back();
home.addToCartButton();

home.alert_ContinueShopingButton();

//Category_Women
	  home.Category_Women_dress();	   
	
	Assert.assertEquals(Dress_Woman, home.get_DressMassage());
	home.Back();

home.Category_Women_tops();
Assert.assertEquals(WomenTopsProducts, home.get_Women_Tops_Products_Massage());
home.Back();

home.Category_Women_Saree();
Assert.assertEquals(Saree, home.get_SareeMassage());
home.Back();

//Category_Man

home.Category_men_Tshirts();
Assert.assertEquals(MenTshirtsProducts, home.get_Men_Tshirts_Products_Massage());
home.Back();

home.Category_men_Jeans();
Assert.assertEquals(Jeans, home.get_Men_JeansMassage());
home.Back();



////Category_kids

home.Category_Kids_Dress();
Assert.assertEquals(Dress_kads, home.get_Kids_Dress_Massage());
home.Back();
home.Category_Kids_Tops_AND_Shirts();
Assert.assertEquals(KidsTopsShirtsProducts, home.get_Kids_Tops_And_Shirts_Products());
home.Back();

//Brands
home.Brands_Polo();
Assert.assertEquals(BrandPoloProducts, home.get_Brand_Polo_Products_Massage());
home.Back();
home.Brands_h_And_M();
Assert.assertEquals(BrandHMProducts, home.get_Brand_H_And_M_Products_Massage());
home.Back();
home.Brands_Madame();
Assert.assertEquals(BrandMadameProducts, home.get_Brand_Madame_Products_Massage());
home.Back();
js.executeScript("window.scrollBy(0,500);");

home.Brands_Mast_And_Harbour();
Assert.assertEquals(BrandMast_And_HarbourProducts, home.get_Brand_Mast_And_Harbour_Products_Massage());
home.Back();
home.Brands_Babyhug();
Assert.assertEquals(BrandBabyhugProducts ,home.get_Brand_Babyhug_Products_Massage());
home.Back();
home.Brands_AllenSollyJunior();
Assert.assertEquals(BrandAllenSollyJuniorProducts, home.get_Brand_Allen_Solly_Junior_Products_Massage());
home.Back();
home.Brands_KookieKids();
Assert.assertEquals(BrandKookieKidsProducts, home.get_Brand_Kookie_Kids_Products_Massage());
home.Back();
home.Brands_Biba();
Assert.assertEquals(BrandBibaProducts, home.get_Brand_Biba_Products_Massage());
home.Back();
Thread.sleep(5000);
home.send_Key_susbscribe_email("abdelmaseeh@gmial.com");
js.executeScript("window.scrollBy(0,1000);");






  }
}
