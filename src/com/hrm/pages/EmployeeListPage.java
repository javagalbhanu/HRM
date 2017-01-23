package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.hrm.common.HomePage;

public class EmployeeListPage extends HomePage {

	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement ok;
	
	public EmployeeListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void verifyEmployeePresentInTable(String fn){
		String xp="//table[@id='resultTable']//a[.='"+fn+"']";
		System.out.println("XPATH:"+xp);
		boolean empPresent=true;
		try{
			WebElement element = driver.findElement(By.xpath(xp));
			waitTillElementIsVisible(element);
			Reporter.log("PASS:Employee Present in Table:"+fn,true);
			empPresent=true;
		}
		catch(Exception e){
			Reporter.log("FAIL: Employee Not Present in Table:"+fn,true);
			empPresent=false;
		}
		Assert.assertTrue(empPresent);
	}
	
	public void verifyEmployeeNotPresentInTable(String fn){
		String xp="//table[@id='resultTable']//a[.='"+fn+"']";
		System.out.println("XPATH:"+xp);
		boolean empPresent=true;
		try{
			WebElement element = driver.findElement(By.xpath(xp));
			waitTillElementIsVisible(element);
			Reporter.log("FAIL:Employee Present in Table:"+fn,true);
			empPresent=true;
		}
		catch(Exception e){
			Reporter.log("PASS:Employee Not Present in Table:"+fn,true);
			empPresent=false;
		}
		Assert.assertFalse(empPresent);
	}
	public void selectEmployeeCheckBox(String fn){
	 String xp="//a[.='"+fn+"']/../..//input[@type='checkbox']";
	 driver.findElement(By.xpath(xp)).click();
	}
	
	public void clickDelete(){
		btnDelete.click();
	}
	
	public void clickOK_OfDeleteRecordPopup(){
		ok.click();
	}
	
	
	
	

}
