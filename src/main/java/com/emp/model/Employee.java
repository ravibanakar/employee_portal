package com.emp.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "employee")
@Data
public class Employee  {

    @Id
    @Field("_id")
    private String id;

    @Field ("employee_id")
    private Integer employeeId;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("gender")
    private String gender;

    @Field("date_of_birth")
    private String dob;

    @Field("department")
    private String dept;
    
}
