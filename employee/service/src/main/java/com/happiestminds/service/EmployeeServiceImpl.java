package com.happiestminds.service;

import com.happiestminds.dto.EmployeeDTO;
import com.happiestminds.model.Employee;
import com.happiestminds.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<EmployeeDTO> getEmployees() {
        return employeeRepository.findAll().stream().map(employee -> {
            return new EmployeeDTO(employee.getId(), employee.getName(), employee.getDepartment(), employee.getEmail(),
                    employee.getPhoneNo(), employee.getJoiningDate());
        }).collect(Collectors.toList());
    }

    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        System.out.println("Hi");
        Employee employeeRequest = modelMapper.map(employeeDTO, Employee.class);
        employeeRepository.save(employeeRequest);
    }

}
