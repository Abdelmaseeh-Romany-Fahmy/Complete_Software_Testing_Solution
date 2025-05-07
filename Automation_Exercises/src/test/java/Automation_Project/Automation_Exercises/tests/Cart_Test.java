package Automation_Project.Automation_Exercises.tests;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import pages.CartPage;


public class Cart_Test extends TestBase{
	
	CartPage cartObject = new CartPage(driver);
	
	
//	@DataProvider(name = "cartExcelData")
//	public Object[][] getExcelData() throws IOException{
//		LoadExcelCartData cartData = new LoadExcelCartData();
//		return cartData.getExcelCartData();
//	}
	
@Test ()
  public void Add_Products_To_Cart() {
	
	  Assert.assertEquals("rgba(255, 165, 0, 1)", cartObject.homeLink.getCssValue("color"));
	  
	  cartObject.scrollToText();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.clickAddToCartHome();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.clickContinueShoping();
	  
	  cartObject.scrollBackToCart();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.openCartPage();
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)", cartObject.cartBtn.getCssValue("color"));
	  
	  Assert.assertEquals(cartObject.tapleRows.size(), 2);
	  
	  
	  Assert.assertEquals(cartObject.DescriptionProduct4.getText(), "Stylish Dress\n"
		  		+ "Women > Dress");
		  		  
		  Assert.assertEquals(cartObject.PriceProduct4.getText(), "Rs. 1500");
		  
		  Assert.assertEquals(cartObject.QuantityProduct4.getText(), "1");
		  
		  Assert.assertEquals(cartObject.TotalProduct4.getText(), "Rs. 1500");
		  
		  cartObject.DeleteProduct4();
		  
		  try {
			    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		  
		  Assert.assertEquals(cartObject.tapleRows.size(), 1);
		  
		  try {
			    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
	  
	  cartObject.navigateToProducts();
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)", cartObject.productsBtn.getCssValue("color"));
	  
	  cartObject.scrollToProduct1();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  
	  cartObject.hoverProduct1();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  
	  cartObject.addProduct1();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.clickContinueShoping();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.clickViewProduct2();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.addQuantity("3");
	  
	  cartObject.clickAddToCart();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  cartObject.clickViewCart();
	  
	  try {
		    Thread.sleep(1000); // 2000 milliseconds = 2 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)", cartObject.cartBtn.getCssValue("color"));

	  Assert.assertEquals(cartObject.tapleRows.size(), 3);
	  
	  Assert.assertEquals(cartObject.DescriptionProduct1.getText(), "Blue Top\n"
	  		+ "Women > Tops");
	  
	  Assert.assertEquals(cartObject.DescriptionProduct2.getText(), "Men Tshirt\n"
		  	+ "Men > Tshirts");
	  
	  Assert.assertEquals(cartObject.PriceProduct1.getText(), "Rs. 500");
	  
	  Assert.assertEquals(cartObject.PriceProduct2.getText(), "Rs. 400");
	  
	  Assert.assertEquals(cartObject.QuantityProduct1.getText(), "1");
	  
	  Assert.assertEquals(cartObject.QuantityProduct2.getText(), "3");
	  
	  Assert.assertEquals(cartObject.TotalProduct1.getText(), "Rs. 500");
	  
	  Assert.assertEquals(cartObject.TotalProduct2.getText(), "Rs. 1200");
	  
	  cartObject.DeleteProduct1();
	  
	  cartObject.DeleteProduct2();
	  
	  try {
		    Thread.sleep(3000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  Assert.assertEquals(cartObject.tapleRows.size(), 1);
	  
	  
	  
  }
}
