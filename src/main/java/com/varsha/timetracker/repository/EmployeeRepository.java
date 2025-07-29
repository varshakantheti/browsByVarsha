package com.varsha.timetracker.repository;

import com.varsha.timetracker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//primary key is Long therefore 2nd param is Long!
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
