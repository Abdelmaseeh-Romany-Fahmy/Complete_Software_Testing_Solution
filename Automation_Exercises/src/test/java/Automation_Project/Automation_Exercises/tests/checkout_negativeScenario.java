package Automation_Project.Automation_Exercises.tests;

import org.testng.annotations.Test;

import pages.Checkout_Main;
import pages.HomePage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class checkout_negativeScenario extends TestBase {
	String expectedName= "Mrs. Malak Mohamed";
	String expectedCity= "LA california";
	String expectedFullcity= "los angeles california 90001";
	String expectedCountry="United States";
	String expectedPhone="01156357482";
	String expectedPname="Blue Top\n"
			+ "Women > Tops";
	String expectedProduct_price="Rs. 500";
	String expectedPquantity="1";
	String expectedPtotal= "Rs. 500";
	String Cart_is_empty ="Cart is empty!";
	HomePage home_Object= new HomePage(driver);
	Checkout_Main login =new Checkout_Main(driver);
	 

//  @BeforeTest
//	  public void beforeTest() {
//	  driver = new EdgeDriver();
//	  driver.manage().window().maximize();
//	   driver.navigate().to(baseURL);
//	   login = new Checkout_Main(driver);
//	  }
  
  @Test
  public void CheckoutWithout_login() throws InterruptedException {
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,600);");
	  login.addToCartButton();
	  login.alert_ContinueShopingButton();
	  login.viewCart();
	  login.CheckoutBtn();
	  Assert.assertEquals("Register / Login account to proceed on checkout.", login.alert_msg());
	  login.loginAlert_Btn();
	  login.get_login();
	  login.get_password();
	  login.get_loginBtn();
	  login.viewCart();
	  login.CheckoutBtn();  
	  Assert.assertEquals("Address Details", login.address_details());
	  Assert.assertEquals("YOUR DELIVERY ADDRESS", login.Delivery_address());
	  Assert.assertEquals("YOUR BILLING ADDRESS", login.Biling_address());
	  String deliveryContent = login.deliverybox_Content();
	  String billingContent = login.billingbox_Content();
	  assertTrue(deliveryContent.contains(expectedName));
	  assertTrue(deliveryContent.contains(expectedCity));
	  assertTrue(deliveryContent.contains(expectedFullcity));
	  assertTrue(deliveryContent.contains(expectedCountry));
	  assertTrue(deliveryContent.contains(expectedPhone));
	  assertTrue(billingContent.contains(expectedName));
	  assertTrue(billingContent.contains(expectedCity));
	  assertTrue(billingContent.contains(expectedFullcity));
	  assertTrue(billingContent.contains(expectedCountry));
	  assertTrue(billingContent.contains(expectedPhone));
	  Assert.assertEquals("Review Your Order", login.reviewYour_order());
	  assertTrue(login.isOrder_tableDisplayed());
	  Assert.assertEquals(login.getPname(), expectedPname);
	  Assert.assertEquals(login.getproduct_Price(), expectedProduct_price);
	  login.CheakOfQuantity();

	  Assert.assertEquals(login.getPquantity(), expectedPquantity);

	  Assert.assertEquals(login.getPtotal(), expectedPtotal);
	  login.add_comment();
	  Thread.sleep(5000);
	  login.order_PlaceBtn();
	  login.viewCart();
	  login.Click_Delete();
	  Thread.sleep(3000);
	  Assert.assertEquals(Cart_is_empty, login.get_Cart_is_empty());
	  
  }

//  @AfterTest
// public void closeBrowser() {
//		   driver.quit();
//  }

}
