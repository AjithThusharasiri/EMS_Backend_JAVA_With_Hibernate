package com.example.emloyeems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int empID;
   private String empName;
   private String empAddress;
   private String empMNumber;
   private String empEPFNumber;
   private int status =1;
}
