package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Login_negativeScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	LoginPage loginObject = new LoginPage(driver);
    @Test (priority = 2)
    public void inCorrentUsernameAndPassword() throws InterruptedException {
    	Thread.sleep(2000);
    	homeObject.openLoginPage();
    	
    	Thread.sleep(2000);
    	
    	Assert.assertEquals("Login to your account", loginObject.loginMessage.getText());
    	
    	loginObject.userCanLogin("automation_excericse76810@gmail.com", "1234567");
    	Thread.sleep(2000);

    	Assert.assertEquals("Your email or password is incorrect!", loginObject.failedMessage.getText());
    	
    }
}
