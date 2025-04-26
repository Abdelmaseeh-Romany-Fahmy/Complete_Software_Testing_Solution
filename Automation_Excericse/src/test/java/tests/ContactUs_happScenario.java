package tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPageWithDirectWay;
import pages.ContactUsPageWithRobotWay;
import pages.HomePage;

public class ContactUs_happScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	ContactUsPageWithRobotWay contactUsObject = new ContactUsPageWithRobotWay(driver);
  @Test
  public void testContactUs_validData() throws InterruptedException, AWTException {
	  homeObject.openContactPage();

	  Assert.assertEquals("GET IN TOUCH", contactUsObject.contactUsMessage.getText());
	  
	  contactUsObject.userCanContactUs("Abdelrahman Osama", "abdelarhamn@gmail.com", "Complain", "My order doesn't deliver yet");
  }
}
