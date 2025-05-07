package Automation_Project.Automation_Exercises.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation_Project.Automation_Exercises.data.CheckoutData;
import Automation_Project.Automation_Exercises.data.LoginData;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckoutTests extends TestBase{
  HomePage homePage = new HomePage(driver);
  LoginPage loginObject = new LoginPage(driver);
  CheckoutPage checkoutPage = new CheckoutPage(driver);
  @DataProvider(name = "CheckoutData")
  public Object[][] getExcelData() throws IOException {
      CheckoutData loginData = new CheckoutData();
      return loginData.getExcelLoginData();
  }

  @Test(priority = 2, dataProvider = "CheckoutData")
  public void testcheckout(String email, String password, String message) throws InterruptedException {
	  homePage.openLoginPage();
      Thread.sleep(2000);

      Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");

      loginObject.userCanLogin(email, password);
      Thread.sleep(2000);
       homePage.AddtoCart();
       checkoutPage.canCheckoutAndComment(message);
      
      Thread.sleep(2000);
  
  }
  
}
