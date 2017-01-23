package com.hrm.common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import generics.Utility;

public class CustomListener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
		String folder=AutomationConstants.SNAP_PATH;
		Utility.getDesktopScreenshot(folder);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
