package com.kh.edu;

import java.util.Date;
import java.util.Calendar;

public class TestJavaApi {
	public static void main(String[] args) {
		
		//Date API 사용
		Date todayDate = new Date();
		System.out.println(todayDate.getMonth()+1 + "/" + todayDate.getDate());
		
		//Calendar API 사용
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.MONTH)+1 + "/" + today.get(Calendar.DATE));
		
	}
}
