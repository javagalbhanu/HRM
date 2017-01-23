package com.hrm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.common.HomePage;

public class AddUserPage extends HomePage{
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement empName;
	
	@FindBy(id="systemUser_userName")
	private WebElement userName;
	
	@FindBy(id="systemUser_password")
	private WebElement pwd;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confirmPwd;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	public AddUserPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void setEmpName(String name){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		empName.sendKeys(name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		empName.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setuserName(String name){
		userName.sendKeys(name);
	}
	
	public void setPassword(String pw){
		pwd.sendKeys(pw);
	}
	public void setconfirmPwd(String pw){
		confirmPwd.sendKeys(pw);
	}
	
	public void clickSave(){
		btnSave.click();
	}
}
