package com.qa.verizon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class BasePage {
	
	WebDriver driver;
	Properties prop;
	
public WebDriver init_driver(String browserName){
	System.out.println("Browser name is "+ browserName);
	if (browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("safari")) {
		WebDriverManager.getInstance(SafariDriver.class).setup();
		driver = new SafariDriver();
	}
	else {
	System.out.println("Browser name"+ browserName+"is not found");
	}
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
}
public Properties init_properties(){
	prop = new Properties();
	String path ="./src/main/java/com/qa/verizon/config/config.properties";
	try {
		FileInputStream ip = new FileInputStream(path);
		prop.load(ip);
	} catch (FileNotFoundException e) {
		System.out.println("config properties file error");
	}catch (IOException e) {
		e.printStackTrace();
	}
	return prop;
	
}

}
