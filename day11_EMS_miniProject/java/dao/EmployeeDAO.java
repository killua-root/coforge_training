package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.ApplicationProperties;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws ClassNotFoundException,SQLException{
		
		Connection con = DBUtil.getDBConnection();
		
		PreparedStatement ps = con.prepareStatement(ApplicationProperties.insert);
		ps.setInt(1, employee.getEid());
		ps.setString(2, employee.getEname());
		ps.setInt(3, employee.getEsalary());
		ps.setInt(4, employee.getDno());
		int n = ps.executeUpdate();
		return n;
	}
	public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
	    Connection con = DBUtil.getDBConnection();

	    

	    PreparedStatement ps = con.prepareStatement(ApplicationProperties.update);

	    ps.setString(1, employee.getEname());
	    ps.setInt(2, employee.getEsalary());
	    ps.setInt(3, employee.getDno());
	    ps.setInt(4, employee.getEid());
	    
	    int n = ps.executeUpdate();

	    return n;
	}

	public int deleteEmployee(int id) throws ClassNotFoundException, SQLException {
	    Connection con = DBUtil.getDBConnection();

	    PreparedStatement ps = con.prepareStatement(ApplicationProperties.delete);

	    ps.setInt(1, id);

	    return ps.executeUpdate();
	}

	public Employee findEmployee(int id) throws ClassNotFoundException, SQLException {
	    Connection con = DBUtil.getDBConnection();

	    PreparedStatement ps = con.prepareStatement(ApplicationProperties.find);

	    ps.setInt(1, id);

	    ResultSet rs = ps.executeQuery();

	    Employee emp = null;

	    if(rs.next()) {
	        emp = new Employee(
	                rs.getInt(1),
	                rs.getString(2),
	                rs.getInt(3),
	                rs.getInt(4));
	    }

	    return emp;
	}

	public ArrayList<Employee> findAllEmployees() throws ClassNotFoundException, SQLException {

	    Connection con = DBUtil.getDBConnection();

	    

	    PreparedStatement ps = con.prepareStatement(ApplicationProperties.findAll);

	    ResultSet resultSet = ps.executeQuery();

	    ArrayList<Employee> list = new ArrayList<>();

	    while(resultSet.next()) {
//	    	Employee employee = new Employee();
//	    	employee.setEid(resultSet.getInt("eid"));
//	    	employee.setEname(resultSet.getString("ename"));
//	    	employee.setEid(resultSet.getInt("esal"));
//	    	employee.setEid(resultSet.getInt("edno"));
//
//	    	list.add(employee);
	    	
	        list.add(new Employee(
	        		resultSet.getInt("eid"),
	        		resultSet.getString("ename"),
	                resultSet.getInt("esal"),
	                resultSet.getInt("edno")));
	    }

	    return list;
	}
}
