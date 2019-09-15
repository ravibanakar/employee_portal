package com.emp.controller;

import com.emp.service.EmployeeService;
import com.emp.vo.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     *  This method will get all the employees.
     *
     * @return
     */
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<EmployeeVo> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /**
     *  This method is for registering a new employee to the system.
     *
     * @param employeeVo
     * @return
     */
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String registerEmployee(@RequestBody EmployeeVo employeeVo) {
        return employeeService.registerEmployee(employeeVo);
    }

}
