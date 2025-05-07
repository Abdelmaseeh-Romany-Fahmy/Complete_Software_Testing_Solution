package Automation_Project.Automation_Exercises.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation_Project.Automation_Exercises.data.CheckoutData;
import Automation_Project.Automation_Exercises.data.CheckoutWithRegisterData;
import pages.CheckoutPage;
import pages.HomePage;
import pages.RegisterPage;

public class CheckoutWithRegisterTests extends TestBase{
	  HomePage homePage = new HomePage(driver);
     RegisterPage registerPage = new RegisterPage(driver);
     CheckoutPage checkoutPage = new CheckoutPage(driver);
     @DataProvider(name = "CheckoutDatas")
     public Object[][] getExcelData() throws IOException {
         CheckoutWithRegisterData checkoutData = new CheckoutWithRegisterData();
         return checkoutData.getExcelLoginData();
     }
     
     @Test(priority = 1, dataProvider = "CheckoutDatas")
     public void testcheckoutwithregister(
    		 String name , String email ,String password,
     		String day,String month,String year,
 			String firstName,String lastName,String company,String address,
 			String address2,String Country,String state,String city,String zipCode,
 			String mobileNumber , String message) throws InterruptedException 
     {
    		Assert.assertEquals("rgba(255, 165, 0, 1)", homePage.homeLink.getCssValue("color")); 
    		homePage.openRegisterationPage();
        	Assert.assertEquals("New User Signup!", registerPage.newUserMessage.getText());
        	registerPage.userCanRegister(name, email);
        	Thread.sleep(3000);
        	 Assert.assertEquals("ENTER ACCOUNT INFORMATION", registerPage.enterAccountMessage.getText());
 	  		Thread.sleep(3000);
 	  		  registerPage.enterAccountInformation(password, day, month, year, firstName, lastName, company, address, address2, Country, state, city, zipCode, mobileNumber);
 	  		Thread.sleep(3000);
 	  		  String successAccount = "Account Created!";
 	  		  Assert.assertEquals(successAccount.toUpperCase(), registerPage.successMesssage.getText());
 	  		  registerPage.continueAccount();
 	  		  
 	  		  Assert.assertEquals("Logged in as "+name, registerPage.loggedInMessage.getText());
 	  		  homePage.AddtoCart();
 	 	  		Thread.sleep(3000);
 	 	       Assert.assertEquals(checkoutPage.addressReview.getText() , address);
 	         checkoutPage.canCheckoutAndComment(message);
 	        registerPage.deleteAccount();
     }
}
