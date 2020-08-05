package com.qa.verizon.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.pages.HomePage;

public class HomePageTest1 extends BasePage{
	WebDriver driver;
	BasePage basePage;
	HomePage homePage;
	Properties prop;

@BeforeTest
public void setUp() throws InterruptedException{
	basePage = new BasePage();
	prop = basePage.init_properties();
	String browserName = prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	homePage = new HomePage(driver);
	Thread.sleep(5000);
	
}
@Test(priority=1 , description = "HomePage title" )
public void verifyHomePageTitleTest(){
	String title = homePage.getHomePageTitle();
	System.out.println(title);  
	Assert.assertEquals(title, "Verizon: Wireless, Internet, TV and Phone Services | Official Site");
	
}
@Test(priority=2 , description = "")
public void hooverOverAncClickTest() throws InterruptedException{
	homePage.selectPhone(driver);
}

	
@AfterTest
public void tearDown(){
	driver.quit();
}

}
