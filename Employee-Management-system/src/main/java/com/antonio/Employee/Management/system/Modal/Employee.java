package com.antonio.Employee.Management.system.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true,updatable = false)
    private long Id;
    private String name;

    private String email;

    private String department;




}
