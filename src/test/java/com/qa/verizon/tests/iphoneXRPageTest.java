package com.qa.verizon.tests;

import java.beans.Customizer;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.pages.HomePage;
import com.qa.verizon.pages.iphoneXR;

public class iphoneXRPageTest {
	
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;
	iphoneXR iphoneXR;
	
@BeforeTest
public void setUp() throws InterruptedException{
	basePage = new BasePage();
	prop = basePage.init_properties();
	String browserName = prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	homePage = new HomePage(driver);
	iphoneXR = homePage.memoryPrice(driver);
	iphoneXR = new iphoneXR(driver);
}
@Test(priority=1, description= "get iphoneXR page title")
public void verifyIphoneXRPageTitleTest(){
	String title = iphoneXR.getIphoneXRPagetitle();
	System.out.println(title);
	Assert.assertEquals(title, "Apple iPhone XR: 6 Colors in 64, 256 & 512 GB | Verizon");
}
@Test(priority=2)
public void chooseColorPrice() throws InterruptedException{
	iphoneXR.colorSizePrice();
}
@Test(priority = 3)
public void enterZipcode() throws InterruptedException{
	iphoneXR.enterZip();
}
@Test(priority =4)
public void Customizer() throws InterruptedException{
	iphoneXR.newCustomer();
}
@Test(priority = 5)
public void veriyPhoneNamee() throws InterruptedException{
 iphoneXR.verifyPhone();
}
@AfterTest
public void teardown(){
	driver.quit();
}

}
