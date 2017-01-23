package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hrm.common.HomePage;

public class DashboardPage extends HomePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

}








