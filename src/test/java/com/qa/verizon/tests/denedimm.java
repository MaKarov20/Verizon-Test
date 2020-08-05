package com.qa.verizon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.verizon.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class denedimm {
	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.verizon.com/smartphones/apple-iphone-xr/");
				
	WebElement dd = driver.findElement(By.id("testingDropdown"));
	
	By coralColor = By.xpath("//div[@class='deviceConfig padTop6 border_bottomBlack padBottom30']//div[4]//div[1]");
	By memory = By.xpath("//div[contains(@class,'positionRelative border_black noTopBorder inStock')]//p[contains(@class,'fontSize_12 textAlignLeft fontDSStd-55Rg sizeText')]");
	By price = By.xpath("//div[contains(@class,'cursorPointer height100p positionRelative border_grayThree')]//div[contains(@class,'pad8 noRightPad')]");
	By ctnBtn = By.id("ATC-Btn");
	By zipCode = By.xpath("//input[@id='zipcode']");
	By confirmBtn = By.xpath("//button[contains(@class,'defaultPrimaryCTA')]");
	By newCustomerBtn = By.className("margin8");
	
	
	WebElement color = driver.findElement(coralColor);
	color.click();
	WebElement memmory = driver.findElement(memory);
	memmory.click();
	WebElement prcey = driver.findElement(price);
	prcey.click();
	
	WebElement button = driver.findElement(ctnBtn);
	button.click();
	WebElement zip = driver.findElement(zipCode);
	zip.sendKeys("79762");
	WebElement confirm = driver.findElement(confirmBtn);
	confirm.click();
	
//	ElementUtil.doClick(coralColor);
//	elementUtil.doClick(memory);
//	elementUtil.doClick(price);
//	Thread.sleep(3000);
//	elementUtil.doClick(ctnBtn);
//	Thread.sleep(3000);
//  
}}
