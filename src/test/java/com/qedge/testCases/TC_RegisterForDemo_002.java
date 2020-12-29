package com.qedge.testCases;

import org.testng.annotations.Test;

import com.qedge.pageObjects.HomePage;
import com.qedge.pageObjects.RegistrationPage;
import com.qedge.testBase.BaseClass;

public class TC_RegisterForDemo_002 extends BaseClass {
 

	
	@Test
	public void registration() throws Exception{
		
		logger.info("*** Starting TC_RegisterForDemo_002 ***");
		HomePage hm = new HomePage(driver);
		hm.clickRegister();
		Thread.sleep(5000);
		RegistrationPage rp= new RegistrationPage(driver);
		logger.info("*** Entering the details ***");
		rp.setName("ShyamKumar");
		rp.setEmail("shyamakumar111@gmail.com");
		rp.setPhNo("1234567890");
		rp.setCourseName("Manual Testing");
		rp.selectTrainingType("Online Training");
		//rp.clickJoinDemo();
	}
	
}

