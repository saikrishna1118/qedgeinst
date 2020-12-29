package com.qedge.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
      WebDriver driver;
      
	  public HomePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	  @FindBy(how=How.LINK_TEXT,using="New Batches")
	  WebElement link_NewBatches;
	  
	  @FindBy(linkText="Register")
	  WebElement link_Register;
	  
	  @FindBy(how=How.LINK_TEXT, using="Placements")
	  WebElement link_Placements;
	  
	  @FindBy(how=How.LINK_TEXT, using="Resources")
	  public WebElement link_Resources;
	  
	  @FindBy(how=How.LINK_TEXT, using="Reviews")
	  WebElement link_Reviews;
	  
	  @FindBy(how=How.XPATH, using="//a[@target='_blank' and @role='button']")
	  WebElement btn_ViewMore;
	  
	  @FindBy(how=How.XPATH, using="//ul[@id='menu-mobile-menu']//descendant::a[text()='Projects']")
      WebElement link_Projects;
	  
	  @FindBy(how=How.ID, using="wpcs_tab_12516")
      WebElement btn_RegisterforDemo;
	 
	  @FindBy(how=How.XPATH, using="//a[@class='q8c6tt-0 jlzTty']")
      WebElement link_Whatsapp;
	  
	  
	  @FindBy(how=How.XPATH, using="//div[@class='elementor-grid-item']/child::a[contains(@class, 'item-957c75f')]")
	  WebElement link_Facebook;
	  
	  
	  public void clickNewBatches(){
		  link_NewBatches.click();
	  }
	
	  public void clickRegister(){
		  link_Register.click();
	  }
	  
	  public void clickPlacements(){
		  link_Placements.click();
	  }
	  
	  public void clickResources(){
		  link_Resources.click();
	  }
	  
	  public void clickReviews(){
		  link_Reviews.click();
	  }
	
	  public void clickViewMore(){
		  btn_ViewMore.click();
	  }
	  
	  public void clickProjects(){
		  link_Projects.click();
	  }
	  
	  public void clickRegisterforDemo(){
		  btn_RegisterforDemo.click();
	  }
	  
	  public void clickWhatsapp(){
		  link_Whatsapp.click();
	  }
	  
	  public void clickFacebook(){
		  link_Facebook.click();
	  }
	  
	   
}

