package com.qedge.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qedge.testBase.BaseClass;

public class TC_TitleTest_001 extends BaseClass{

   
   
	
	@Test
	public void titleTest(){
		
		logger.info("*** Starting TC_TitleTest_001 ***");
		String Actual=driver.getTitle();
		String Expected="Best Software Testing Tools Training Institute in Hyderabad | QEdgeTech";
		Assert.assertEquals(Actual, Expected);
		logger.info("*** verifying login details   ***");
	}
	
}

