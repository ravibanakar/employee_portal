package com.emp.service;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;
import com.emp.vo.EmployeeVo;
import org.apache.commons.beanutils.BeanUtils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class EmployeeService {

    private static final Logger LOGGER = Logger.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     *
     * @param employeeVo
     * @return
     */
    public String registerEmployee(EmployeeVo employeeVo) {
        Employee employee = employeeRepository.save(populateEmployee(employeeVo));
        return "Employee " + employee.getFirstName() + " " + employee.getLastName() + " registered successfully";
    }

    /**
     * This service method will return the list of all employees
     *
     * @return
     */
    public List<EmployeeVo> getAllEmployees() {
        List<EmployeeVo> employeeList = new ArrayList<>();
        List<Employee> employees = employeeRepository.findAll();
        LOGGER.info("employee.size=" + employees.size());
        for (Employee employee: employees) {
            employeeList.add(populateEmployeeVo(employee));
        }
        Collections.sort(employeeList);
        return employeeList;
    }

    private Employee populateEmployee(EmployeeVo employeeVo) {
        Employee employee = new Employee();
        try {
            BeanUtils.copyProperties(employee, employeeVo);
        } catch (IllegalAccessException e) {
            LOGGER.error("Exception occurred while copying the employee properties..", e);
        } catch (InvocationTargetException e) {
            LOGGER.error("Exception occurred while copying the employee properties..", e);
        }
        return employee;
    }

    private EmployeeVo populateEmployeeVo(Employee employee) {
        EmployeeVo employeeVo = new EmployeeVo();
        try {
            BeanUtils.copyProperties(employeeVo, employee);
        } catch (IllegalAccessException e) {
            LOGGER.error("Exception occurred while copying the employee properties..", e);
        } catch (InvocationTargetException e) {
            LOGGER.error("Exception occurred while copying the employee properties..", e);
        }
        return employeeVo;
    }
}
