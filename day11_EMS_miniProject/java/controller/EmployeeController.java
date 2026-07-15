package com.coforge.ems.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

public class EmployeeController {

    private EmployeeService service = new EmployeeService();

    // CREATE
    public String createEmployee(Employee employee) {

        try {

            int n = service.createEmployee(employee);

            if (n == 1)
                return ApplicationProperties.insertSuccess;
            else
                return "FAILED : Employee record not inserted";

        } catch (ClassNotFoundException | SQLException e) {

            return ApplicationProperties.DBFail;

        } catch (InvalidEmployeeObjectException e) {

            return e.toString();

        }
    }

    // UPDATE
    public String updateEmployee(Employee employee) {

        try {

            int n = service.updateEmployee(employee);

            if (n == 1)
                return "SUCCESS : Employee record updated";
            else
                return "FAILED : Employee record not updated";

        } catch (ClassNotFoundException | SQLException e) {

            return ApplicationProperties.DBFail;

        } catch (InvalidEmployeeObjectException e) {

            return e.toString();

        }
    }

    //DELETE
    public String deleteEmployee(int id) {

        try {

            int n = service.deleteEmployee(id);

            if (n == 1)
                return "SUCCESS : Employee record deleted";
            else
                return "FAILED : Employee record not deleted";

        } catch (ClassNotFoundException | SQLException e) {

            return ApplicationProperties.DBFail;

        } catch (InvalidEmployeeObjectException e) {

            return e.toString();

        }
    }
    // FIND BY ID
    public Employee findEmployee(int id) {

        try {

            return service.findEmployee(id);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(ApplicationProperties.DBFail);

        } catch (InvalidEmployeeObjectException e) {

            System.out.println(e);

        }

        return null;
    }

    // FIND ALL
    public ArrayList<Employee> findAllEmployees() {

        try {

            return service.findAllEmployees();

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(ApplicationProperties.DBFail);

        } catch (InvalidEmployeeObjectException e) {

            System.out.println(e.toString());

        }

        return new ArrayList<>();
    }
}