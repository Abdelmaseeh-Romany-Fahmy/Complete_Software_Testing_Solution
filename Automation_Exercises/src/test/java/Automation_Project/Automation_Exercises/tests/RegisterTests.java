package Automation_Project.Automation_Exercises.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation_Project.Automation_Exercises.data.LoginData;
import Automation_Project.Automation_Exercises.data.RegisterData;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTests extends TestBase{
    HomePage homeObject = new HomePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    @DataProvider(name = "RegisterData")
    public Object[][] getExcelData() throws IOException {
        RegisterData registerData = new RegisterData();
        return registerData.getExcelLoginData();
    }
    @Test(priority = 1, dataProvider = "RegisterData")
    public void testAARegister(String name , String email ,String password,
    		String day,String month,String year,
			String firstName,String lastName,String company,String address,
			String address2,String Country,String state,String city,String zipCode,
			String mobileNumber ,String Flag) throws InterruptedException {
    	Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color")); 
    	homeObject.openRegisterationPage();
    	Assert.assertEquals("New User Signup!", registerPage.newUserMessage.getText());
    	registerPage.userCanRegister(name, email);
    	Thread.sleep(3000);
    	if(Boolean.parseBoolean(Flag)) {
    		  Assert.assertEquals("ENTER ACCOUNT INFORMATION", registerPage.enterAccountMessage.getText());
    	  		Thread.sleep(3000);
    	  		  registerPage.enterAccountInformation(password, day, month, year, firstName, lastName, company, address, address2, Country, state, city, zipCode, mobileNumber);
    	  		Thread.sleep(3000);
    	  		  String successAccount = "Account Created!";
    	  		  Assert.assertEquals(successAccount.toUpperCase(), registerPage.successMesssage.getText());
    	  		  registerPage.continueAccount();
    	  		  
    	  		  Assert.assertEquals("Logged in as "+name, registerPage.loggedInMessage.getText());
    	  		  
    	  		  registerPage.deleteAccount();
    	  		  
    	  		  
    	  		  Assert.assertTrue(registerPage.deleteMessage.getText().equalsIgnoreCase("Account Deleted!"));
    	  		  
    	  		  registerPage.continueAccount();
    	  		  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color")); 
    	}
    	else
    	{
    		 Assert.assertEquals("Email Address already exist!", registerPage.failedMessage.getText());
    	}
  		
  	    
  	  
      
    
    }
    
    
}
