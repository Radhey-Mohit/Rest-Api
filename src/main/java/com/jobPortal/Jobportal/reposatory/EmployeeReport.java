package com.jobPortal.Jobportal.reposatory;

import com.jobPortal.Jobportal.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReport extends JpaRepository<Employee, Long> {
}
