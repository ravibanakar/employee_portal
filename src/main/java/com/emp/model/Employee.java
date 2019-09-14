package com.emp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Comparator;

@Data
public class Employee implements Comparable<Employee>  {

    @JsonProperty("employee_id")
    private Integer employeeId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("date_of_birth")
    private String dob;
    @JsonProperty("department")
    private String dept;

    public int compareTo(Employee employee) {
        return Comparator
                .comparing(Employee::getDept)
                .thenComparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName)
                .compare(this, employee);
    }

}
