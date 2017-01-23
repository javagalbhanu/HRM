package com.hrm.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Property;
import generics.Utility;

public class BasePage {
  public Logger log=Logger.getLogger(this.getClass());
  public WebDriver driver;
  public String configFile;
  public long timeout;
  
  public BasePage(WebDriver driver){
	  this.driver=driver;
	  configFile=AutomationConstants.CONFIG_PATH+AutomationConstants.CONFIG_FILE;
	  timeout=Long.parseLong(Property.getPropertyValue(configFile, "EXPLICIT"));
  }
  
  public void waitTillElementIsVisible(WebElement element){
	  new WebDriverWait(driver,timeout)
	  .until(ExpectedConditions.visibilityOf(element));
  }
  
  public void verifyURLis(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlToBe(expectedUrl));
  }
  
  public void verifyURLhas(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
  }
  
  public boolean compareImage(String expectedImage,WebElement actualImageElement){
	  	String expectedImagePath=AutomationConstants.EXPECTED_PATH+expectedImage;
	  	int x=actualImageElement.getLocation().getX();
		int y=actualImageElement.getLocation().getY();
		int w=actualImageElement.getSize().getWidth();
		int h=actualImageElement.getSize().getHeight();
		String pageSnapShot=Utility.getPageScreenShot(driver,AutomationConstants.ACTUAL_PATH);
		String actualImagePath=Utility.cropImage(pageSnapShot,x,y,w,h,AutomationConstants.ACTUAL_PATH);
		if(Utility.compareImage(actualImagePath,expectedImagePath))
		{
			return true;
		}
		else
		{
			return false;
		}
  }
  
  public void moveToElement(WebElement element){
	  Actions actions=new Actions(driver);
	  actions.moveToElement(element).perform();
  }
  
}
