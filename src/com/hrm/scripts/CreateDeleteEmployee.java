package com.hrm.scripts;

import org.testng.annotations.Test;
import com.hrm.common.BaseTest;
import com.hrm.pages.AddEmployeePage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeListPage;

import generics.Excel;

public class CreateDeleteEmployee extends BaseTest
{//because of implicit login we will be in Dash board page
	@Test
	public void testCreateDeleteEmployee() throws InterruptedException{
		String sheet="CreateDeleteEmployee";
		String fn=Excel.getCellValue(INPUT_PATH,sheet,1,0);
		String ln=Excel.getCellValue(INPUT_PATH,sheet,1,1);	
		//click PIM 
		DashboardPage d=new DashboardPage(driver);
		d.clickPIM_Menu();
		//click Add Employee
		d.clickaddEmployee_Menu();
		//enter first name
		AddEmployeePage a=new AddEmployeePage(driver);
		a.setFirstName(fn);
		//enter last name
		a.setLastName(ln);
		//click ssave
		a.clickSave();
		//click PIM ->EmployeeList
		a.clickPIM_Menu();
		a.clickEmployeeList_Menu();
		//verify that employee is present in 'Employee Table'
		EmployeeListPage e=new EmployeeListPage(driver);
		e.verifyEmployeePresentInTable(fn);
		//select the check box employee
		e.selectEmployeeCheckBox(fn);
		//click delete
		e.clickDelete();
		//click OK on Popup
		e.clickOK_OfDeleteRecordPopup();
		Thread.sleep(1000);
		e.verifyEmployeeNotPresentInTable(fn);
		Thread.sleep(2000);
	}
}




