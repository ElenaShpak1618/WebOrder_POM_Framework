package com.webOrder.utils;

import org.testng.annotations.DataProvider;

public class WebOrder_TestData {

	@DataProvider (name = "login")
	public Object [][] login(){
		return new Object[][] {
			{"Tester","test","ScreenSaver","10","100","10","farid","100 john","brooklyn","new york","10012","12345437236","12/23"},
		};
	}
	

}


