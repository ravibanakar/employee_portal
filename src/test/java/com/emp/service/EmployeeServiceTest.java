package com.emp.service;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;
import com.emp.vo.EmployeeVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService = new EmployeeService();

    @Mock
    private EmployeeRepository employeeRepository;

   @Before
   public void setUp() {
       MockitoAnnotations.initMocks(this);
   }

   @Test
    public void test_get_all_employees() {
       List<Employee> employees = new ArrayList<>();
       Employee employee = new Employee();
       employee.setEmployeeId(1234);
       employee.setFirstName("Ravi");
       employees.add(employee);
       Mockito.when(employeeRepository.findAll()).thenReturn(employees);
       List<EmployeeVo> expected = employeeService.getAllEmployees();
       Assert.assertEquals(expected.get(0).getFirstName(), "Ravi");
   }

   @Test
    public void test_register_employee() {
       Employee employee = new Employee();
       employee.setFirstName("Ravi");
       employee.setLastName("Banakar");
       Mockito.when(employeeRepository.save(Matchers.any(Employee.class))).thenReturn(employee);
       EmployeeVo employeeVo = new EmployeeVo();
       employeeVo.setFirstName("Ravi");
       employeeVo.setLastName("Banakar");
       String expected = employeeService.registerEmployee(employeeVo);
       System.out.println(expected);
       Assert.assertTrue(expected.contains("Banakar"));
   }
}
