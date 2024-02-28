//package com.example.Spring.controller;
//
//import com.example.Spring.model.Employee;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class EmployeeService {
//    List<Employee> employees=new ArrayList<>();
//
//    public  void createEmployees(){
//        employees.add(new Employee(1,"aaa","b"));
//        employees.add(new Employee(2,"bbb","c"));
//        employees.add(new Employee(3,"ccc","d"));
//    }
//
//
//    public List<Employee> getEmployees() {
//        createEmployees();
//        return employees;
//    }
//
//    public Employee findStudent(int id) {
//        Employee employee=employees.stream().filter(employee1 -> employee1.getId()==id).findFirst().get();
//        return  employee;
//    }
//}
