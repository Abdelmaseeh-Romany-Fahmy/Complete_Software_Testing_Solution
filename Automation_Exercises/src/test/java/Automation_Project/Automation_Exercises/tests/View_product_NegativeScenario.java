package Automation_Project.Automation_Exercises.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.View_Product;

public class View_product_NegativeScenario extends TestBase {
	HomePage home_Object= new HomePage(driver);
	View_Product view_product_object = new View_Product(driver);
	String write = "Write Your Review".toUpperCase();
  @Test
  public void view_product() throws InterruptedException {
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,800);");
	  view_product_object.view_button();
	  Assert.assertEquals(write, view_product_object.get_your_review());
	  view_product_object.get_name();
	  Thread.sleep(500);
	  view_product_object.get_email();
	  Thread.sleep(500);
	  view_product_object.get_review();
	  Thread.sleep(500);
	  view_product_object.click_submit_button();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollTo(0, 0);");
	  Thread.sleep(1000);
	  view_product_object.set_quantity("-1");
	  Thread.sleep(1000);
	  view_product_object.click_add_to_cart();
	  Thread.sleep(1000);
	  view_product_object.click_continue_shopping();
	  Thread.sleep(1500);
	  	  
  }
  
}
