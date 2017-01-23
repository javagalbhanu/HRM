package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hrm.common.HomePage;

public class AddEmployeePage extends HomePage{

	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	public AddEmployeePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void setFirstName(String fn){
		firstName.sendKeys(fn);
	}
	
	public void setLastName(String ln){
		lastName.sendKeys(ln);
	}
	
	public void clickSave(){
		btnSave.click();
	}
}




