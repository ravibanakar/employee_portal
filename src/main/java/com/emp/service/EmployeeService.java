package com.emp.service;

import com.emp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    /**
     * This service method will return the list of all employees
     *
     * @return
     */
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = populateEmployee();
        employeeList.add(employee);
        employee = populateEmployee();
        employee.setEmployeeId(6789);
        employee.setFirstName("Raju");
        employee.setDept("075");
        employeeList.add(employee);
        employee = populateEmployee();
        employee.setEmployeeId(3489);
        employee.setFirstName("Naveen");
        employee.setLastName("Hul");
        employee.setDept("075");
        employeeList.add(employee);
        Collections.sort(employeeList);
        return employeeList;
    }

    private Employee populateEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeId(12345);
        employee.setFirstName("Ravi");
        employee.setLastName("Banakar");
        employee.setDept("099");
        employee.setGender("M");
        employee.setDob("27-07-1990");
        return employee;
    }
}
