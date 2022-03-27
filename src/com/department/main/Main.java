package com.department.main;

import com.department.model.AdminDepartment;
import com.department.model.HrDepartment;
import com.department.model.TechDepartment;


public class Main {
	public static void main(String[] args) {

		
		//Creating AdminDepartment class object
		 
		
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		
		//Creating HRDepartment class object

		
		HrDepartment hr = new HrDepartment();
		System.out.println("\n\nWelcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		

		//Creating TechDepartment class object

		
		TechDepartment tech = new TechDepartment();
		System.out.println("\n\nWelcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
	}

}
