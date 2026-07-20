package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo repo;
    private Environment environment;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo repo, Environment environment) {
        this.repo = repo;
        this.environment = environment;
    }

    private void validateEmployee(Employee employee) {
        if (employee == null ||
            employee.getEid() <= 0 ||
            employee.getEname() == null ||
            employee.getEname().trim().isEmpty() ||
            employee.getEsalary() <= 0 ||
            employee.getDno() <= 0) {

            throw new InvalidEmployeeObjectException(
                    environment.getProperty("ems.invalid.employee-details"));
        }
    }

    @Override
    public boolean saveEmployee(Employee employee) {
        validateEmployee(employee);
        repo.save(employee);
        return true;
    }

    @Override
    public boolean updateEmployee(int eid, Employee employee) {

        validateEmployee(employee);

        if (!repo.existsById(eid)) {
            throw new EmployeeNotFoundException(
                    environment.getProperty("ems.invalid.employee-notFound"));
        }

        repo.save(employee);
        return true;
    }

    @Override
    public boolean deleteByEid(int eid) {

        if (eid <= 0) {
            throw new InvalidEmployeeObjectException(
                    environment.getProperty("ems.invalid.employee-details"));
        }

        if (!repo.existsById(eid)) {
            throw new EmployeeNotFoundException(
                    environment.getProperty("ems.invalid.employee-notFound"));
        }

        repo.deleteById(eid);
        return true;
    }

    @Override
    public Optional<Employee> findByEid(int eid) {

        if (eid <= 0) {
            throw new InvalidEmployeeObjectException(
                    environment.getProperty("ems.invalid.employee-details"));
        }

        Optional<Employee> employee = repo.findById(eid);

        if (employee.isEmpty()) {
            throw new EmployeeNotFoundException(
                    environment.getProperty("ems.invalid.employee-notFound"));
        }

        return employee;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return (List<Employee>) repo.findAll();
    }

    @Override
    public List<Employee> findByEname(String ename) {

        List<Employee> employees = repo.findByEname(ename);
        return employees;
    }

    @Override
    @Transactional
    public boolean deleteByEname(String ename) {

        int count = repo.deleteByEname(ename);


        return true;
    }

    @Override
    public List<Integer> getEidsList() {
        return repo.getEids();
    }

    @Override
    public String getInfo() {
        return repo.getInfo();
    }
}