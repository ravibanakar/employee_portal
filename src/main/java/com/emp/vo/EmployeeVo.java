package com.emp.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Comparator;

@Data
public class EmployeeVo implements Comparable<EmployeeVo>  {

    @JsonProperty("employee_id")
    private Integer employeeId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("gender")
    private String gender;

    @DateTimeFormat(pattern = "dd/mm/yyyy")
    @JsonProperty("date_of_birth")
    private String dob;

    @JsonProperty("department")
    private String dept;

    /**
     * Sort the Employees based on First Name
     *
     * @param employee
     * @return
     */
    public int compareTo(EmployeeVo employee) {
        return Comparator
                .comparing(EmployeeVo::getFirstName)
                .compare(this, employee);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EmployeeVo{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", dob='").append(dob).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
