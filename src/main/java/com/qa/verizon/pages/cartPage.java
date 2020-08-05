package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.ElementUtil;

public class cartPage extends BasePage{
	
	WebDriver driver;
	ElementUtil elementUtil;
	
	//Locators
	By vrfyPhone = By.xpath("//*[text()='iPhone® XR']");
	
	public void cartPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getChartPageTitle(){
		return elementUtil.doGetPageTitle();
	}

}
