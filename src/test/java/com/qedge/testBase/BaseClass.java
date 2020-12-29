package com.qedge.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

 public Properties configpropobj;	
 public Logger logger= LogManager.getLogger(this.getClass());
 
 public  WebDriver driver;
	    @Parameters("browser")
		@BeforeClass
		public void setUp(String br) throws IOException{
			
			//load config.properties file
			configpropobj =new Properties();
			FileInputStream configfile= new FileInputStream(".\\resources\\config.properties");
			configpropobj.load(configfile);
			//end of loading config.propertes file
			if(br.equalsIgnoreCase("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			}
			else if(br.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			driver.get(configpropobj.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		}
		
		
		@AfterClass
		public void tearDown(){
			driver.close();
		}
	}