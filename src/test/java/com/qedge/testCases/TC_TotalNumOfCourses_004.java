package com.qedge.testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qedge.pageObjects.HomePage;
import com.qedge.testBase.BaseClass;

public class TC_TotalNumOfCourses_004 extends BaseClass {
	
	
	@Test
	public void getTotalCourses(){
		logger.info("*** Starting TC_TotalNumOfCourses_004 ***");
	HomePage hm= new HomePage(driver);
	hm.clickViewMore();
	Set <String> handle =driver.getWindowHandles();
	ArrayList <String> h= new ArrayList(handle);
	driver.switchTo().window(h.get(1));
	
	List <WebElement> x= driver.findElements(By.xpath("//figcaption[@class='widget-image-caption wp-caption-text']"));
	System.out.println(x.size());
	for(WebElement x1:x){
		System.out.println(x1.getText());
	}
	}

}
