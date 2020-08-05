package com.qa.verizon.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.ElementUtil;
import com.sun.xml.internal.messaging.saaj.soap.StringDataContentHandler;

public class iphoneXR extends BasePage{
	
	WebDriver driver;
	ElementUtil elementUtil;
	Properties prop;
	
	//Locators
	By coralColor = By.xpath("//div[@class='deviceConfig padTop6 border_bottomBlack padBottom30']//div[4]//div[1]");
	By memory = By.xpath("//div[contains(@class,'positionRelative border_black noTopBorder inStock')]//p[contains(@class,'fontSize_12 textAlignLeft fontDSStd-55Rg sizeText')]");
	By price = By.xpath("//div[contains(@class,'cursorPointer height100p positionRelative border_grayThree')]//div[contains(@class,'pad8 noRightPad')]");
	By ctnBtn = By.id("ATC-Btn");
	By zipCode = By.xpath("//input[@id='zipcode']");
//	By confirmBtn = By.cssSelector("body.ReactModal__Body--open:nth-child(2) div.ReactModalPortal:nth-child(13) div.ReactModal__Overlay.ReactModal__Overlay--after-open.Overlay.mobile-overlay-layout.add-to-cart.zipcode-modal div.ReactModal__Content.ReactModal__Content--after-open.add-to-cart-modal.Overlay-modal div.modal-content.modal-content-scroll div.AddToCartModalContent.height100p form.AddToCartForm > button.defaultPrimaryCTA");
	By confirmBtn = By.xpath("//button[contains(@class,'defaultPrimaryCTA')]");
	By newCustomerBtn = By.className("margin8");
	By phoneName = By.xpath("//*[text()='iPhone® XR']");
	
	
	public iphoneXR(WebDriver driver) {
	this.driver = driver;
	elementUtil = new ElementUtil(driver);
	}
	
	public String getIphoneXRPagetitle(){
		return elementUtil.doGetPageTitle();
	}
	
	public void colorSizePrice() throws InterruptedException{
		elementUtil.doClick(coralColor);
		elementUtil.doClick(memory);
		elementUtil.doClick(price);
		Thread.sleep(3000);
		elementUtil.doClick(ctnBtn);
		Thread.sleep(3000);
	}
	public void enterZip() throws InterruptedException{
		elementUtil.doSendKeys(zipCode, "10011");
		//elementUtil.doSendKeys(zipCode, prop.getProperty("zipcode"));
		Thread.sleep(3000);
		elementUtil.doClick(confirmBtn);
		Thread.sleep(3000);
		//elementUtil.doClick(newCustomerBtn);
	}
	public void newCustomer() throws InterruptedException{
		elementUtil.doClick(newCustomerBtn);
		Thread.sleep(3000);
	}
	public void verifyPhone() throws InterruptedException{
		Thread.sleep(3000);
		String text = elementUtil.doGetText(phoneName);
		System.out.println(text);
		Assert.assertEquals(text, "iPhone® XR");
		
	}
	
	

}
