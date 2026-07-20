package com.coforge.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping("home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		return mv;

	}

	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Insert")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		String result = "";
		boolean status = service.createEmployee(employee);
		if (status) {
			result = "SUCCESS : Employee Object Saved";
		} else {
			result = "FAILED : Employee Not Object Saved";
		}
		mv.addObject("result", result);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Update")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		String result = "";
		boolean status = service.updateEmployee(employee);
		if (status) {
			result = "SUCCESS : Employee Object Updated";
		} else {
			result = "FAILED : Employee Not Found";
		}
		mv.addObject("result", result);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Delete")
	public ModelAndView deleteEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		boolean status = service.deleteEmployee(employee);
		String result ="";
		if (status) {
			result = "SUCCESS : Employee Object Deleted";
		} else {
			result = "FAILED : Employee Not Deleted";
		}
		mv.addObject("result", result);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Find")
	public ModelAndView findEmployee(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		Employee emp = service.findEmployee(eid);
		String result ="";
		if (emp!=null) {
			result = emp.toString();
		} else {
			result = "FAILED : Employee Not Found";
		}
		mv.addObject("result", result);
		return mv;

	}
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "FindAll")
	public ModelAndView findAllEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		String result ="";
		List<Employee> emp = service.findAllEmployee();
		mv.addObject("result", emp);
		return mv;

	}
}
