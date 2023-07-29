package com.antonio.Employee.Management.system.Repository;

import com.antonio.Employee.Management.system.Modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Override
    Optional<Employee> findById(Long aLong);
}
