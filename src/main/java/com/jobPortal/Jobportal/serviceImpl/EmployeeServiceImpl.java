package com.jobPortal.Jobportal.serviceImpl;

import com.jobPortal.Jobportal.entities.Employee;

import com.jobPortal.Jobportal.modal.EmployeeDto;
import com.jobPortal.Jobportal.reposatory.EmployeeReport;
import com.jobPortal.Jobportal.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployeeReport employeeReport;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){

        Employee employee = dtoToEmployee(employeeDto);
                Employee saveEmployee= this.employeeReport.save(employee);
        return this.employeeToDto(saveEmployee);
    }
    public  Employee dtoToEmployee(EmployeeDto employeeDto){
        Employee employee = this.modelMapper.map(employeeDto, Employee.class);
        return employee;
    }
    public  EmployeeDto employeeToDto (Employee employee){
        EmployeeDto employeeDto = this.modelMapper.map(employee, EmployeeDto.class);
        return employeeDto;
    }
}
