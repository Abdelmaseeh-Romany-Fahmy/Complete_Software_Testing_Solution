package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class Register_negativeScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	RegisterPage registerObject = new RegisterPage(driver);
	@Test (priority = 2)
	  public void tetRegister_ExistEmail() throws InterruptedException {
		  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color")); 
		  Thread.sleep(3000);
		  
		  homeObject.openRegisterationPage();
		  Thread.sleep(3000);
		  
		  Assert.assertEquals("New User Signup!", registerObject.newUserMessage.getText());
		 
		  registerObject.userCanRegister("automation_excericse76810","automation_excericse@gmail.com");
		  Thread.sleep(3000);
		  
		  Assert.assertEquals("Email Address already exist!", registerObject.failedMessage.getText());
		  
		  
	  }
}
