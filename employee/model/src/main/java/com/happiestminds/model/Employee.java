package com.happiestminds.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "employee")
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;
    private String email;
    private String phoneNo;
    private LocalDate joiningDate;
}
