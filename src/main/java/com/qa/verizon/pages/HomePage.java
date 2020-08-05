package com.qa.verizon.pages;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.ElementUtil;

public class HomePage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	BasePage basePage;
	Actions actions;
	
	//Locators
	By shop = By.xpath("//div[@class='gnav20-desktop']//div[@class='gnav20-global-nav-list gnav20-navigation-list']//div[1]//div[1]//button[2]");
	By phones = By.cssSelector("li[id='secondLevel3']");
	By smartPhones = By.partialLinkText("Smartpho");
	By iphoneXR = By.xpath("//div[@id='tile_dev10680044']//div[@class='NHaasTX75Bd marginBottom5']//span");
	//Constructors
	
	public HomePage(WebDriver driver) {
	 this.driver = driver;
	 elementUtil = new ElementUtil(driver);
	}
	
	public String getHomePageTitle(){
		return driver.getTitle();
	//	return elementUtil.doGetPageTitle();
	}
	
	public SmartPhones selectPhone(WebDriver driver) throws InterruptedException{
		actions = new Actions(driver);
      WebElement element1 = elementUtil.getElement(shop);
		actions.moveToElement(element1).build().perform();
		Thread.sleep(3000);	
		elementUtil.doClick(smartPhones);
		Thread.sleep(4000);
		return new SmartPhones(driver);
	}
	
	public com.qa.verizon.pages.iphoneXR memoryPrice(WebDriver driver) throws InterruptedException{
		actions = new Actions(driver);
	      WebElement element1 = elementUtil.getElement(shop);
//	WebElement element1 = driver.findElement(shop);
			actions.moveToElement(element1).build().perform();
			Thread.sleep(3000);	
			elementUtil.doClick(smartPhones);
	//		WebElement element = driver.findElement(smartPhones);
	//		element.click();
			Thread.sleep(4000);
		//WebElement element2 = elementUtil.getElement(iphoneXR);
			WebElement element2 = driver.findElement(iphoneXR);
			element2.click();
			return new iphoneXR(driver);
	}
	

	
	
	
	
}
