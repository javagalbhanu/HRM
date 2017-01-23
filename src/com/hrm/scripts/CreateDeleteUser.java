package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.common.BaseTest;
import com.hrm.pages.AddEmployeePage;
import com.hrm.pages.AddUserPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeListPage;
import com.hrm.pages.SystemUsersPage;

public class CreateDeleteUser extends BaseTest {
	@Test
	public void testCreateDeleteUser(){
		//click PIM 
				DashboardPage d=new DashboardPage(driver);
				d.clickPIM_Menu();
				//click Add Employee
				d.clickaddEmployee_Menu();
				//enter first name
				AddEmployeePage a=new AddEmployeePage(driver);
				a.setFirstName("bhanu");
				//enter last name
				a.setLastName("prakash");
				//click save
				a.clickSave();
				//goto admin->UM-Users
				EmployeeListPage e=new EmployeeListPage(driver);
				e.clickAdmin_Menu();
				e.moveToUserManagement_Menu();
				e.clickUsers_Menu();
				
				SystemUsersPage s=new SystemUsersPage(driver);
				s.clickAdd();
				
				AddUserPage u=new AddUserPage(driver);
				u.setEmpName("bhanu prakash");
				u.setuserName("bhanu");
				u.setPassword("bhanu");
				u.setconfirmPwd("bhanu");
				u.clickSave();
				
				s.verifyUserPresentInTable("bhanu");
				s.selectUserCheckBox("bhanu");
				s.clickDelete();
				s.clickOK_OfDeleteRecordPopup();
				s.verifyUserNotPresentInTable("bhanu");
				
	}

}
