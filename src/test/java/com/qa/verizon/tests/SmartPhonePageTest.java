package com.qa.verizon.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.pages.HomePage;
import com.qa.verizon.pages.SmartPhones;

public class SmartPhonePageTest {

	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;
	SmartPhones smartPhones;
	
	@BeforeTest
	public void setUp() throws InterruptedException{
	basePage = new BasePage();
	prop = basePage.init_properties();
	String browserName = prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	homePage = new HomePage(driver);
	smartPhones = homePage.selectPhone(driver);
	smartPhones = new SmartPhones(driver);
	Thread.sleep(9000);
	}
	
	@Test(priority=1, description= "SmartPhone page title")
	public void verifySmartPhonesPageTitleTest(){
		String title1 = smartPhones.getSmartphonePageTitle();
		System.out.println(title1);
		Assert.assertEquals(title1, "Smartphones - Buy The Newest Cell Phones | Verizon Wireless");
	}
	@Test(priority=2, description = "click iphone XR ")
	public void clickIphoneXRTest(){
		smartPhones.clickPhone();
		
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
}
