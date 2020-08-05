package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.ElementUtil;

public class SmartPhones extends BasePage{
	
	WebDriver driver;
	ElementUtil elementUtil;	
	
	//Locators
	By iphoneXR = By.xpath("//div[@id='tile_dev10680044']//div[@class='NHaasTX75Bd marginBottom5']//span");
	////div[@id='tile_dev10680044']//div[@class='NHaasTX75Bd marginBottom5']//span
	
	
	public SmartPhones(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getSmartphonePageTitle(){
		return elementUtil.doGetPageTitle();
	}
	
	public void clickPhone(){
		elementUtil.doClick(iphoneXR);
	}
	
	
	
}
