package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {
	private EmployeeDAO empDao = new EmployeeDAO();
	public int createEmployee(Employee employee) throws ClassNotFoundException,SQLException,InvalidEmployeeObjectException{
		int n = 0;
		if (employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0 ) 
			n=empDao.createEmployee(employee);
		else
			throw new InvalidEmployeeObjectException();
		  return n;
		
	}
	public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {

	    if(employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0) {

	        return empDao.updateEmployee(employee);
	    }

	    throw new InvalidEmployeeObjectException();
	}

	public int deleteEmployee(int id) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
	    return empDao.deleteEmployee(id);
	}

	public Employee findEmployee(int id) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
	    return empDao.findEmployee(id);
	}

	public ArrayList<Employee> findAllEmployees() throws InvalidEmployeeObjectException,ClassNotFoundException, SQLException {
	    return empDao.findAllEmployees();
	}
}
