package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class Register_HappyScenario extends TestBase{
	HomePage homeObject = new HomePage(driver);
	RegisterPage registerObject = new RegisterPage(driver);
  @Test (priority = 1)
  public void tetRegister_NewUserName_MandatoryAndOptional() throws InterruptedException {
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color")); 
	  
	  homeObject.openRegisterationPage();
	  
	  Assert.assertEquals("New User Signup!", registerObject.newUserMessage.getText());
	 
	  registerObject.userCanRegister("automation_excericse76810","automation_excericse76810@gmail.com");
	  
	  Assert.assertEquals("ENTER ACCOUNT INFORMATION", registerObject.enterAccountMessage.getText());
	  
	  registerObject.enterAccountInformation("123456789",25,"12","2002","automation","excericse","Itworx","Fostat City","United States","aaaa","bbbb","2164","01012465987");
	  
	  ///طريقة اخري للكابيتال
	  String success = "Account Created!";
	  Assert.assertEquals(success.toUpperCase(), registerObject.successMesssage.getText());
	  
	  registerObject.continueAccount();
	  
	  Assert.assertEquals("Logged in as automation_excericse76810", registerObject.loggedInMessage.getText());
	  
	  registerObject.deleteAccount();
	  
	  
	  Assert.assertTrue(registerObject.deleteMessage.getText().equalsIgnoreCase("Account Deleted!"));
	  
	  registerObject.continueAccount();
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color")); 
	  
  }

}
