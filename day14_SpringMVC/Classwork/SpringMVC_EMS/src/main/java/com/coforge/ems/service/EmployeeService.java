package com.coforge.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.ems.model.Employee;

@Service
public class EmployeeService {
	private List<Employee> list = new ArrayList<>();
	public boolean createEmployee(Employee employee) {
		boolean status = list.add(employee);
		return status;
	}
	public boolean updateEmployee(Employee employee) {
		boolean status = false;
		for(Employee e:list) {
			if(e.getEid()==employee.getEid()) {
				e.setEname(employee.getEname());
				e.setEsalary(employee.getEsalary());
				e.setDno(employee.getDno());
				status = true;
			}
		}
		return status;
	}
	public boolean deleteEmployee(Employee employee) {
		boolean status = false;
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getEid()==employee.getEid()) {
				list.remove(i);
			    status=true;
			}
		}
		return status;
	}
	public Employee findEmployee(int eid) {
		for(int i = 0; i<list.size();i++) {
			Employee emp = list.get(i);
			if(list.get(i).getEid()==eid) {
				return emp;
			}
		}
		return null;
	}
	public List<Employee> findAllEmployee() {
		return list;
	}
}