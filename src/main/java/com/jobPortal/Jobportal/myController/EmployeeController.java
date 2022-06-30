package com.jobPortal.Jobportal.myController;

import com.jobPortal.Jobportal.modal.EmployeeDto;
import com.jobPortal.Jobportal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createemployee")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto createEmployeeDto = this.employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(createEmployeeDto, HttpStatus.CREATED);
    }
}
