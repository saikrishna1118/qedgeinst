package com.qedge.testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qedge.pageObjects.HomePage;
import com.qedge.testBase.BaseClass;

public class TC_ProjectsPage_003 extends BaseClass {

	@Test
	public void projectpage(){
		
		logger.info("*** Starting TC_ProjectsPage_003 ***");
		
		Actions act= new Actions(driver);
		HomePage hm= new HomePage(driver);
        act.moveToElement(hm.link_Resources);
		hm.clickProjects();
		
		logger.info("*** validating the details ***");
		
		String Expected="Projects @ QEdge Technologies";
		Assert.assertEquals(Expected, driver.getTitle());
	}
	
	
}
