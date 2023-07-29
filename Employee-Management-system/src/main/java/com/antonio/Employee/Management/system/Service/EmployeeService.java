package com.antonio.Employee.Management.system.Service;

import com.antonio.Employee.Management.system.Modal.Employee;
import com.antonio.Employee.Management.system.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EmployeeService {

    @Autowired

    private EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee) {

        return employeeRepo.save(employee);
    }


    public Optional<Employee> getEmployeeById(long Id) {
        return employeeRepo.findById(Id);
    }





        public Employee updateEmployee(Long id, Employee updatedEmployee) {
            Employee existingEmployee = employeeRepo.findById(id).orElse(null);
            if (existingEmployee != null) {
                existingEmployee.setName(updatedEmployee.getName());
                existingEmployee.setEmail(updatedEmployee.getEmail());
                existingEmployee.setDepartment(updatedEmployee.getDepartment());
                return employeeRepo.save(existingEmployee);
            }

                return null;

    }


        public boolean deleteEmployee(Long id) {
            if (employeeRepo.existsById(id)) {
                employeeRepo.deleteById(id);
                return true;
            }
            return false;
        }
    }








