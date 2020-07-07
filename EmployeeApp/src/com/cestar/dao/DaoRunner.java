package com.cestar.dao;

import com.cestar.model.Employee;

public class DaoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao obj = new EmployeeDao();
		
	//	obj.getConnection();
		
		Employee e = new Employee(888,"Rajbeer","123-456-8888","Windsor");
		
		
		obj.insert(e);
		

	}

}
