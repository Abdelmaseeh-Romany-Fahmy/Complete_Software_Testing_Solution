package Automation_Project.Automation_Exercises.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation_Project.Automation_Exercises.data.ContactData;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUs_Tests extends TestBase{
	HomePage homeObject = new HomePage(driver);
	ContactUsPage contactUs  = new ContactUsPage(driver);
	@DataProvider(name="ContactData")
	public Object[][] getExcelData() throws IOException{
		ContactData contactData = new ContactData();
		  
		return contactData.getExcelLoginData();
	}
	@Test (priority = 3,dataProvider = "ContactData")
	public void testContactUs_validData(String name,String email,String subject,String message) throws AWTException {
		homeObject.openContactPage();
		Assert.assertEquals("GET IN TOUCH", contactUs.contactUsMessage.getText());
	    contactUs.userCanContactUs(name, email, subject, message);
	}

	
}
