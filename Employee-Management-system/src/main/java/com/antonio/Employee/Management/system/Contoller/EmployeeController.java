package com.antonio.Employee.Management.system.Contoller;

import com.antonio.Employee.Management.system.Modal.Employee;
import com.antonio.Employee.Management.system.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController

@RequestMapping("/employee")

public class EmployeeController {

    @Autowired

    private EmployeeService employeeService;


    @PostMapping("/add")
    public ResponseEntity<Employee >addEmployee(@RequestBody Employee employee) {
         Employee addEmployee = employeeService.addEmployee(employee);
         return ResponseEntity.ok(addEmployee);
    }


    @GetMapping("/{Id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long Id) {
        return employeeService.getEmployeeById(Id);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        Employee updatedEmployeeInfo = employeeService.updateEmployee(id, updatedEmployee);
        if (updatedEmployeeInfo != null) {
            return ResponseEntity.ok(updatedEmployeeInfo);
        } else {
            return ResponseEntity.notFound().build();
        }

    }




    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Long id) {
        boolean deleted = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(deleted);
    }


}








