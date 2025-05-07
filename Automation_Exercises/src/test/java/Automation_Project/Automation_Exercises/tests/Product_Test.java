package Automation_Project.Automation_Exercises.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_Page;

public class Product_Test extends TestBase {

	HomePage home_Object= new HomePage(driver);
  Product_Page product = new Product_Page(driver);
  String AllProducts= "All Products".toUpperCase();
  String Added="Added!";
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
  public void Product() throws InterruptedException {
	
	product.clic_on_ProductBottun();
	Assert.assertEquals(AllProducts, product.get_All_Products_Massage());
	product.get_Search_product("men tshirt");
product.Back();
	JavascriptExecutor js =(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500);");
    Thread.sleep(3000);

	product.addToCard();
	Assert.assertEquals(Added,product.get_Added_Message());
	product.alartContinue_Shoping();

	product.Category_Woman_dress();
	Assert.assertEquals(Dress_Woman,product.get_Women_Dress_Products_Massage());
	product.Back();
	product.Category_Woman_Tops();
	Assert.assertEquals(WomenTopsProducts,product.get_Women_Tops_Products_Massage());
	product.Back();
	product.Category_Woman_saree();
	Assert.assertEquals(Saree, product.get_Women_Saree_Products_Massage());
	product.Back();
	product.Category_Man_Tshirts();
	Assert.assertEquals(MenTshirtsProducts, product.get_Men_Tshirts_Products_Massage());
	product.Back();
	product.Category_Man_Jeans();
	Assert.assertEquals(Jeans, product.get_Men_Jeans_Products_Massage());
	product.Back();
	product.Category_kids_dress();
	Assert.assertEquals(Dress_kads, product.get_Kids_Dress_Products_Massage());
	product.Back();
	product.Category_Kids_Tops_And_Shirts();
	Assert.assertEquals(KidsTopsShirtsProducts, product.get_Kids_Tops_And_Shirts_Products());
	product.Back();
	product.Brands_Polo();
	Assert.assertEquals(BrandPoloProducts, product.get_Brand_Polo_Products_Massage());
	product.Back();
	product.Brands_H_And_M();
	Assert.assertEquals(BrandHMProducts, product.get_Brand_H_And_M_Products_Massage());
	product.Back();
	product.Brands_Madame();
	Assert.assertEquals(BrandMadameProducts, product.get_Brand_Madame_Products_Massage());
	product.Back();
	product.Brands_Mast_And_Harbour();
	Assert.assertEquals(BrandMast_And_HarbourProducts, product.get_Brand_Mast_And_Harbour_Products_Massage());
	product.Back();
	product.Brands_Babyhug();
	Assert.assertEquals(BrandBabyhugProducts, product.get_Brand_Babyhug_Products_Massage());
	product.Back();
	product.Brands_Allen_Solly_Junior();
	Assert.assertEquals(BrandAllenSollyJuniorProducts, product.get_Brand_Allen_Solly_Junior_Products_Massage());
	product.Back();
	product.Brands_Kookie_Kids();
	Assert.assertEquals(BrandKookieKidsProducts, product.get_Brand_Kooki_Kids_Products_Massage());
	product.Back();
	product.Brands_Biba();
	Assert.assertEquals(BrandBibaProducts, product.get_Brand_BibaProducts_Massagee());
	product.Back();
	
}
}
