package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.hrm.common.HomePage;

public class SystemUsersPage extends HomePage{
	
	@FindBy(id="btnAdd")
	private WebElement btnAdd;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement ok;
	
	public SystemUsersPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickAdd(){
		btnAdd.click();
	}
	
	public void verifyUserPresentInTable(String un){
		String xp="//table[@id='resultTable']//a[.='"+un+"']";
		System.out.println("XPATH:"+xp);
		boolean usrPresent=true;
		try{
			WebElement element = driver.findElement(By.xpath(xp));
			waitTillElementIsVisible(element);
			Reporter.log("PASS:User Present in Table:"+un,true);
			usrPresent=true;
		}
		catch(Exception e){
			Reporter.log("FAIL:User Not Present in Table:"+un,true);
			usrPresent=false;
		}
		Assert.assertTrue(usrPresent);
	}
	
	public void verifyUserNotPresentInTable(String un){
		String xp="//table[@id='resultTable']//a[.='"+un+"']";
		System.out.println("XPATH:"+xp);
		boolean usrPresent=true;
		try{
			WebElement element = driver.findElement(By.xpath(xp));
			waitTillElementIsVisible(element);
			Reporter.log("FAIL:User Present in Table:"+un,true);
			usrPresent=true;
		}
		catch(Exception e){
			Reporter.log("PASS:User Not Present in Table:"+un,true);
			usrPresent=false;
		}
		Assert.assertFalse(usrPresent);
	}
	public void selectUserCheckBox(String un){
	 String xp="//a[.='"+un+"']/../..//input[@type='checkbox']";
	 driver.findElement(By.xpath(xp)).click();
	}
	
	public void clickDelete(){
		btnDelete.click();
	}
	
	public void clickOK_OfDeleteRecordPopup(){
		ok.click();
	}
	
}
