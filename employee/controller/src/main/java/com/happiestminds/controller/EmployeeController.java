package com.happiestminds.controller;

import com.happiestminds.dto.EmployeeDTO;
import com.happiestminds.repository.EmployeeRepository;
import com.happiestminds.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * POST method to add employee in database.
     */

    @PostMapping(value = "/addEmployee")
    public String addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println("Hi");
        employeeService.addEmployee(employeeDTO);
        return "Added";
    }

    /**
     * GET method to fetch all employees from database.
     */

    @GetMapping(value = "/getAllEmployees")
    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> employeeList = employeeService.getEmployees();
        return employeeList;
    }
}
