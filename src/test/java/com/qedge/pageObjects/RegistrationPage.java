package com.qedge.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	  public RegistrationPage(WebDriver driver){
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}

	@FindBy(how=How.XPATH, using="//input[@name='your-name'][1]")
	WebElement txtName;
	
	@FindBy(how=How.XPATH, using="//input[@name='emailid'][1]")
	WebElement txtEmail;
	
	@FindBy(how=How.XPATH, using="//input[@name='phonenumber'][1]")
	WebElement txtPhnNo;
	
	@FindBy(how=How.XPATH, using="//input[@name='course'][1]")
	WebElement txtCourseName;
	
	@FindBy(how=How.XPATH, using="//input[@value='Classroom Training']")
	WebElement chkbxClassroomTraining;
	
	@FindBy(how=How.XPATH, using="//input[@value='Online Training']")
	WebElement chkbxOnlineTraining;
	
	@FindBy(how=How.XPATH, using="//input[@value='Join Demo']")
	WebElement btnJoinDemo;
	
	public void setName(String Name){
		txtName.clear();
		txtName.sendKeys(Name);
	}
	
	public void setEmail(String Email){
		txtEmail.clear();
		txtEmail.sendKeys(Email);
	}
	
	public void setPhNo(String Number){
		txtPhnNo.clear();
		txtPhnNo.sendKeys(Number);
	}
	
	public void setCourseName(String Course){
		txtCourseName.clear();
		txtCourseName.sendKeys(Course);
	}
	
	public void selectTrainingType(String TrngType){
		if(TrngType.contains("Classroom Training")){
			chkbxClassroomTraining.click();
		}
		else{
			chkbxOnlineTraining.click();
		}
	}
	public void clickJoinDemo(){
		btnJoinDemo.click();
	
	}
	}
	
	
	
	
	
	
