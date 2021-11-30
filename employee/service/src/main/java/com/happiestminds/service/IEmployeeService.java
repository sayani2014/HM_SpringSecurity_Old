package com.happiestminds.service;

import com.happiestminds.dto.EmployeeDTO;

import java.util.List;

public interface IEmployeeService {
    void addEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> getEmployees();
}
