package Automation_Project.Automation_Exercises.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Home_Page;
import pages.LoginPage;
import pages.Payment_Page;

public class Payment_negitev extends TestBase {
	HomePage home_Object= new HomePage(driver);
	Payment_Page payment_object =new Payment_Page(driver);
	String paymentMassage="Payment";
	LoginPage loginObject = new LoginPage(driver);
	Home_Page home = new Home_Page(driver);
String Order_Placed="Order Placed!".toUpperCase();

  @Test
  public void Payment() throws InterruptedException {
	  home_Object.openLoginPage();
	  Thread.sleep(3000);
	  loginObject.userCanLogin("omarmostafa@gmail.com", "123456879");
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500);");
	    Thread.sleep(3000);
	  home.addToCartButton();
	  home.alert_ContinueShopingButton();
	  payment_object.Payment_Page_Move();
	Assert.assertEquals(paymentMassage, payment_object.get_payment_Massage());
	payment_object.Payment_information("1234568","bassata","bassata","one","one");
    js.executeScript("window.scrollBy(0,200);");

	Assert.assertEquals(Order_Placed, payment_object.get_Order_Placed_Massage());
    payment_object.Payment_continue_Button();
		
		
		
	  
  }
}
