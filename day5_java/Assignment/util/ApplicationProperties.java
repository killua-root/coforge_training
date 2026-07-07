package com.coforge.ems.util;

public class ApplicationProperties {
	//Database Connection properties
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/lol";
	public static final String username = "root";
	public static final String password = "Aotjjk@1904";
	//Database SQL queries
	public static final String insert = "insert into employee values(?,?,?,?)";
	public static final String update = "update employee set ename=?, esal=?, edno=? where eid=?";
	public static final String delete = "delete from employee where eid=?";
	public static final String find = "select * from employee where eid=?";
	public static final String findAll = "select * from employee";
	
	
	//Application Response Properties
	public static final String insertSuccess =
	"SUCCESS : Employee inserted";

	public static final String updateSuccess =
	"SUCCESS : Employee updated";

	public static final String deleteSuccess =
	"SUCCESS : Employee deleted";

	public static final String notFound =
	"Employee not found";

	public static final String DBFail =
	"FAILED : Database Error";

	public static final String validationFail =
	"FAILED : Invalid employee details";
	// Application Validation 
}
