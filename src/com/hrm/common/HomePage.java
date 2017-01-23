package com.hrm.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//b[.='Admin']")
	private WebElement  Admin_Menu;
	
	@FindBy(xpath="//b[.='PIM']")
	private WebElement  PIM_Menu;
	
	@FindBy(xpath="//b[.='Dashboard']")
	private WebElement  Dashboard_Menu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmployee_Menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement employeeList_Menu;
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement userManagement_Menu;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement users_Menu;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickWelCome(){
		waitTillElementIsVisible(welcome);
		welcome.click();
	}
	
	public void clickLogout(){
		waitTillElementIsVisible(logout);
		logout.click();
	}
	
	public void clickPIM_Menu(){
		waitTillElementIsVisible(PIM_Menu);
		PIM_Menu.click();
	}
	
	public void clickaddEmployee_Menu(){
		waitTillElementIsVisible(addEmployee_Menu);
		addEmployee_Menu.click();
	}
	
	public void clickEmployeeList_Menu(){
		waitTillElementIsVisible(employeeList_Menu);
		employeeList_Menu.click();
	}
	
	public void moveToUserManagement_Menu(){
		waitTillElementIsVisible(userManagement_Menu);
//		moveToElement(userManagement_Menu);
		userManagement_Menu.click();
	}
	
	public void clickUsers_Menu(){
		waitTillElementIsVisible(users_Menu);
		users_Menu.click();
	}
	
	public void clickAdmin_Menu(){
		waitTillElementIsVisible(Admin_Menu);
		Admin_Menu.click();
	}
}








