package Automation_Project.Automation_Exercises.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation_Project.Automation_Exercises.data.LoginData;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends TestBase {
    HomePage homeObject = new HomePage(driver);
    LoginPage loginObject = new LoginPage(driver);
    @DataProvider(name = "LoginData")
    public Object[][] getExcelData() throws IOException {
        LoginData loginData = new LoginData();
        return loginData.getExcelLoginData();
    }

    @Test(priority = 2, dataProvider = "LoginData")
    public void testAllLoginScenario(String email, String password, String success) throws InterruptedException {
        homeObject.openLoginPage();
        Thread.sleep(2000);

        Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");

        loginObject.userCanLogin(email, password);
        Thread.sleep(2000);

        boolean successBoolean = Boolean.parseBoolean(success);
        
        if (successBoolean) {
            Assert.assertEquals(loginObject.logoutBtn.getText(), "Logout");
            loginObject.userCanLogout();
        } else {
            Assert.assertEquals(loginObject.failedMessage.getText(), "Your email or password is incorrect!");
        }

        Thread.sleep(2000);
    
    }
}
