package Automation_Project.Automation_Exercises.tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class AddToCart extends TestBase{
  HomePage homePage = new HomePage(driver);
  @Test(priority = 1)
  public void  addtocart() throws InterruptedException {
	  homePage.AddtoCart();
  }
  
}
