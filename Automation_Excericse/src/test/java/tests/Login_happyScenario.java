package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Login_happyScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	LoginPage loginObject = new LoginPage(driver);
    @Test (priority = 1)
    public void correntUsernameAndPassword() throws InterruptedException {
    	Thread.sleep(2000);
    	homeObject.openLoginPage();
    	
    	Thread.sleep(2000);
    	
    	Assert.assertEquals("Login to your account", loginObject.loginMessage.getText());
    	
    	loginObject.userCanLogin("automation_excericse@gmail.com", "123456789");
    	Thread.sleep(2000);

    	Assert.assertEquals("Logout", loginObject.logoutBtn.getText());
    	
    	loginObject.userCanLogout();
    	Thread.sleep(2000);
    }
}
